package com.example.demo.classes;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "type_table")
public class Type implements Serializable{
    
    @Id
    @Column(name = "file_type_id", nullable = false, unique = true)
    private Integer file_type_id;

    @Column(name = "file_type")
    private String file_type;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category_id;

    public Integer getFile_type_id() {
        return file_type_id;
    }

    public String getFile_type() {
        return file_type;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setFile_type_id(Integer file_type_id) {
        this.file_type_id = file_type_id;
    }

    public void setFile_type(String file_type) {
        this.file_type = file_type;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    

}
