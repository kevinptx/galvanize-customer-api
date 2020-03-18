package com.galvanize.entities;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name="customer_requests")
public class CustomerService {
    @Id
    @GeneratedValue
    Long requestNumber;
    @Column
    String customerName;
    @Column
    String customerAddress;
    @Column
    String technician;
    @Column
    int phoneNumber;
    @Column
    String description;

    public CustomerService(){

    }

    public CustomerService(String customerName, String customerAddress, String description){
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
        this.description = description;

    }

    public CustomerService(Long requestNumber, String customerName, String customerAddress, int phoneNumber, String description){
        this.requestNumber = requestNumber;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.phoneNumber = phoneNumber;
        this.description = description;
    }

    public Long getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(Long id) {
        this.requestNumber = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
