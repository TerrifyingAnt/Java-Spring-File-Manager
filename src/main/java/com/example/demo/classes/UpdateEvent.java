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
@Table(name = "updateevent_table")
public class UpdateEvent implements Serializable{

    @Id
    @Column(name = "update_event_id", nullable = false, unique = true)
    private Integer update_event_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user_id;

    @Column(name = "update_time")
    private String update_time;

    public Integer getUpload_event_id() {
        return update_event_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpload_event_id(Integer update_event_id) {
        this.update_event_id = update_event_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }
    
}
