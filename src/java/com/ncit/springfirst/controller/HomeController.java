/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.springfirst.controller;

import com.ncit.springfirst.controller.dao.EnquiryDAO;
import com.ncit.springfirst.controller.entity.Enquiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



/**
 *
 * @author pravin
 */
 @Controller
 @RequestMapping(value="/")
public class HomeController{
    
     @Autowired
     EnquiryDAO enquiryDAO;
     @RequestMapping(method = RequestMethod.GET)
     public @ResponseBody String index(){
         return "<h1>hello world</h1>";
     }
    @RequestMapping(value="/about", method = RequestMethod.GET)
     public @ResponseBody String about(){
         return "<h1>about us</h1>";
     }

     
     
             
             
             
}
