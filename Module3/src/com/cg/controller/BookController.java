package com.cg.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Book;
import com.cg.entities.Hotel;
import com.cg.service.IBookService;



@Controller
public class BookController {

	@Autowired
	private IBookService bookService;
	
	@RequestMapping("/index.obj")
	public String getHomePage(Model model){
		model.addAttribute("hotelList",bookService.loadAll());
		model.addAttribute("hotel",new Hotel());
		return "index";
	}
	@RequestMapping(value="/bookHotel.obj")
	public String nextPage(@RequestParam String id, Model model)
	{
		model.addAttribute("hotel", bookService.findHotel(Integer.parseInt(id)));
		Book book= new  Book();
		book.setHotelId(Integer.parseInt(id));
		model.addAttribute("book",book);
		
		return "bookHotel";
	}
	@RequestMapping(value="/saveBooking.obj",method=RequestMethod.POST)
	public String save	(@ModelAttribute("book") @Valid Book book,BindingResult result, Model model){
		if(result.hasErrors())
		{
			return "bookHotel";
		}
		else
		{
			bookService.saveBooking(book);
			Hotel hotel= (Hotel) bookService.findHotel(book.getHotelId());
			model.addAttribute("hotel",hotel);
			return "success";
		}
	}
	
}
