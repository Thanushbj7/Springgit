package com.policyapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.policyapp.dao.IPolicyDAO;
import com.policyapp.dao.PolicyDAOImpl;
import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.model.Policy;

public class PolicyServiceImpl implements IPolicyService {
	PolicyDAOImpl policyDAOImpl=new PolicyDAOImpl();
	public void addPolicy(Policy policy) {
		policyDAOImpl.addPolicy(policy);
	}
	public void deletPolicy(int policyId) {
		policyDAOImpl.deletPolicy(policyId);
	}

	public void updatePolicy(int policyId, String Coverage) {
		policyDAOImpl.updatePolicy(policyId, Coverage);
	}

	public List<Policy> getAll() {
		List<Policy> policies = policyDAOImpl.findAll();
		return policies;
	}

	public List<Policy> getByType(String type) throws PolicyNotFoundException {
		List<Policy> policies = policyDAOImpl.findByType(type);
		return policies;

	}

	public List<Policy> getByCatagory(String catagory) throws PolicyNotFoundException {
		List<Policy> policies = policyDAOImpl.findByCatagory(catagory);
		return policies;
	}

	public List<Policy> getByHighsumAssured(String sumAssured) throws PolicyNotFoundException {
		List<Policy> policies = policyDAOImpl.findByHighsumAssured(sumAssured);
		return policies;
	}

	public List<Policy> getByCoverage(double coverage) throws PolicyNotFoundException {
		List<Policy> policies = policyDAOImpl.findByCoverage(coverage);
		return policies;
	}

	public List<Policy> getByLessPremium(double premium) throws PolicyNotFoundException {
		List<Policy> policies = policyDAOImpl.findByLessPremium(premium);
		return policies;
	}

//	public Policy getById(int policyId) throws IdNotFoundException {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public List<Policy> getByBrand(String brand) throws PolicyNotFoundException {
		List<Policy> policies = policyDAOImpl.findByBrand(brand);
		return policies;
	}
	public Policy getById(int policyId) throws com.policyapp.service.IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	

	

	

	
}
