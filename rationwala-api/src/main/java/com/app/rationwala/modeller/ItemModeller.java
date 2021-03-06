package com.app.rationwala.modeller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.rationwala.dto.enums.ItemCategoryType;
import com.app.rationwala.dto.enums.ItemPackageType;
import com.app.rationwala.dto.enums.ItemUnitType;
import com.app.rationwala.entity.UserProfile;
import com.app.rationwala.model.Item;
import com.app.rationwala.model.ItemInventory;

public class ItemModeller extends AbstractModeller {
	
	@Autowired
	ProfileModeller profileModeller;

	public List<ItemInventory> marshallItemInventory(Set<com.app.rationwala.entity.ItemInventory> itemInvent) {
		final List<ItemInventory> itemInventoryList;
		if (isNotNull(itemInvent) && !itemInvent.isEmpty()) {
			itemInventoryList = new ArrayList<>();
			itemInvent.forEach(itemInv -> {
				ItemInventory itemInventory = new ItemInventory();
				itemInventory.setId(itemInv.getId());
				itemInventory.setDescription(itemInv.getDescription());
				itemInventory.setPrice(itemInv.getPrice());
				itemInventory.setCountInStock(itemInv.getCountInStock());
				itemInventory.setQuantity(itemInv.getQuantity());
				itemInventory.setUnit(ItemUnitType.valueOf(itemInv.getUnit()));
				if (isNotNull(itemInv.getItem())) {
					itemInventory.setItem(new Item());
					itemInventory.getItem().setItemId(itemInv.getItem().getId());
					itemInventory.getItem().setItemBrand(itemInv.getItem().getItemBrand());
					itemInventory.getItem()
							.setItemCategory(ItemCategoryType.valueOf(itemInv.getItem().getItemCategory()));
					itemInventory.getItem().setItemName(itemInv.getItem().getItemName());
					itemInventory.getItem().setItemType(itemInv.getItem().getItemType());
					itemInventory.getItem().setPackageType(ItemPackageType.valueOf(itemInv.getItem().getPackageType()));
				}
				itemInventoryList.add(itemInventory);
			});
		} else {
			itemInventoryList = null;
		}
		return itemInventoryList;
	}

	public List<ItemInventory> marshallItemInventory(List<com.app.rationwala.entity.ItemInventory> itemInvent) {
		final List<ItemInventory> itemInventoryList;
		if (isNotNull(itemInvent) && !itemInvent.isEmpty()) {
			itemInventoryList = new ArrayList<>();
			itemInvent.forEach(itemInv -> {
				ItemInventory itemInventory = new ItemInventory();
				itemInventory.setId(itemInv.getId());
				itemInventory.setDescription(itemInv.getDescription());
				itemInventory.setPrice(itemInv.getPrice());
				itemInventory.setCountInStock(itemInv.getCountInStock());
				itemInventory.setQuantity(itemInv.getQuantity());
				itemInventory.setUnit(ItemUnitType.valueOf(itemInv.getUnit()));
				if (isNotNull(itemInv.getItem())) {
					itemInventory.setItem(new Item());
					itemInventory.getItem().setItemId(itemInv.getItem().getId());
					itemInventory.getItem().setItemBrand(itemInv.getItem().getItemBrand());
					itemInventory.getItem()
							.setItemCategory(ItemCategoryType.valueOf(itemInv.getItem().getItemCategory()));
					itemInventory.getItem().setItemName(itemInv.getItem().getItemName());
					itemInventory.getItem().setItemType(itemInv.getItem().getItemType());
					itemInventory.getItem().setPackageType(ItemPackageType.valueOf(itemInv.getItem().getPackageType()));
				}
				itemInventory.setSellerProfile(profileModeller.marshallUserProfile(itemInv.getSellerProfile()));
				itemInventoryList.add(itemInventory);
			});
		} else {
			itemInventoryList = null;
		}
		return itemInventoryList;
	}

