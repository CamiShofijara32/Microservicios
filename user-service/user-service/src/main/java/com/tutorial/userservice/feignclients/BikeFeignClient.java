package com.tutorial.userservice.feignclients;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tutorial.userservice.entity.User;
import com.tutorial.userservice.model.Bike;
import com.tutorial.userservice.model.Car;



@FeignClient(name = "bike-service", url="http://localhost:8003")
@RequestMapping("/bike")
public interface BikeFeignClient {
	
	@PostMapping()
	Bike save(@RequestBody Bike bike);
	@GetMapping("/byuser/{userId}")
	List<Bike> getBikes(@PathVariable("userId") int userId);

	
}
