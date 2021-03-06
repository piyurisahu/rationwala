package com.app.rationwala.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.rationwala.dto.AuthorizeStaffRequest;
import com.app.rationwala.dto.AuthorizeStaffResponse;
import com.app.rationwala.dto.LoginRequest;
import com.app.rationwala.dto.LoginResponse;
import com.app.rationwala.dto.RegisterRequest;
import com.app.rationwala.dto.RegisterResponse;
import com.app.rationwala.dto.UpdateProfileRequest;
import com.app.rationwala.dto.UpdateProfileResponse;
import com.app.rationwala.dto.enums.Status;
import com.app.rationwala.service.AccountService;
import com.fasterxml.jackson.core.JsonProcessingException;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("account")
@Slf4j
@Api(tags = { "Account API" }, value="AccountController", description="This controller contains all APIs realted to account changes such as login, register or update profile.")
public class AccountController extends AbstractController {

	@Autowired
	private AccountService accountService;

	@Autowired
	private Environment env;

	@ApiOperation(value="This is health check for api")
	@GetMapping("/")
	public String index() {
		return "Please go to user methods";
	}

	@ApiOperation(value="This API updates the user personal details")
	@PostMapping(value = "profile/update", produces = "application/json")
	public ResponseEntity<UpdateProfileResponse> updateProfile(@RequestBody UpdateProfileRequest updateProfileRequest) {
		ResponseEntity<UpdateProfileResponse> res = null;
		try {
			log.debug(mapper.writeValueAsString(updateProfileRequest));
			if (updateProfileRequest.getUserProfile() == null) {
				throw new Exception();
			}
			UpdateProfileResponse ures = accountService.updateUser(updateProfileRequest);
			HttpStatus status = HttpStatus.OK;
			res = new ResponseEntity<UpdateProfileResponse>(ures, status);
		} catch (Exception e) {
			res = new ResponseEntity<UpdateProfileResponse>(HttpStatus.BAD_REQUEST);
			log.warn(env.getProperty("warn.exception.occurred"), ": ", e.getMessage());
			log.error(e.getStackTrace().toString());
		}
		return res;
	}
	@ApiOperation(value="Login(Seller/User) to Rationwala application ")
	@PostMapping(value = "login", produces = "application/json")
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
		ResponseEntity<LoginResponse> res = null;
		try {
			log.debug(mapper.writeValueAsString(loginRequest));
			if (loginRequest.getLoginCredential() == null) {
				throw new Exception();
			}
			LoginResponse lres = accountService.login(loginRequest);
			HttpStatus status = HttpStatus.OK;
			if (Status.FAILURE.equals(lres.getStatusInfo().getStatus()))
				status = HttpStatus.NOT_FOUND;
			res = new ResponseEntity<LoginResponse>(accountService.login(loginRequest), status);
		} catch (Exception e) {
			res = new ResponseEntity<LoginResponse>(HttpStatus.BAD_REQUEST);
			log.warn(env.getProperty("warn.exception.occurred"), ": ", e.getMessage());
			log.error(e.getStackTrace().toString());
		}
		return res;
	}

	@ApiOperation(value="Register User in Rationwala application")
	@PostMapping(value = "register", produces = "application/json")
	public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest) {
		ResponseEntity<RegisterResponse> res = null;
		try {
			log.debug(mapper.writeValueAsString(registerRequest));
			res = new ResponseEntity<RegisterResponse>(accountService.register(registerRequest), HttpStatus.OK);
		} catch (JsonProcessingException e) {
			res = new ResponseEntity<RegisterResponse>(HttpStatus.BAD_REQUEST);
			log.warn(env.getProperty("warn.exception.occurred"), ": ", e.getMessage());
			log.error(e.getStackTrace().toString());
		}
		return res;
	}

	@ApiOperation(value="Authorize users")
	@PostMapping(value = "authorize", produces = "application/json")
	public ResponseEntity<AuthorizeStaffResponse> authorizestaff(
			@RequestBody AuthorizeStaffRequest authorizeStaffRequest) {
		ResponseEntity<AuthorizeStaffResponse> res = null;
		try {
			log.debug(mapper.writeValueAsString(authorizeStaffRequest));
			AuthorizeStaffResponse ares = accountService.authorizeStaff(authorizeStaffRequest);
			HttpStatus status = HttpStatus.OK;
			if (Status.FAILURE.equals(ares.getStatusInfo().getStatus()))
				status = HttpStatus.NOT_FOUND;
			res = new ResponseEntity<AuthorizeStaffResponse>(ares, status);
		} catch (JsonProcessingException e) {
			res = new ResponseEntity<AuthorizeStaffResponse>(HttpStatus.BAD_REQUEST);
			log.warn(env.getProperty("warn.exception.occurred"), ": ", e.getMessage());
			log.error(e.getStackTrace().toString());
		}
		return res;
	}
}