	public List<com.app.rationwala.entity.ItemInventory> unMarshallItemInventory(List<ItemInventory> itemInvent) {
		final List<com.app.rationwala.entity.ItemInventory> itemInventoryList;
		if (isNotNull(itemInvent) && !itemInvent.isEmpty()) {
			itemInventoryList = new ArrayList<>();
			itemInvent.forEach(itemInv -> {
				com.app.rationwala.entity.ItemInventory itemInventory = new com.app.rationwala.entity.ItemInventory();
				itemInventory.setId(itemInv.getId());
				itemInventory.setDescription(itemInv.getDescription());
				itemInventory.setPrice(itemInv.getPrice());
				itemInventory.setCountInStock(itemInv.getCountInStock());
				itemInventory.setQuantity(itemInv.getQuantity());
				itemInventory.setUnit(itemInv.getUnit().name());
				itemInventory.setItem(new com.app.rationwala.entity.Item());
				itemInventory.getItem().setId(itemInv.getItem().getItemId());
				itemInventory.setSellerProfile(new UserProfile());
				itemInventory.getSellerProfile().setId(itemInv.getSellerProfile().getUserProfileId());
				itemInventoryList.add(itemInventory);
			});
		} else {
			itemInventoryList = null;
		}
		return itemInventoryList;
	}

	/*
	 * public List<com.app.rationwala.entity.ItemInventory>
	 * unMarshallItemInventory(List<ItemInventory> itemInvent) { final
	 * List<com.app.rationwala.entity.ItemInventory> itemInventoryList; if
	 * (isNotNull(itemInvent) && !itemInvent.isEmpty()) { itemInventoryList = new
	 * ArrayList<>(); itemInvent.forEach(itemInv -> {
	 * com.app.rationwala.entity.ItemInventory itemInventory = new
	 * com.app.rationwala.entity.ItemInventory();
	 * itemInventory.setId(itemInv.getId());
	 * itemInventory.setDescription(itemInv.getDescription());
	 * itemInventory.setPrice(itemInv.getPrice());
	 * itemInventory.setCountInStock(itemInv.getCountInStock());
	 * itemInventory.setQuantity(itemInv.getQuantity());
	 * itemInventory.setUnit(itemInv.getUnit().name()); if
	 * (isNotNull(itemInv.getItem())) { itemInventory.setItem(new
	 * com.app.rationwala.entity.Item());
	 * itemInventory.getItem().setId(itemInv.getItem().getItemId());
	 * itemInventory.getItem().setItemBrand(itemInv.getItem().getItemBrand());
	 * itemInventory.getItem().setItemCategory(itemInv.getItem().getItemCategory().
	 * name());
	 * itemInventory.getItem().setItemName(itemInv.getItem().getItemName());
	 * itemInventory.getItem().setItemType(itemInv.getItem().getItemType());
	 * itemInventory.getItem().setPackageType(itemInv.getItem().getPackageType().
	 * name()); } itemInventoryList.add(itemInventory); }); } else {
	 * itemInventoryList = null; } return itemInventoryList; }
	 * 
	 * public com.app.rationwala.entity.ItemInventory
	 * unMarshallItemInventory(ItemInventory itemInv) { final
	 * com.app.rationwala.entity.ItemInventory itemInventory; if
	 * (isNotNull(itemInv)) { itemInventory = new
	 * com.app.rationwala.entity.ItemInventory();
	 * itemInventory.setId(itemInv.getId());
	 * itemInventory.setDescription(itemInv.getDescription());
	 * itemInventory.setPrice(itemInv.getPrice());
	 * itemInventory.setCountInStock(itemInv.getCountInStock());
	 * itemInventory.setQuantity(itemInv.getQuantity());
	 * itemInventory.setUnit(itemInv.getUnit().name()); if
	 * (isNotNull(itemInv.getItem())) { itemInventory.setItem(new
	 * com.app.rationwala.entity.Item());
	 * itemInventory.getItem().setId(itemInv.getItem().getItemId());
	 * itemInventory.getItem().setItemBrand(itemInv.getItem().getItemBrand());
	 * itemInventory.getItem().setItemCategory(itemInv.getItem().getItemCategory().
	 * name());
	 * itemInventory.getItem().setItemName(itemInv.getItem().getItemName());
	 * itemInventory.getItem().setItemType(itemInv.getItem().getItemType());
	 * itemInventory.getItem().setPackageType(itemInv.getItem().getPackageType().
	 * name()); } } else { itemInventory = null; } return itemInventory; }
	 */
}
