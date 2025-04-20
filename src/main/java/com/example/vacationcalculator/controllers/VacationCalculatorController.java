package com.example.vacationcalculator.controllers;

import com.example.vacationcalculator.services.VacationCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculator")
public class VacationCalculatorController {

    @Autowired
    private VacationCalculatorService vacationCalculatorService;

    @GetMapping("/calculate")
    public double vacationCalculateOperation(@RequestParam("averageSalary") Double averageSalary, @RequestParam("numberOfVacationDays") Integer numberOfVacationDays){
        return vacationCalculatorService.calculate(averageSalary, numberOfVacationDays);
    }
}
