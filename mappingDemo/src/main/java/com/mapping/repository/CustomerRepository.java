package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.entity.Customer;

/* @ repository of customer entity
 * @author Nalanda
 * @version 1.o
 * @date 13/11/21
 * 
 * */

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
