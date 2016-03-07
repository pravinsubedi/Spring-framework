/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.springfirst.controller.entity;

import java.util.Date;

/**
 *
 * @author pravin
 */
public class Enquiry {
    private int id;
    private String name,email,subject,bodyText;
    private Date enquiryDate;
    private Boolean isRead;

    public Enquiry() {
    }

    public Enquiry(int id, String name, String email, String subject, String bodyText) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.subject  = subject;
        this.bodyText = bodyText;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public Date getEnquiryDate() {
        return enquiryDate;
    }

    public void setEnquiryDate(Date enquiryDate) {
        this.enquiryDate = enquiryDate;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }
     
}
