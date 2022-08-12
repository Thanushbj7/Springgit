package com.policyapp.client;

import com.policyapp.model.Policy;
import com.policyapp.service.IPolicyService;
import com.policyapp.service.PolicyServiceImpl;

public class User {
	public static void main(String[] args) {
		IPolicyService policyService=new PolicyServiceImpl();
		Policy policy1=new Policy("jeevanLab",1,10000,"Health",10,"family","LIC",100000,"Adult");
		Policy policy2=new Policy("jeevanLab1",1,10000,"Health1",10,"family1","LIC1",100000,"Adult1");
//		policyService.addPolicy(policy2);
//		policyService.deletPolicy(1);
		policyService.updatePolicy(2, "full");
	}
}
