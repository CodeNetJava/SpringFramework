package com.sau.learnSpring.sample.enterprise.data;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
//Getting data
 public class DataService {

	public List<Integer> getData() {
		// TODO Auto-generated method stub
		return List.of(10,20,30,40);
	}
	 
 }