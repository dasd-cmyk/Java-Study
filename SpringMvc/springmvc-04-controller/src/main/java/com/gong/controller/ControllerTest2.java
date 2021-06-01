package com.gong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class ControllerTest2 {
	@RequestMapping("/t2")
	public String test1(Model model){
		model.addAttribute("msg","dsadasd");
		return "test";
	}

	@RequestMapping("t3")
	public String test2(Model model){
		model.addAttribute("msg","test2");

		return "test";


	}


}
