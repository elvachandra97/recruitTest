package com.dansmultipro.models.entities;

import java.util.Date;

public class Joblist {
    
    public Joblist(String id, String type, String url, Date created_at, String company, String company_url,
            String location, String title, String description) {
        this.id = id;
        this.type = type;
        this.url = url;
        this.created_at = created_at;
        this.company = company;
        this.company_url = company_url;
        this.location = location;
        this.title = title;
        this.description = description;
    }

    String id;
    String type;
    String url;
    Date created_at;
    String company;
    String company_url;
    String location;
    String title;
    String description;
    
    public Joblist() { }

    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public Date getCreated_at() {
        return created_at;
    }
    
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }
    
    public String getCompany() {
        return company;
    }
    
    public void setCompany(String company) {
        this.company = company;
    }
    
    public String getCompany_url() {
        return company_url;
    }
    
    public void setCompany_url(String company_url) {
        this.company_url = company_url;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
}
