package com.app.rationwala.util;

import java.util.stream.IntStream;

import com.app.rationwala.dto.enums.ItemCategoryType;
import com.app.rationwala.dto.enums.ItemPackageType;
import com.app.rationwala.dto.enums.ItemUnitType;
import com.app.rationwala.dto.enums.StaffAuthType;
import com.app.rationwala.entity.Item;
import com.app.rationwala.entity.StaffAuth;
import com.app.rationwala.entity.UserLogin;
import com.app.rationwala.entity.UserProfile;
import com.app.rationwala.repository.ItemInventoryRepository;
import com.app.rationwala.repository.ItemRepository;
import com.app.rationwala.repository.StaffAuthRepository;
import com.app.rationwala.repository.UserProfileRepository;

public class MockDataInDB {

	public static void pushUserData(UserProfileRepository repo) {
		// Seller profiles
		repo.save(new UserProfile(new UserLogin("Seller1", "admin"), "Tarun",
				"Gupta", "tarung@abc.com" , "9494942354", "XYZ Gomti Nagar",
				"Lucknow","Lucknow","UP", "12345", true, "Gupta General Store",
				"https://image.winudf.com/v2/image/Y29tLmFwcGxvcC5yYWplc2hndXB0YTg4OTIxODc2MDg1Ml8zMTk1MTBfc2NyZWVuc2hvdHNfMV9iNjkzMDliYQ/screen-1.jpg?fakeurl=1&type=.jpg"));

		repo.save(new UserProfile(new UserLogin("Seller2", "admin"), "Kiran",
				"Arora", "kirana@abc.com" , "9494987654", "5/7 Vinay Khand",
				"Lucknow","Lucknow","UP", "12365", true, "Arora Departmental Store",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQd_c_JNmyN0j9fVy9m7IV_CQmkos1W8DiTjg&usqp=CAU"));

		repo.save(new UserProfile(new UserLogin("Seller3", "admin"), "Vikas",
				"Malik", "vikasM@abc.com" , "9484987654", "55 Shaheed ChandraShekhar Chowk",
				"Gomti Nagar, Lucknow","Lucknow","UP", "226010", true, "Mr brown Ration Mall",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTxr950m8b7rsKm7HzstqoU-TckkPXH3pS4A&usqp=CAU"));


		repo.save(new UserProfile(new UserLogin("Seller4", "admin"), "Tanushree",
				"Gupta", "TanuSh@abc.com" , "9484987772", "67/5 Indira Nagar ",
				"Sector 14, Lucknow","Lucknow","UP", "226011", true, "1 Stop Grocery",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSR5L1WsZI0CJqnaQZ4yi4cvWDmuW_RypHxRA&usqp=CAU"));


		repo.save(new UserProfile(new UserLogin("Seller5", "admin"), "Sonu",
				"Khan", "SonuK@abc.com" , "9484828200", "Shop no 123, metro Plaza",
				"Metro station, Lucknow","Lucknow","UP", "226016", true, "EveryDay Mart ",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ-x9aYHLiRPUn8Oua4_XcAdEkkr-34ibpfew&usqp=CAU"));



		repo.save(new UserProfile(new UserLogin("Seller6", "admin"), "Rakesh",
				"Yadav", "rakeshY@abc.com" , "9484828772", "C-1/2, Sahara State Road",
				"Sector G, Lucknow","Lucknow","UP", "226021", true, "Easyday Club ",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQGCsWjT2zpTF083A6p819zwMBCdzN2ZwNH5g&usqp=CAU"));


		repo.save(new UserProfile(new UserLogin("Seller7", "admin"), "Raman",
				"Sahu", "ramanS@abc.com" , "9484833772", "6/9, Nayak Nagar",
				"Sitapur Road, Lucknow","Lucknow","UP", "226021", true, "Day to Day mart",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSqdcS0orxAoeHhsA26MxrquoVrhljf4wTGRg&usqp=CAU"));


		repo.save(new UserProfile(new UserLogin("Seller8", "admin"), "Kapil",
				"Mishra", "kapilM@abc.com" , "9484833000", "Ring Road, Near Cocacola Goadam",
				"Vikas Nagar, Lucknow","Lucknow","UP", "226022", true, "Family Bazar",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQexHrpxpKEcbPH9T33GzzyH6RbBpg1TyXBQQ&usqp=CAU"));



		repo.save(new UserProfile(new UserLogin("Seller9", "admin"), "Anjali",
				"Tripathi", "anjaliT@abc.com" , "94849468730", "3/48, Mansarovar Yojna",
				"Jalvayu Vihar Phase 2, Lucknow","Lucknow","UP", "226010", true, "All Season Fresh Mart",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS0P7Vh_j-jcmtVmdMl7DlicIqNmIynUN_Fkw&usqp=CAU"));



		repo.save(new UserProfile(new UserLogin("Seller10", "admin"), "Lucky",
				"Sachdeva", "luckyS@abc.com" , "94849473777", "HG-94, LDA Colony",
				"Kanpur Road, Lucknow","Lucknow","UP", "226012", true, "Sachdeva Store",
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTliNOeoaee5Ec3JRcf5ElPdeg7YiI8ir9tZQ&usqp=CAU"));

		// User profiles
		IntStream.range(1, 11)
				.forEach(userId -> repo.save(new UserProfile(new UserLogin("user" + userId, "admin"),
						"Firstname" + userId, "Lastname", "user" + userId + "@abc.com", "123456789",
						"user" + userId + "add1", "user" + userId + "add2","Lucknow","UP", "12345")));

		// Staff profiles
		IntStream.range(1, 11)
				.forEach(userId -> repo.save(new UserProfile(new UserLogin("staffUser" + userId, "admin"),
						"staffFirstname" + userId, "staffLastname", "staffUser" + userId + "@abc.com", "123456789",
						"staffUser" + userId + "add1", "staffUser" + userId + "add2","Lucknow","UP", "12345")));

	}

	public static void pushStaffAuthorization(StaffAuthRepository staffAuthRepository) {
		staffAuthRepository
				.save(new StaffAuth(new UserProfile(1L), new UserProfile(21L), StaffAuthType.INVENTORY.name()));
	}

	public static void pushItem(ItemRepository repo, ItemInventoryRepository itemInventoryRepository) {
		Item item ;
		item = repo.save(new Item("Coconut Oil", "O'range",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 219.0, 20, 500,
				ItemUnitType.ML.toString());
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 250.0, 10, 600, ItemUnitType.ML.toString());

		item = repo.save(new Item("Water Bottle", "Bisleri",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 10.0, 800, 500, ItemUnitType.ML.toString());
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 30.0, 500, 2, ItemUnitType.LITER.toString());
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 80.0, 100, 20, ItemUnitType.LITER.toString());


		item = repo.save(new Item("Chakki Atta", "Ashirvaad",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 206.0, 40, 5, ItemUnitType.KILO_GRAM.toString());
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 51.0, 100, 1, ItemUnitType.KILO_GRAM.toString());

		item  = repo.save(new Item("Salt", "Tata",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 40.0, 200, 1, ItemUnitType.KILO_GRAM.toString());

		item = repo.save(new Item("Mustard Oil", "Fortune",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 733.0, 40, 5, ItemUnitType.LITER.toString());
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 170.0, 80, 1, ItemUnitType.LITER.toString());

		item = repo.save(new Item("Hing", "Patanjali",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 40.0, 100, 25, ItemUnitType.GRAM.toString());

		item = repo.save(new Item("Moong Dal", "Family Farm",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 160.0, 40, 1, ItemUnitType.KILO_GRAM.toString());

		item = repo.save(new Item("Pure Ghee", "Amul",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 500.0, 90, 1, ItemUnitType.LITER.toString());
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 275.0, 200, 500, ItemUnitType.ML.toString());

		item = repo.save(new Item("Munch", "Nestle",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 20.0, 1000, 35,ItemUnitType.GRAM.toString());
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 100.0, 500, 222, ItemUnitType.GRAM.toString());

		item = repo.save(new Item("Basmati Rice", "Kohinoor Royal",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 98.0, 100, 1, ItemUnitType.KILO_GRAM.toString());
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 348.0, 100, 5, ItemUnitType.KILO_GRAM.toString());

		item = repo.save(new Item("Maggi Masala Magic", "Maggi",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 52.0, 300, 72, ItemUnitType.GRAM.toString());
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 10.0, 500, 12, ItemUnitType.GRAM.toString());

		item = repo.save(new Item("Chyawanprash", "Dabur",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 323.0, 100, 1, ItemUnitType.KILO_GRAM.toString());

		item = repo.save(new Item("Rajma", "Chithra",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 120.0, 50, 1, ItemUnitType.KILO_GRAM.toString());

		item = repo.save(new Item("Magic Masala", "Sunfeast",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 50.0, 400, 72, ItemUnitType.GRAM.toString());
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 12.0, 500, 15, ItemUnitType.GRAM.toString());

		item = repo.save(new Item("Green chilly Chutney", "Pravin",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 125.0, 150, 210, ItemUnitType.KILO_GRAM.toString());
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 70.0, 100, 100, ItemUnitType.KILO_GRAM.toString());

		item = repo.save(new Item("Green Chilly Chutney", "Food Art Factory",
				ItemCategoryType.EATABLE.name(), ItemPackageType.BRAND_PACKAGED.name(), "ItemType"));
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 140.0, 200, 250, ItemUnitType.KILO_GRAM.toString());
		MockDataDB2.pushInventoryData(itemInventoryRepository, item, 40.0, 600, 50, ItemUnitType.KILO_GRAM.toString());

	}

//	public static void pushInventory(ItemInventoryRepository repo) {
//		LongStream.range(1, 11).forEach(i -> {
//			IntStream.range(1, 11)
//					.forEach(j -> repo.save(new ItemInventory(new UserProfile(i), new Item(Long.parseLong(j + "")),
//							"Item seller description", Double.parseDouble(i + ""), j, j, ItemUnitType.COUNT.name())));
//		});
//	}
}
