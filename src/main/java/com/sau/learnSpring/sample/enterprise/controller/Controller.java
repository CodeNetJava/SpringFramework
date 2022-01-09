package com.sau.learnSpring.sample.enterprise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sau.learnSpring.sample.enterprise.business.BusinessService;

//sending response in right format
@RestController
public class Controller {

	@Autowired
	private BusinessService businessService;
	
	@GetMapping("/sau")
	public long displaySum() {
		return businessService.getSum();
	}
}