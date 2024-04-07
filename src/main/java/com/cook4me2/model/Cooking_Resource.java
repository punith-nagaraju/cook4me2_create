package com.cook4me2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter @AllArgsConstructor @NoArgsConstructor
@Entity
@JsonIgnoreProperties
public class Cooking_Resource {

    @Id
    @Getter
    @GeneratedValue
    private int resourceId;

    @Getter
    private String cookName;

    @Getter
    @Setter
    private String cookSpeciality;

    @Getter
    @Setter
    private int cookExperience;

    @Getter
    @Setter
    private int cookRating;

    @Getter
    @Setter
    private int cookSalary;

    @Getter
    @Setter
    private String cookType;

    @Getter
    @Setter
    private String cookLocation;

    @Getter
    @Setter
    private String cookImage;

    @Getter
    @Setter
    private String cookDescription;

    @Getter
    @Setter
    private String cookContact;

    @Getter
    @Setter
    private String cookEmail;

}
