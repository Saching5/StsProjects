package com.suntech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.suntech.model.BloodBankOrg;
import com.suntech.service.BloodBankOrgService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BloodBankOrgController {
	
	@Autowired
	private BloodBankOrgService bloodBankOrgService;

	@GetMapping("/home")
	public String home()
	{
		return "hello world....";
	}
	
	@PostMapping("/bloodBankOrg")
	public BloodBankOrg addBloodBankOrg(@RequestBody() BloodBankOrg  bloodBankOrg) {
		
	return bloodBankOrgService.addBloodBankOrg(bloodBankOrg);
	
	}
	@GetMapping("/bloodBankOrg")
	public List<BloodBankOrg> getBloodBankOrgs()
	{
		return bloodBankOrgService.findAll();
	}
	
	@GetMapping("/bloodBankOrg/{id}")
	public BloodBankOrg getBloodBankOrg(@PathVariable() Integer id)
	{
		return bloodBankOrgService.find(id);
	}
	
	@DeleteMapping("/bloodBankOrg/{id}")
	public BloodBankOrg deleteBloodBankOrg(@PathVariable() Integer id)
	{
		return bloodBankOrgService.deleteBloodBankOrg(id);
	}
	
	@PutMapping("/bloodBankOrg/{id}")
	public BloodBankOrg modifyBloodBankOrg(@RequestBody() BloodBankOrg  bloodBankOrg, @PathVariable() Integer id)
	{
		 bloodBankOrg.setId(id);
		 return bloodBankOrgService.editBloodBankOrg(bloodBankOrg,id);
		
	}
	
	}

	


