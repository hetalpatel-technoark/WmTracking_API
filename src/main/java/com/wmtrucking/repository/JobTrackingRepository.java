/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wmtrucking.repository;

import com.wmtrucking.entity.MaJobTracking;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Admin
 */
@Repository
@Scope(value = "request")
public interface JobTrackingRepository extends JpaRepository<MaJobTracking, Long> {

//    @Query(nativeQuery = true, value = "select * from  ma_jobs where driver_id=?1 and status=?2 and job_status=?3 ")
//    List<MaJobs> findListOfJob(Long driverId, String status, String jobStatus);
  
    

}
