package com.informatica.calculadora.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service("BasicCalculator")
public class BasicCalculatorService implements BasicCalculatorInterface {

	@Override
	public int add(int param1, int param2) {
		return param1 + param2;
	}

	@Override
	public int substract(int param1, int param2) {
		return param1 - param2;
	}

	@Override
	public int multiply(int param1, int param2) {
		return param1 * param2;
	}

	@Override
	public ResponseEntity<String> divide(int param1, int param2) {
		if (param2 == 0) {
			return new ResponseEntity<String>("{\"message\":\"No se puede dividir por cero!!!\"}", HttpStatus.BAD_REQUEST) ;
		}
		return new ResponseEntity<String>("{\"message\":" +(double) param1 / param2+ "}", HttpStatus.OK) ;
	}
}
