package com.restassured.POJO;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@JsonIgnoreProperties(value = "id",allowSetters = true)
public class Spartan {
        //getter setter
        //toString
        private int id;
        private String name;
        private String gender;
        private long phone;


}
