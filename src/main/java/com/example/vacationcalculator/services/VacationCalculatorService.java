package com.example.vacationcalculator.services;

import org.springframework.stereotype.Service;

//Business Level Service Logics
@Service
public class VacationCalculatorService {

    public double calculate(double averageSalary, int numberOfVacationDays){

        return averageSalary / 12 / 29.3 * numberOfVacationDays;
    }
}
