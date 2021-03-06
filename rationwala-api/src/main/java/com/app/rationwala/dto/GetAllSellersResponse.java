package com.app.rationwala.dto;

import java.util.List;

import com.app.rationwala.model.StatusInfo;
import com.app.rationwala.model.UserProfile;

import lombok.Data;

public @Data class GetAllSellersResponse {
	private List<UserProfile> sellerProfiles;
	private StatusInfo statusInfo;
}
