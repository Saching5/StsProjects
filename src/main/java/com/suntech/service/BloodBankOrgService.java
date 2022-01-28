package com.suntech.service;

import java.util.List;

import com.suntech.model.BloodBankOrg;

public interface BloodBankOrgService {
	
	public BloodBankOrg addBloodBankOrg(BloodBankOrg bloodBankOrg);
	public BloodBankOrg editBloodBankOrg(BloodBankOrg bloodBankOrg,Integer id);
	public BloodBankOrg deleteBloodBankOrg(Integer id);
	public BloodBankOrg find(Integer id);
	public List<BloodBankOrg> findAll();
	
}
