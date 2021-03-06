/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wmtrucking.service;

import com.wmtrucking.entity.MaDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import com.wmtrucking.repository.DriverRepository;

/**
 *
 * @author Admin
 */
@Scope(value = "request")
@Service
public class DriverService {

    @Autowired
    DriverRepository driverRepository;

    public void save(MaDriver maDriver) {
        driverRepository.save(maDriver);
    }

    public MaDriver findByPhoneAndStatus(String phone, String status, String countrycode) {
        return driverRepository.findByPhoneAndStatus(phone, status, countrycode);
    }

    public MaDriver findByUserForOTPvarify(Long otp, String status, Long id) {
        return driverRepository.findByUserForOTPvarify(otp, status, id);
    }

    public MaDriver findByEmailAndStatus(String email, String status, String password, String mobile) {
        return driverRepository.findByEmailAndStatus(email, status, password,mobile);
    }

    public MaDriver findById(Long id, String status) {
        return driverRepository.findById(id, status);
    }
}
