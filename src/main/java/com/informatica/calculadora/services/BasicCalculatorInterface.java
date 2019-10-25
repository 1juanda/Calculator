package com.informatica.calculadora.services;

import org.springframework.http.ResponseEntity;

public interface BasicCalculatorInterface {

    int add(int param1, int param2);

    int substract (int param1, int param2);

    int multiply (int param1, int param2);

    ResponseEntity <String> divide (int param1, int param2);

}
