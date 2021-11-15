package com.mapping.enquiry.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mapping.entity.Enquiry;
import com.mapping.repository.CustomerRepository;
import com.mapping.repository.EnquiryRepository;

/* @ service class for enquiry
 * @author Nalanda
 * @version 1.o
 * @date 13/11/21
 * 
 * */
@Service
public class EnquiryService {

	@Autowired
	EnquiryRepository enquiryRepository;


	public List<Enquiry> getAllEnquiry(Enquiry enquiry) {
		return enquiryRepository.findAll();
	}

	public Enquiry addEnquiry(Enquiry enquiry) {
		return enquiryRepository.save(enquiry);
	}

	public Enquiry updateEnquiry(Enquiry enquiry) {
		return enquiryRepository.saveAndFlush(enquiry);
	}

	public void deleteEnquiry(Enquiry enquiry) {
		enquiryRepository.delete(enquiry);

	}

}
