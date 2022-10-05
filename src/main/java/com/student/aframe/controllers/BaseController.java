package com.student.aframe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
    
	@GetMapping("/index")
	public String showIndex(Model model) {
		return "index";
	}
	
	@GetMapping("/puzzle")
	public String showPuzzle(Model model) {
		return "puzzle";
	}
	
	@GetMapping("/quizz")
	public String showQuizz(Model model) {
		return "quizz";
	}
	
	@GetMapping("/puzzle2")
	public String showPuzzle2(Model model) {
		return "puzzle2";
	}
	
	@GetMapping("/platformer")
	public String showPlatformer(Model model) {
		return "platformer";
	}
    
	@GetMapping("/test")
	public String showTest(Model model) {
		return "test";
	}
	
}
