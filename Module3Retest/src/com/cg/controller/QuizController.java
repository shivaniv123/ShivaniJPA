package com.cg.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.beans.Quiz;
import com.cg.service.IQuizService;




@Controller
public class QuizController {
	@Autowired
	private IQuizService quizService;
	
	public IQuizService getQuizService() {
		return quizService;
	}

	public void setQuizService(IQuizService quizService) {
		this.quizService = quizService;
	}
	
	@RequestMapping("/index")
	public String showHomePage() {
		return "index";
	}
	@RequestMapping("/AddQuestion")
	public ModelAndView showAddQues(Model model) {

		Quiz quiz = new Quiz();
		model.addAttribute("quesTopic",new String[]{"Maths","History","Science"});
		model.addAttribute("quesCat",new String[]{"Simple","Complex"});
		return new ModelAndView("addQuestion", "quiz", quiz);
	}
	@RequestMapping("/add")
	public ModelAndView add(
			@ModelAttribute("quiz") @Valid Quiz quiz,
			BindingResult result) {

		ModelAndView mv =null;

		if (!result.hasErrors()) {
			quiz = quizService.addQuiz(quiz);
			mv = new ModelAndView("addSuccess");
			mv.addObject("quesNo", quiz.getQuesNo());
			
		} else {
			mv = new ModelAndView("addQuestion", "quiz", quiz);
		}

		return mv;
	}
	
}
