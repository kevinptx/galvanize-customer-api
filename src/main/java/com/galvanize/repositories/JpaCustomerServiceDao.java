package com.galvanize.repositories;
import com.galvanize.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaCustomerServiceDao extends JpaRepository<Customer, Long> {
    Customer findByCustomerAddressAndCustomerName(String address, String name);
}
