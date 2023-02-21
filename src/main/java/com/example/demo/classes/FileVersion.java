package com.example.demo.classes;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fileversion_table")
public class FileVersion implements Serializable{
    
    @Id
    @Column(name = "version_id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer version_id;


    @Column(name = "version", nullable = false, unique = true)
    private String version;


    public String getVersion() {
        return version;
    }

    public Integer getVersion_id() {
        return version_id;
    }


    public void setVersion_id(Integer version_id) {
        this.version_id = version_id;
    }

    public void setVersion(String version) {
        this.version = version;
    } 

    

}
