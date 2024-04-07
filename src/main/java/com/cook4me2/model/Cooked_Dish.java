package com.cook4me2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter@Getter @AllArgsConstructor @NoArgsConstructor
//@Document("cooked_dish")
@Entity
public class Cooked_Dish {

    @Id
    private int dishId;
    private String dishName;
    private String dishType;
    private String dishCategory;
    private String dishDescription;
    private String dishImage;
    private String dishIngredients;
    private String dishInstructions;
    private String dishCookTime;
    private String dishGeoLocation;

    @ManyToOne
    private Cooking_Resource cookResource;

}
