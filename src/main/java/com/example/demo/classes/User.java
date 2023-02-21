package com.example.demo.classes;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "user_table")
public class User implements Serializable{

    @Id
    @Column(name = "user_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_id;


    @Column(name = "user_name", nullable = false, unique = true)
    private String user_name;


    public Integer getUser_id() {
        return user_id;
    }


    public String getUser_name() {
        return user_name;
    }


    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }


    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }


    
    
    
}
