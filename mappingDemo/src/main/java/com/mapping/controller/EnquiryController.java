package com.mapping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.enquiry.service.EnquiryService;
import com.mapping.entity.Enquiry;

@RestController
@RequestMapping("/Enquiry")
public class EnquiryController {
	@Autowired
	 private EnquiryService enquiryService;
	
	@GetMapping("/getEnquires")
	public List<Enquiry> getAllEnquiry(@RequestBody  Enquiry enquiry) {
		return enquiryService.getAllEnquiry(enquiry);
	}

	@PostMapping("/saveEnquiry")
	public Enquiry addEnquiry(@RequestBody  Enquiry enquiry) {
		return enquiryService.addEnquiry(enquiry);
	}

	@PutMapping("/updateEnquiry")
	public Enquiry updateEnquiry(@RequestBody  Enquiry enquiry) {
		return enquiryService.updateEnquiry(enquiry);
	}

	@DeleteMapping("/deleteEnquiry")
	public void deleteEnquiry(@RequestBody Enquiry enquiry) {
		enquiryService.deleteEnquiry(enquiry);

	}

}
