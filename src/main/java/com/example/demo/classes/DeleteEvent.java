package com.example.demo.classes;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;

@Entity
@Table(name = "deleteevent_table")
public class DeleteEvent implements Serializable {
   
    @Id
    @Column(name = "deleteevent_table", nullable = false, unique = true)
    private Integer delete_event_id;

    @Column(name = "delete_time")
    private String delete_time;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user_id;

    public Integer getDelete_event_id() {
        return delete_event_id;
    }

    public User getUser_id() {
        return user_id;
    }

    public String getDelete_time() {
        return delete_time;
    }

    public void setDelete_event_id(Integer delete_event_id) {
        this.delete_event_id = delete_event_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }

    public void setDelete_time(String delete_time) {
        this.delete_time = delete_time;
    }

    


}
