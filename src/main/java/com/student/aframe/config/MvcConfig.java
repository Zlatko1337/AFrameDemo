package com.student.aframe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/puzzle").setViewName("puzzle");
		registry.addViewController("/quizz").setViewName("quizz");
		registry.addViewController("/puzzle2").setViewName("puzzle2");
		registry.addViewController("/platformer").setViewName("platformer");
	}

}
