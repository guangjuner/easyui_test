package com.myhealthgene.entity;

import java.io.Serializable;

public class Item implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer itemId;
	private String itemName;
	private String itemDesc;

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDesc() {
		return itemDesc;
	}

	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}

}
