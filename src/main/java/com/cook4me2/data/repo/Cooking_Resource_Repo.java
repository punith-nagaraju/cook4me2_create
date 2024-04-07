package com.cook4me2.data.repo;

import com.cook4me2.model.Cooking_Resource;

//create a spring JPA repository for the cook resource model
public interface Cooking_Resource_Repo extends org.springframework.data.jpa.repository.JpaRepository<Cooking_Resource, Integer> {
}