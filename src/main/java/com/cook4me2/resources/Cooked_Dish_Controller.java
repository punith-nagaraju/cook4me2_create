package com.cook4me2.resources;


import com.cook4me2.model.Cooked_Dish;
import com.cook4me2.service.Cooked_Dish_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Cooked_Dish_Controller {
    
    @Autowired
    private Cooked_Dish_Service cookDishService;
    
    @PostMapping("/addCookedDish")
    public Cooked_Dish addCookedDish(@RequestBody  Cooked_Dish cookDish) {
        return cookDishService.addCookedDish(cookDish);
    }

    @GetMapping("/getCookedDish/{id}")
    public  Cooked_Dish getCookedDish(@PathVariable int id) {
        return cookDishService.getCookedDishById(id);
    }

    @PutMapping("/updateCookedDish")
    public  Cooked_Dish updateCookedDish(@RequestBody  Cooked_Dish cookDish) {
        return cookDishService.updateCookedDish(cookDish);
    }

    @DeleteMapping("/deleteCookedDish/{id}")
    public String deleteCookedDish(@PathVariable int id) {
        return cookDishService.deleteCookedDish(id);
    }

    @GetMapping("/getCookedDishByType/{dishType}")
    public Iterable< Cooked_Dish> getCookedDishByType(@PathVariable String dishType) {
        return cookDishService.getCookedDishByType(dishType);
    }




}
