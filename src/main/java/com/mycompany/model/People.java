/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author wmfsystem
 */
@Entity
@Table(name = "peoples")
public class People implements Serializable {

    public People() {
    }

    public People(Long ID, String description) {
        this.ID = ID;
        this.description = description;
    }

    @Id
    private Long ID;

    private String description;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "People{" + "ID=" + ID + ", description=" + description + '}';
    }
    
    

}
