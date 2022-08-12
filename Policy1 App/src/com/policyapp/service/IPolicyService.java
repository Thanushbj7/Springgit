package com.policyapp.service;

import java.util.List;

import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.model.Policy;

public interface IPolicyService {
List<Policy> getAll();
List<Policy> getByType(String type)throws PolicyNotFoundException;
List<Policy> getByCatagory(String catagory)throws PolicyNotFoundException;
List<Policy> getByHighsumAssured(double sumAssured)throws PolicyNotFoundException;
List<Policy> getByCoverage(String coverage)throws PolicyNotFoundException;
List<Policy> getByLessPremium(double premium)throws PolicyNotFoundException;
Policy getById(int policyId)throws IdNotFoundException;


}
