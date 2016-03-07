/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.springfirst.controller.service.impl;

import com.ncit.springfirst.controller.dao.EnquiryDAO;
import com.ncit.springfirst.controller.entity.Enquiry;
import com.ncit.springfirst.controller.service.EnquiryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author pravin
 */
@Service(value="EnquiryService")
public class EnquiryServiceImpl implements EnquiryService{
         @Autowired
         EnquiryDAO enquiryDAO;
    @Override
    public List<Enquiry> getAll() {
        return enquiryDAO.getAll(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(Enquiry e) {
        return enquiryDAO.insert(e);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enquiry getById(int id) {
          return enquiryDAO.getById(id); //To change body of generated methods, choose Tools | Templates.
    }
    
}
