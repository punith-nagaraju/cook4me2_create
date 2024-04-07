package com.cook4me2.resources;


import com.cook4me2.model.Cooking_Resource;
import com.cook4me2.service.Cooking_Resource_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Cooking_Resource_Controller {

@Autowired
    private Cooking_Resource_Service cookResourceService;

    @PostMapping("/addCookingResource")
    public Cooking_Resource addCookResource(@RequestBody Cooking_Resource cookResource) {
        return cookResourceService.addCookResource(cookResource);
    }

    @GetMapping("/getCookingResource/{id}")
   public Cooking_Resource getCookResource(@PathVariable  int id) {
        return cookResourceService.getCookResourceById(id);
    }

    @PutMapping("/updateCookingResource")
    public Cooking_Resource updateCookResource(@RequestBody Cooking_Resource cookResource) {
        return cookResourceService.updateCookResource(cookResource);
    }

    //create a DELETE rest endpoint for the cook resource
    @DeleteMapping("/deleteCookingResource/{id}")
    public String deleteCookResource(@PathVariable int id) {
        return cookResourceService.deleteCookResource(id);
    }


}
