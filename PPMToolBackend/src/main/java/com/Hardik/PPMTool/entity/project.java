package com.Hardik.PPMTool.entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class project {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String projectName;
    private String projectIdentifier;
    private String description;
    private Date start_date;
    private Date end_date;

    private Date created_At;
    private Date update_At;

    @PrePersist
    protected void onCreate(){
        this.created_At=new Date();
    }

    @PreUpdate
    protected void onUpdate(){
        this.update_At=new Date();
    }



}
