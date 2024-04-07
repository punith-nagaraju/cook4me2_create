package com.cook4me2.service;

import com.cook4me2.data.repo.Cooking_Resource_Repo;
import com.cook4me2.model.Cooked_Dish;
import com.cook4me2.model.Cooking_Resource;
import com.google.api.client.util.store.FileDataStoreFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;

@Component
public class Cooking_Resource_Service {

  /*  @Autowired
    Cooking_Resource_Repo_Mongo cookResourceRepoMongo;*/
    @Autowired
    Cooking_Resource_Repo cookResourceRepo;
    //create a method to get all the cook resources from the database
    public List<Cooking_Resource> getCookResource() {
       // cookResourceRepoMongo.findAll();
        return cookResourceRepo.findAll();
    }

    //create a method to get a cook resource by id
    public Cooking_Resource getCookResourceById(int id) {
        return cookResourceRepo.findById(id).orElse(null);
    }

    //create a method to add a cook resource
    public Cooking_Resource addCookResource(Cooking_Resource cookResource) {
        Cooked_Dish dish = new Cooked_Dish();
     /*   dish.setDishId(cookResource.getCookId());
        dish.setDishName(cookResource.getCookContact());
        dish.setDishType(cookResource.getCookDescription());
                //cookResourceRepoMongo.save(dish);*/
        return cookResourceRepo.save(cookResource);
    }

    //create a method to update a cook resource
    public Cooking_Resource updateCookResource(Cooking_Resource cookResource) {
        return cookResourceRepo.save(cookResource);
    }

    //create a method to delete a cook resource
    public String deleteCookResource(int id) {
        cookResourceRepo.deleteById(id);
        return "Cook Resource removed !! " + id;
    }

}
