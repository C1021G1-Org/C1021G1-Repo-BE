package com.codegym.customer.model;

import com.codegym.ticket.model.Ticket;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Boolean gender;

    @Column(columnDefinition = "DATE")
    private String birthday;

    private String idCard;

    private String email;

    private String address;

    private String country;

    private Boolean delFlag;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "id_customer_type", referencedColumnName = "id")
    private CustomerType customerType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
    private Set<Ticket> ticketC;

    public Customer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
