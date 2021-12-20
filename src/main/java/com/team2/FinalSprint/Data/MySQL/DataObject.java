package com.team2.FinalSprint.Data.MySQL;

import com.fasterxml.jackson.annotation.JsonAnyGetter;



import javax.persistence.*;


@Entity
public class DataObject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String company;
    private String city;
    private String jobOpening;
    private String contact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJobOpening() {
        return jobOpening;
    }

    public void setJobOpening(String jobOpening) {
        this.jobOpening = jobOpening;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
