package com.suntech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suntech.model.BloodBankOrg;
import com.suntech.repository.BloodBankOrgRepository;

@Service
public class BloodBankOrgServiceImpl implements BloodBankOrgService{

	@Autowired
	private BloodBankOrgRepository bloodBankOrgRepository;

	@Override
	public BloodBankOrg addBloodBankOrg(BloodBankOrg bloodBankOrg) {

		bloodBankOrgRepository.save(bloodBankOrg);
		return bloodBankOrg;
	}

	@Override
	public BloodBankOrg editBloodBankOrg(BloodBankOrg bloodBankOrg, Integer id) {

		bloodBankOrgRepository.save(bloodBankOrg);
		return null;
	}

	@Override
	public BloodBankOrg deleteBloodBankOrg(Integer id) {
		BloodBankOrg bloodBankOrg=bloodBankOrgRepository.findById(id).get();
		bloodBankOrgRepository.delete(bloodBankOrg);
		return bloodBankOrg;
	}

	@Override
	public BloodBankOrg find(Integer id) {

		return bloodBankOrgRepository.findById(id).get(); 
	}

	@Override
	public List<BloodBankOrg> findAll() {

		return (List<BloodBankOrg>) bloodBankOrgRepository.findAll();
	}

}
