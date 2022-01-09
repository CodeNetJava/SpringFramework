package com.sau.learnSpring.sample.enterprise.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sau.learnSpring.sample.enterprise.data.DataService;

@Component
//business logic
 public class BusinessService {
	
	 @Autowired
	private DataService dataService;

	public long getSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
	}
	
}