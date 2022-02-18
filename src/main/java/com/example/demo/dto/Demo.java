package com.example.demo.dto;

import javax.persistence.*;

@Entity
@Table
public class Demo {
    @Id
    @SequenceGenerator(
            name= "demo_sequence",
            sequenceName = "demo_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "demo_sequence"
    )
    private int id;
    private String name;
    private String lastName;

    public Demo() {
    }

    public Demo(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
