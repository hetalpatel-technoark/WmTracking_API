/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wmtrucking.repository;

import com.wmtrucking.entity.MaDriver;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
@Scope(value = "request")
public interface DriverRepository extends JpaRepository<MaDriver, Long> {

//    @Query(nativeQuery = true, value = "select * from  ma_driver where mobile=?1 and status=?2 ")
//    MaDriver findByPhoneAndStatus(String phone, String status);
    @Query(nativeQuery = true, value = "select * from  ma_driver where mobile=?1 and status=?2 and countrycode=?3")
    MaDriver findByPhoneAndStatus(String phone, String status, String countrycode);

    @Query(nativeQuery = true, value = "select * from  ma_driver where  (mobile=?4 or email=?1) and status=?2 and password=?3")
    MaDriver findByEmailAndStatus(String email, String status, String password, String mobile);

    @Query(nativeQuery = true, value = "select * from  ma_driver where id=?1 and status=?2 ")
    MaDriver findById(Long id, String status);

    @Query(nativeQuery = true, value = "select * from  ma_driver where otp=?1 and status=?2 and id=?3 ")
    MaDriver findByUserForOTPvarify(Long otp, String status, Long id);

}
