package com.app.rationwala.model;

import com.app.rationwala.dto.enums.ItemCategory;
import com.app.rationwala.dto.enums.itemPackageType;

import lombok.Data;

public @Data class Item {
	private String itemName;
	private String itemBrand;
	private ItemCategory itemCategory;
	private itemPackageType packageType;
	private String itemType;

}