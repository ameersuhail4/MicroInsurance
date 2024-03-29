package com.claimManagement.insuranceCompany.controllers;

import java.util.List;

import com.claimManagement.insuranceCompany.DTO.PolicyDTO;
import com.claimManagement.insuranceCompany.daoImp.PolicyDAOImp;
import com.claimManagement.insuranceCompany.exceptions.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PolicyController {
	
	@Autowired
	PolicyDAOImp policyDAOImp;

	@GetMapping(value = "/api/policies")
	public List<PolicyDTO> get() {

		return policyDAOImp.getAllPolicies();
	}
	@GetMapping(value = "/api/policies/{id}")
	public PolicyDTO get(@PathVariable String id) throws CustomException {

		return policyDAOImp.getById(id);
	}

	@PostMapping("/api/policies/new")
	public String add(@RequestBody PolicyDTO po)
	{
		policyDAOImp.addPolicy(po);
		return "policy added with id:"+po.getPolicyNo();
	}
}
