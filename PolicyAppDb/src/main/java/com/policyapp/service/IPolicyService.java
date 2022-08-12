package com.policyapp.service;



import java.util.List;


import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.model.Policy;

public interface IPolicyService {
	void addPolicy(Policy policy);
	void deletPolicy(int policyId);
	void updatePolicy(int policyId,String Coverage);
List<Policy> getAll();
List<Policy> getByType(String type)throws PolicyNotFoundException;
List<Policy> getByCatagory(String catagory)throws PolicyNotFoundException;
List<Policy> getByHighsumAssured(String sumAssured)throws PolicyNotFoundException;
List<Policy> getByCoverage(double coverage)throws PolicyNotFoundException;
List<Policy> getByLessPremium(double premium)throws PolicyNotFoundException;
List<Policy> getByBrand(String brand)throws PolicyNotFoundException;
Policy getById(int policyId)throws IdNotFoundException;


}
