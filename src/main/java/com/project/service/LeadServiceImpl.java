package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.LeadRepository;
import com.project.model.Lead;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	LeadRepository leadRepository;
	
	@Override
	public boolean saveLead(Lead lead) {
		try {
			Lead savelead=leadRepository.save(lead);
			if(savelead !=null) {
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	

}
