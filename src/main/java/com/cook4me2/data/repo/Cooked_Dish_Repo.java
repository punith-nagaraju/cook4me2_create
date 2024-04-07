package com.cook4me2.data.repo;

import com.cook4me2.model.Cooked_Dish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface Cooked_Dish_Repo extends JpaRepository<Cooked_Dish, Integer>{
    Optional<List<Cooked_Dish>> findByDishType(String dishType);
}
