/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetprogarm;

/**
 *
 * @author Matt
 */
public class Pet extends Animal {
    private String name;
    private Person owner;

    public Pet(String name, String species, int age, Person owner) {
        super(species, age);
        this.name = name;
        this.owner = owner;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }
}

