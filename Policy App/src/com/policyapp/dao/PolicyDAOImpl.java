package com.policyapp.dao;

public class PolicyDAOImpl {
	import java.util.Arrays;
	import java.util.List;

	import com.policyapp.exception.IdNotFoundException;
	import com.policyapp.exception.PolicyNotFoundException;
	import com.policyapp.modal.Policy;

	public class PolicyDAOImpl implements IPolicyDAO {

	      @Override
	      public List<Policy> findAll() {
	            // TODO Auto-generated method stub
	            return showAllPolicies();
	      }

	      @Override
	      public List<Policy> findByType(String type) throws PolicyNotFoundException {
	            // TODO Auto-generated method stub
	            return null;
	      }

	      @Override
	      public List<Policy> findByCategory(String category) throws PolicyNotFoundException {
	            // TODO Auto-generated method stub
	            return null;
	      }

	      @Override
	      public List<Policy> findByCoverage(double sumAssured) throws PolicyNotFoundException {
	            // TODO Auto-generated method stub
	            return null;
	      }

	      @Override
	      public List<Policy> findByHighSumAssured(String coverage) throws PolicyNotFoundException {
	            // TODO Auto-generated method stub
	            return null;
	      }

	      @Override
	      public List<Policy> findByLessPremium(double premium) throws PolicyNotFoundException {
	            // TODO Auto-generated method stub
	            return null;
	      }

	      @Override
	      public Policy findById(int policyId) throws IdNotFoundException {
	            // TODO Auto-generated method stub
	            return null;
	      }
	      
	      
	      private List<Policy> showAllPolicies(){
	            return Arrays.asList(
	                        new Policy ("Jeevan Saathi",1001,2000,"term ",10,"marriage","general",200000),
	                        new Policy ("Jeevan Ananda",1002,800,"endowment",40,"life","general",200000),
	                        new Policy ("Life Saral",1003,2000,"pension",50,"retirement","general",200000),
	                        new Policy ("Tata Allianz",1004,2000,"term",40,"Travelling","general",200000),
	                        new Policy ("clickToProtect ",1005,2000,"Ulip",60,"sickness","Health",1000000)
	                        );
	      }
}
