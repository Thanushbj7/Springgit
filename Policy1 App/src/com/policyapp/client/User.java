package com.policyapp.client;

import com.policyapp.exception.IdNotFoundException;
import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.service.IPolicyService;
import com.policyapp.service.PolicyServiceImpl;

public class User {

	public static void main(String[] args) {

		IPolicyService policyServices = new PolicyServiceImpl();

		try {
			
			policyServices.getAll().forEach(System.out::println);
			System.out.println();
			policyServices.getByType("pension").forEach(System.out::println);
			System.out.println();
			policyServices.getByCatagory("general").forEach(System.out::println);
			System.out.println();
			policyServices.getByHighsumAssured(200000).forEach(System.out::println);
			System.out.println();
			policyServices.getByCoverage("marriage").forEach(System.out::println);
			System.out.println();
			policyServices.getByLessPremium(1600).forEach(System.out::println);
			System.out.println();
			System.out.println(policyServices.getById(1003));

		} catch (PolicyNotFoundException | IdNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
