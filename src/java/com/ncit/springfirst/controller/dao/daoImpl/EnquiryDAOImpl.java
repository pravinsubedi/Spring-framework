/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.springfirst.controller.dao.daoImpl;

import com.ncit.springfirst.controller.dao.EnquiryDAO;
import com.ncit.springfirst.controller.entity.Enquiry;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pravin
 */
@Repository(value="EnquiryDAO")
public class EnquiryDAOImpl implements EnquiryDAO{
    private List<Enquiry> enquiryList=new ArrayList<>();
    @Override
    public List<Enquiry> getAll() {
         return enquiryList;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int insert(Enquiry e) {
        enquiryList.add(e);
        return 1;//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Enquiry getById(int id) {
       for(Enquiry e:getAll()){
          if(e.getId()==id)
              return e;
       }
        return null;   //To change body of generated methods, choose Tools | Templates.
    }
    
}
