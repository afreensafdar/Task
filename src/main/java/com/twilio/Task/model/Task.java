package com.twilio.Task.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name= "Task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="Task_Name")
    private String taskName;

    @Column(name="Description")
    private String description;

    @Column(name="Date")
    private Date dateTime;

    @Column(name="Time")
    private Time time;

    @Column (name="Prority")
    private String prority;

   //Getter and Setter

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return dateTime;
    }

    public void setDate(Date date) {
        this.dateTime = date;
    }

    public String getPrority() {
        return prority;
    }

    public void setPrority(String prority) {
        this.prority = prority;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", description='" + description + '\'' +
                ", date=" + dateTime +
                ", prority='" + prority + '\'' +
                '}';
    }
}
