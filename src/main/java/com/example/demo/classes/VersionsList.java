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
@Table(name = "versionslist_table")
public class VersionsList implements Serializable {


    @Id
    @Column(name = "version_list_id", nullable = false, unique = true)
    private Integer version_list_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "version_id")
    private FileVersion version_id;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "file_id")
    private File file_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "update_event_id")
    private UpdateEvent update_event_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "delete_event_id")
    private DeleteEvent delete_event_id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "upload_event_id")
    private UploadEvent upload_event_id;

    public Integer getVersion_list_id() {
        return version_list_id;
    }

    public FileVersion getVersion_id() {
        return version_id;
    }

    public File getFile_id() {
        return file_id;
    }

    public UpdateEvent getUpdate_event_id() {
        return update_event_id;
    }

    public DeleteEvent getDelete_event_id() {
        return delete_event_id;
    }

    public UploadEvent getUpload_event_id() {
        return upload_event_id;
    }

    public void setVersion_list_id(Integer version_list_id) {
        this.version_list_id = version_list_id;
    }

    public void setVersion_id(FileVersion version_id) {
        this.version_id = version_id;
    }

    public void setFile_id(File file_id) {
        this.file_id = file_id;
    }

    public void setUpdate_event_id(UpdateEvent update_event_id) {
        this.update_event_id = update_event_id;
    }

    public void setDelete_event_id(DeleteEvent delete_event_id) {
        this.delete_event_id = delete_event_id;
    }

    public void setUpload_event_id(UploadEvent upload_event_id) {
        this.upload_event_id = upload_event_id;
    }


 
    
    
    
}
