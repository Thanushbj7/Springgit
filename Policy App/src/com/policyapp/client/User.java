package com.policyapp.client;

import com.policyapp.service.IPolicyService;
import com.policyapp.service.PolicyServiceImpl;

public class User {

public static void main(String[] args) {
IPolicyService policyservice = new PolicyServiceImpl();
policyservice.getAll().forEach(System.out::println);
	      }
}


