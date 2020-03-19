package com.galvanize.repositories;
import com.galvanize.entities.CustomerService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public interface JpaCustomerServiceDao extends JpaRepository<CustomerService, Long> {
    CustomerService findByCustomerAddressAndCustomerName(String address, String name);
}
