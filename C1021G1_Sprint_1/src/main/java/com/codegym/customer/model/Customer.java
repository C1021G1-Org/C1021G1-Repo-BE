package com.codegym.customer.model;

import com.codegym.ticket.model.Ticket;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameCustomer;

    private Boolean genderCustomer;

    @Column(columnDefinition = "DATE")
    private String dayOfBirth;

    private String idCardCustomer;

    private String phoneCustomer;

    private String emailCustomer;

    private String addressCustomer;

    private String countryCustomer;

    private Boolean delFlagCustomer;

    private int pointCustomer;

    @ManyToOne
    @JoinColumn(name = "id_customer_type", referencedColumnName = "id")
    private CustomerType customerType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")

    private Set<Ticket> ticketC;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public Boolean getGenderCustomer() {
        return genderCustomer;
    }

    public void setGenderCustomer(Boolean genderCustomer) {
        this.genderCustomer = genderCustomer;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getIdCardCustomer() {
        return idCardCustomer;
    }

    public void setIdCardCustomer(String idCardCustomer) {
        this.idCardCustomer = idCardCustomer;
    }

    public String getPhoneCustomer() {
        return phoneCustomer;
    }

    public void setPhoneCustomer(String phoneCustomer) {
        this.phoneCustomer = phoneCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getAddressCustomer() {
        return addressCustomer;
    }

    public void setAddressCustomer(String addressCustomer) {
        this.addressCustomer = addressCustomer;
    }

    public String getCountryCustomer() {
        return countryCustomer;
    }

    public void setCountryCustomer(String countryCustomer) {
        this.countryCustomer = countryCustomer;
    }

    public Boolean getDelFlagCustomer() {
        return delFlagCustomer;
    }

    public void setDelFlagCustomer(Boolean delFlagCustomer) {
        this.delFlagCustomer = delFlagCustomer;
    }

    public int getPointCustomer() {
        return pointCustomer;
    }

    public void setPointCustomer(int pointCustomer) {
        this.pointCustomer = pointCustomer;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public Set<Ticket> getTicketC() {
        return ticketC;
    }

    public void setTicketC(Set<Ticket> ticketC) {
        this.ticketC = ticketC;
    }
}
