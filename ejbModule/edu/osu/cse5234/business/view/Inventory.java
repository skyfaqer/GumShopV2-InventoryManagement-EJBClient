package edu.osu.cse5234.business.view;

import java.io.Serializable;
import java.util.List;

public class Inventory implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8128953636044358640L;
	
	private List<Item> itemList;
	
	public List<Item> getItemList() {
		return itemList;
	}
	
	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
}
