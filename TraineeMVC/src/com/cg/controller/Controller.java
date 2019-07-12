package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



import com.cg.entities.Trainee;
import com.cg.service.ITraineeService;



public class Controller {

	@Autowired
	private ITraineeService traineeService;
	
	@RequestMapping("/index.obj")
	public String getHomePage(Model model)
	{
		model.addAttribute("traineeList",traineeService.loadAll());//passing data from java to jsp
		model.addAttribute("traineeLoc",new String[]{"Mumbai","Pune","Chennai","Banglore"});
		model.addAttribute("traineeDom",new String[]{"JEE","DotNet","Testing","DotNetWithCloud"});
		model.addAttribute("trainee",new Trainee());//empty object
		return "index";
	}
}
