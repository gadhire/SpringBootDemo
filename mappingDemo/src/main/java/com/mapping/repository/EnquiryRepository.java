package com.mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.entity.Enquiry;

/* @ repository of enquiry entity
 * @author Nalanda
 * @version 1.o
 * @date 13/11/21
 * 
 * */

@Repository
public interface EnquiryRepository extends JpaRepository<Enquiry, Integer> {

}
