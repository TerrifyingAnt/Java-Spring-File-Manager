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
@Table(name = "file_table")
public class File implements Serializable {
    
    @Id
    @Column(name = "file_id", nullable = false, unique = true)
    private Integer file_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "file_type_id")
    private Category file_type_id;

    @Column(name = "file_name")
    private String file_name;

    @Column(name = "path")
    private String path;
    
    @Column(name = "size")
    private Float size;

    @Column(name = "hash")
    private String hash;

    @Column(name = "about")
    private String about;

    public Integer getFile_id() {
        return file_id;
    }

    public Category getFile_type_id() {
        return file_type_id;
    }

    public String getFile_name() {
        return file_name;
    }

    public String getPath() {
        return path;
    }

    public float getSize() {
        return size;
    }

    public String getHash() {
        return hash;
    }

    public String getAbout() {
        return about;
    }

    public void setFile_id(Integer file_id) {
        this.file_id = file_id;
    }

    public void setFile_type_id(Category file_type_id) {
        this.file_type_id = file_type_id;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    

    
}
