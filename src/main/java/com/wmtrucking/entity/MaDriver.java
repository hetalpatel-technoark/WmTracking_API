/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wmtrucking.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "ma_driver")
@SequenceGenerator(name = "ma_driver_seq", sequenceName = "ma_driver_seq", allocationSize = 1)

@NamedQueries({
    @NamedQuery(name = "MaDriver.findAll", query = "SELECT m FROM MaDriver m")})
public class MaDriver implements Serializable {

    @Size(max = 2147483647)
    @Column(name = "licensenumber")
    private String licensenumber;
    @Size(max = 2147483647)
    @Column(name = "firstname")
    private String firstname;
    @Size(max = 2147483647)
    @Column(name = "middlename")
    private String middlename;
    @Size(max = 2147483647)
    @Column(name = "lastname")
    private String lastname;
    @Size(max = 2147483647)
    @Column(name = "address1")
    private String address1;
//    @Size(max = 2147483647)
//    @Column(name = "address2")
//    private String address2;
//    @Size(max = 2147483647)
//    @Column(name = "address3")
    //   private String address3;
    @Size(max = 2147483647)
    @Column(name = "address2")
    private String address2;
    @Size(max = 2147483647)
    @Column(name = "address3")
    private String address3;
//    @Size(max = 2147483647)
//    @Column(name = "country")
//    private String country;
    @Size(max = 2147483647)
    @Column(name = "city")
    private String city;
    @Size(max = 2147483647)
    @Column(name = "state")
    private String state;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 2147483647)
    @Column(name = "country")
    private String country;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 2147483647)
    @Column(name = "pincode")
    private String pincode;
    @Size(max = 2147483647)
    @Column(name = "mobile")
    private String mobile;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 2147483647)
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String Password;
    @Size(max = 2147483647)
    @Column(name = "status")
    private String status;
    @Column(name = "otp")
    private Long otp;

    @JsonIgnore
    @Column(name = "countrycode")
    private String countrycode;
    @OneToMany(mappedBy = "driverid")
    private List<MaJobs> maJobsList;
    @OneToMany(mappedBy = "driverId")
    private List<MaJobs> maJobsList1;
    @JsonIgnore
    @OneToMany(mappedBy = "driverDetails")
    private List<MaJobTransaction> maJobTransactionList;
    @JsonIgnore
    @OneToMany(mappedBy = "driverId")
    private List<MaJobTracking> maJobTrackingList;
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ma_driver_seq")

    @Column(name = "id")
    private Long id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    @Column(name = "otp_expire_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date otpExpireTime;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    @Column(name = "createddate")
    @Temporal(TemporalType.DATE)
    private Date createddate;
//    @JsonIgnore
//    @OneToMany(mappedBy = "driverDetail")
//    private List<MaJobs> maJobsCollection;
    @JsonIgnore
    @OneToMany(mappedBy = "driverId")
    private List<MaJobDriver> maJobDriverCollection;

    public MaDriver() {
    }

    public MaDriver(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public Date getOtpExpireTime() {
        return otpExpireTime;
    }

    public void setOtpExpireTime(Date otpExpireTime) {
        this.otpExpireTime = otpExpireTime;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

//    public List<MaJobs> getMaJobsCollection() {
//        return maJobsCollection;
//    }
//
//    public void setMaJobsCollection(List<MaJobs> maJobsCollection) {
//        this.maJobsCollection = maJobsCollection;
//    }
    public List<MaJobDriver> getMaJobDriverCollection() {
        return maJobDriverCollection;
    }

    public void setMaJobDriverCollection(List<MaJobDriver> maJobDriverCollection) {
        this.maJobDriverCollection = maJobDriverCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaDriver)) {
            return false;
        }
        MaDriver other = (MaDriver) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wmtrucking.entity.MaDriver[ id=" + id + " ]";
    }

    public List<MaJobTracking> getMaJobTrackingList() {
        return maJobTrackingList;
    }

    public void setMaJobTrackingList(List<MaJobTracking> maJobTrackingList) {
        this.maJobTrackingList = maJobTrackingList;
    }

    public List<MaJobTransaction> getMaJobTransactionList() {
        return maJobTransactionList;
    }

    public void setMaJobTransactionList(List<MaJobTransaction> maJobTransactionList) {
        this.maJobTransactionList = maJobTransactionList;
    }

    public String getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String address3) {
        this.address3 = address3;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getOtp() {
        return otp;
    }

    public void setOtp(Long otp) {
        this.otp = otp;
    }

    public List<MaJobs> getMaJobsList() {
        return maJobsList;
    }

    public void setMaJobsList(List<MaJobs> maJobsList) {
        this.maJobsList = maJobsList;
    }

    public List<MaJobs> getMaJobsList1() {
        return maJobsList1;
    }

    public void setMaJobsList1(List<MaJobs> maJobsList1) {
        this.maJobsList1 = maJobsList1;
    }

}
