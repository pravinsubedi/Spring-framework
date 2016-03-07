/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ncit.springfirst.controller.service;

import com.ncit.springfirst.controller.entity.Enquiry;
import java.util.List;

/**
 *
 * @author pravin
 */
public interface EnquiryService {
        List<Enquiry> getAll();
        int insert(Enquiry e);
        Enquiry getById(int id);
}
