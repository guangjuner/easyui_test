package com.myhealthgene.mapper;

import java.util.List;

import com.myhealthgene.entity.Item;

public interface DemoMapper {
	/**
	 * 查询数据库时间
	 * 
	 * @return
	 */
	public String queryTime();
	
	/**
	 * 查询所有商品信息
	 * 
	 * @return
	 */
	public List<Item> listItems();
}
