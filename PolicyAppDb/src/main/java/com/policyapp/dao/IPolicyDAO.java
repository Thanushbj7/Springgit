package com.policyapp.dao;

import java.util.List;

import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.model.Policy;
import com.policyapp.service.IdNotFoundException;

public interface IPolicyDAO {
	void addPolicy(Policy policy);
	void deletPolicy(int policyId);
	void updatePolicy(int policyId,String Coverage);
	List<Policy> findAll();
	List<Policy> findByType(String type)throws PolicyNotFoundException;
	List<Policy> findByCatagory(String catagory)throws PolicyNotFoundException;
	List<Policy> findByHighsumAssured(String sumAssured)throws PolicyNotFoundException;
	List<Policy> findByCoverage(double coverage)throws PolicyNotFoundException;
	List<Policy> findByLessPremium(double premium)throws PolicyNotFoundException;
	List<Policy> findByBrand(String brand) throws PolicyNotFoundException;
	Policy findById(int policyId)throws IdNotFoundException;

}
