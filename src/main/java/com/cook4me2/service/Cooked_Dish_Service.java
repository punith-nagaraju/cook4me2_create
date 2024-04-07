package com.cook4me2.service;

import com.cook4me2.data.repo.Cooked_Dish_Repo;
import com.cook4me2.model.Cooked_Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cooked_Dish_Service {

    @Autowired
    Cooked_Dish_Repo cookDishRepo;

    public Cooked_Dish addCookedDish(Cooked_Dish cookDish) {
        return cookDishRepo.save(cookDish);
    }

    public Cooked_Dish updateCookedDish(Cooked_Dish cookDish) {
        return cookDishRepo.save(cookDish);
    }

    public String deleteCookedDish(int id) {
        cookDishRepo.deleteById(id);
        return "Cooked Dish removed !! " + id;
    }

    public Cooked_Dish getCookedDishById(int id) {
        return cookDishRepo.findById(id).orElse(null);
    }

    public Iterable<Cooked_Dish> getCookedDish() {
        return cookDishRepo.findAll();
    }

    public Iterable<Cooked_Dish> getCookedDishByType(String dishType) {
        return cookDishRepo.findByDishType(dishType).orElse(null);
    }
}
