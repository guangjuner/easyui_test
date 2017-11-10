package com.myhealthgene.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.myhealthgene.entity.Item;
import com.myhealthgene.service.DemoService;

@Controller
@RequestMapping("demo")
public class DemoController {
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value = "queryTime", method = RequestMethod.GET)
	@ResponseBody
	public String queryTime(){
		String time = demoService.queryTime();
		return time;
	}
	
	@RequestMapping(value = "queryItems", method = RequestMethod.GET, produces = "text/html;charset=UTF-8")
	@ResponseBody
	public String queryItems(){
		List<Item> items = demoService.listItems();
		Gson gson = new GsonBuilder().serializeNulls().setPrettyPrinting().create();
		String result = gson.toJson(items);
		return result;
	}
}
