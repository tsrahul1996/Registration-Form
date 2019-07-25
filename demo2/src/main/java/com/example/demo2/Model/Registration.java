package com.example.demo2.Model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Created by expert on 16/1/19.
 */


@Entity
@Table(name = "employees")
@Data
@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "getAllRegistration",
                procedureName = "RegistrationSelectAll",
                parameters = {},
                resultClasses = Registration.class)
})
public class Registration  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "Email")
    private String email;
    @Column(name = "Name")
    private String name;
    @Column(name = "Password")
    private String password;
    @Column(name = "Phno")
    private String phno;
    @Column(name = "Address1")
    private String address1;
    @Column(name = "Address2")
    private String address2;
    @Column(name = "State")
    private String state;
    @Column(name = "District")
    private String district;
    @Column(name = "City")
    private String city;
    @Column(name = "Pincode")
    private String pincode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
