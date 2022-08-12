package com.policyapp.service;

import java.util.List;
import java.util.stream.Collectors;

import com.policyapp.dao.IPolicyDAO;
import com.policyapp.dao.PolicyDAOImpl;
import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.model.Policy;

public class PolicyServiceImpl implements IPolicyService {
	IPolicyDAO policyDAO=new PolicyDAOImpl();
	@Override
	public List<Policy> getAll() {
	
	List<Policy> policies=policyDAO.findAll();
	List<Policy> policyList=policies
			.stream()
			.sorted((Policy p1,Policy p2)->p1.getPolicyName().compareTo(p2.getPolicyName()))
			.collect(Collectors.toList());
	

		return policyList;

	@Override
	public List<Policy> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> getByType(String type) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> getByCategory(String category) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> getByCoverage(double sumAssured) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> getByHighSumAssured(String coverage) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Policy> getByLessPremium(double premium) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Policy getById(int policyId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
