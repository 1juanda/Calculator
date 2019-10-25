package com.informatica.calculadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.informatica.calculadora.services.BasicCalculatorService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("calculator")
public class CalculatorController {

	@Autowired
	private BasicCalculatorService basicCalculatorService;

	@GetMapping("/health")
	public String health() {
		return "OK";
	}

	@GetMapping("/add")
	public int getAdd (@RequestParam int param1, @RequestParam int param2){
		return basicCalculatorService.add(param1, param2);
	}

	@GetMapping("/substract")
	public int getSubstract (@RequestParam int param1, @RequestParam int param2){
		return basicCalculatorService.substract(param1, param2);
	}

	@GetMapping("/multiply")
	public int getMultiply (@RequestParam int param1, @RequestParam int param2){
		return basicCalculatorService.multiply(param1, param2);
	}

	@GetMapping("/divide")
	public ResponseEntity<String> getDivide (@RequestParam int param1, @RequestParam int param2){
		return basicCalculatorService.divide(param1, param2);
	}

}
