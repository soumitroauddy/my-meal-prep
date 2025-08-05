package com.magistrati.mymealprepper.controller;

import org.springframework.web.bind.annotation.*;

/**
 * REST controller for meal-related operations
 */
@RestController
@RequestMapping("/api/meals")
@CrossOrigin(origins = "*")
public class MealController {

    @GetMapping("/health")
    public String health() {
        return "Meal Prepper API is running!";
    }
} 