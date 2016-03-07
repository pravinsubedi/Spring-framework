/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.springfirst.controller.admin;

import com.ncit.springfirst.controller.dao.EnquiryDAO;
import com.ncit.springfirst.controller.entity.Enquiry;
import com.ncit.springfirst.controller.service.EnquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author pravin
 */
 @Controller
 @RequestMapping(value="/admin/enquiry")
public class EnquiryController {
     
         @Autowired
         EnquiryService enquiryService;
         @RequestMapping( method = RequestMethod.GET)
         public String index(Model model){
         enquiryService.getAll().clear();
         enquiryService.insert(new Enquiry(1,"pravin", "pravin@gmail.com", "jpt", "nevermind"));
         enquiryService.insert(new Enquiry(1,"pramod", "pramod@gmail.com", "jpt2", "nevermind2"));
         model.addAttribute("enquiries", enquiryService.getAll());
         return "admin/enquiry/index";
     } 
        
         @RequestMapping(value = "/edit/{id}",method=RequestMethod.GET)
       public ModelAndView edit(@PathVariable (value="id")int id){
           ModelAndView mv=new ModelAndView("admin/enquiry/edit");
            mv.addObject("enquiry",enquiryService.getById(id));
           return mv;
       }    
}
