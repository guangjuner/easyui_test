package com.myhealthgene.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myhealthgene.entity.Item;
import com.myhealthgene.mapper.DemoMapper;
import com.myhealthgene.service.DemoService;
@Service
public class DemoServiceImpl implements DemoService{
	@Autowired
	private DemoMapper demoMapper;
	
	public String queryTime() {
		String time = demoMapper.queryTime();
		return time;
	}
	
	@Override
	public List<Item> listItems() {
		List<Item> items = demoMapper.listItems();
		return items;
	}
}
