package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Lead;
import com.project.service.LeadService;

@RestController
@RequestMapping(path="/lead")
public class LeadController {
	
	@Autowired
	LeadService leadService;
	
	@PostMapping(path ="/save")
	public ResponseEntity<String> getLeads(@RequestBody Lead lead) {
		if(leadService.saveLead(lead)) {
		
		return new ResponseEntity<String>("Lead Saved",HttpStatus.OK);
		
		}else {
			return new ResponseEntity<String>("Lead failed to save",HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
			
	}
}
