package com.cg.controller;



import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cg.entities.Student;
import com.cg.service.StudentService;



@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/index.obj")
	public String getHomePage(Model model){
		model.addAttribute("stuList",studentService.loadAll());//passing data from java to jsp
		model.addAttribute("gender",new String[]{"Female","Male"});
		model.addAttribute("student",new Student());//empty object
		return "index";
		
	}

	@RequestMapping(value="/save.obj",method=RequestMethod.POST)
	public String saveEmployee(@Valid @ModelAttribute("student") Student student,BindingResult result, Model model){
		
		if(result.hasErrors())
		{
			return "index";}
		else
		{
			student =  studentService.save(student);
			model.addAttribute("message","student with id "+student.getStudentId()+" added successfully!");
			return "redirect:/index.obj";

		}
	}
}
