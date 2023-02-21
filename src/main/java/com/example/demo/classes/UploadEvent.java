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
@Table(name = "uploadevent_table")
public class UploadEvent implements Serializable{

    @Id
    @Column(name = "upload_event_id", nullable = false, unique = true)
    private Integer upload_event_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user_id;

    @Column(name = "upload_time")
    private String upload_time;

    public Integer getUpload_event_id() {
        return upload_event_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public String getUpload_time() {
        return upload_time;
    }

    public void setUpload_event_id(Integer upload_event_id) {
        this.upload_event_id = upload_event_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public void setUpload_time(String upload_time) {
        this.upload_time = upload_time;
    }
    
}
