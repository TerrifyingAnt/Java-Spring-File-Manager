package com.example.demo.classes;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "category_table")
public class Category implements Serializable{
    
  @Id
  @Column(name = "category_id", nullable = false, unique = true)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer category_id;


  @Column(name = "category", nullable = false, unique = true)
  private String category;


public Integer getCategory_id() {
    return category_id;
}

public String getCategory() {
    return category;
}

public void setCategory_id(Integer category_id) {
    this.category_id = category_id;
}

public void setCategory(String category) {
    this.category = category;
}

  

}
