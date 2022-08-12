package com.policyapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.policyapp.exception.PolicyNotFoundException;
import com.policyapp.model.Policy;
import com.policyapp.utill.DbConnection;


public class PolicyDAOImpl implements IPolicyDAO {
	
	public void addPolicy(Policy policy) {
		PreparedStatement preparedStatement=null;
		String sql="insert into policy ( policy_name,premium,type,duration,coverage,brand,category,sum_assured) values (?,?,?,?,?,?,?,?)";
		Connection connection=DbConnection.openConnection();
		try {
			 preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1,policy.getPolicyName());
			preparedStatement.setDouble(2,policy.getPremium());
			preparedStatement.setString(3,policy.getType());
			preparedStatement.setInt(4,policy.getDuration());
			preparedStatement.setString(5,policy.getCoverage());
			preparedStatement.setString(6,policy.getBrand());
			preparedStatement.setString(7,policy.getCatagory());
			preparedStatement.setDouble(8,policy.getSumAssured());
			preparedStatement.execute();
			} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				}catch (SQLException e) {
					e.printStackTrace();
			}
		}
		
		
	}

	public void deletPolicy(int policyId) {
		String sql="delete from policy where policy_Id="+policyId;
		Connection connection=DbConnection.openConnection();
		PreparedStatement preparedStatement=null;
		 try {
			preparedStatement=connection.prepareStatement(sql);
			 preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				}catch (SQLException e) {
					e.printStackTrace();
			}
		}	}

	public void updatePolicy(int policyId, String Coverage) {
		String sql="update policy set Coverage=? where policy_Id=?";
		Connection connection=DbConnection.openConnection();
		PreparedStatement preparedStatement=null;
		 try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, Coverage);
			preparedStatement.setInt(2, policyId);
			
			 preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				}catch (SQLException e) {
					e.printStackTrace();
			}
		}		
	}

	public List<Policy> findAll() {
		Connection connection=DbConnection.openConnection();
		String sql="select * from policy";
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		List<Policy> policies=new ArrayList();
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			rs=preparedStatement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("policy_name");
				double premium=rs.getDouble("premium");
				String type=rs.getString("type");
				Integer duration=rs.getInt("duration");
				String coverage=rs.getString("coverage");
				String brand=rs.getString("brand");
				String category=rs.getString("category");
				double sum_assured=rs.getDouble("sum_assured");
				
				Policy policy=new Policy(name, duration, premium, type, 0, coverage, brand, sum_assured, category);
				
				policies.add(policy);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				}catch (SQLException e) {
					e.printStackTrace();
			}
		}
		return policies;
		
	
	}

	public List<Policy> findByType(String ntype) throws PolicyNotFoundException {
		Connection connection=DbConnection.openConnection();
		String sql="select * from policy where type=?";
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		List<Policy> policies=new ArrayList();
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, ntype);
			rs=preparedStatement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("policy_name");
				double premium=rs.getDouble("premium");
				String type=rs.getString("type");
				Integer duration=rs.getInt("duration");
				String coverage=rs.getString("coverage");
				String brand=rs.getString("brand");
				String category=rs.getString("category");
				double sum_assured=rs.getDouble("sum_assured");
				
				Policy policy=new Policy(name, duration, premium, type, 0, coverage, brand, sum_assured, category);
				
				policies.add(policy);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				}catch (SQLException e) {
					e.printStackTrace();
			}
		}
		return policies;
		
	
	}
	

	public List<Policy> findByCatagory(String ncatagory) throws PolicyNotFoundException {
		Connection connection=DbConnection.openConnection();
		String sql="select * from policy where catagory=?";
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		List<Policy> policies=new ArrayList();
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, ncatagory);
			rs=preparedStatement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("policy_name");
				double premium=rs.getDouble("premium");
				String type=rs.getString("type");
				Integer duration=rs.getInt("duration");
				String coverage=rs.getString("coverage");
				String brand=rs.getString("brand");
				String category=rs.getString("category");
				double sum_assured=rs.getDouble("sum_assured");
				
				Policy policy=new Policy(name, duration, premium, type, 0, coverage, brand, sum_assured, category);
				
				policies.add(policy);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return policies;
		
	
	}

	public List<Policy> findByHighsumAssured(double nsumAssured) throws PolicyNotFoundException {
		Connection connection=DbConnection.openConnection();
		String sql="select * from policy where sumAssured=?";
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		List<Policy> policies=new ArrayList();
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setDouble(1, nsumAssured);
			rs=preparedStatement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("policy_name");
				double premium=rs.getDouble("premium");
				String type=rs.getString("type");
				Integer duration=rs.getInt("duration");
				String coverage=rs.getString("coverage");
				String brand=rs.getString("brand");
				String category=rs.getString("category");
				double sum_assured=rs.getDouble("sum_assured");
				
				Policy policy=new Policy(name, duration, premium, type, 0, coverage, brand, sum_assured, category);
				
				policies.add(policy);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				}catch (SQLException e) {
					e.printStackTrace();
			}
		}
		return policies;
		
	}

	
		
	

	public List<Policy> findByLessPremium(double npremium) throws PolicyNotFoundException {
		Connection connection=DbConnection.openConnection();
		String sql="select * from policy where npremium=?";
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		List<Policy> policies=new ArrayList();
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setDouble(1, npremium);
			rs=preparedStatement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("policy_name");
				double premium=rs.getDouble("premium");
				String type=rs.getString("type");
				Integer duration=rs.getInt("duration");
				String coverage=rs.getString("coverage");
				String brand=rs.getString("brand");
				String category=rs.getString("category");
				double sum_assured=rs.getDouble("sum_assured");
				
				Policy policy=new Policy(name, duration, premium, type, 0, coverage, brand, sum_assured, category);
				
				policies.add(policy);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				}catch (SQLException e) {
					e.printStackTrace();
			}
		}
		return policies;
	}

	public Policy findById(int npolicyId){
		Connection connection=DbConnection.openConnection();
		String sql="select * from policy where npolicyId=?";
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		List<Policy> policies=new ArrayList();
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, npolicyId);
			rs=preparedStatement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("policy_name");
				double premium=rs.getDouble("premium");
				String type=rs.getString("type");
				Integer duration=rs.getInt("duration");
				String coverage=rs.getString("coverage");
				String brand=rs.getString("brand");
				String category=rs.getString("category");
				double sum_assured=rs.getDouble("sum_assured");
				
				Policy policy=new Policy(name, duration, premium, type, 0, coverage, brand, sum_assured, category);
				
				policies.add(policy);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				}catch (SQLException e) {
					e.printStackTrace();
			}
		}
//		return policies;
		return null;
	}

	public List<Policy> findByBrand(String nbrand) throws PolicyNotFoundException {
		Connection connection=DbConnection.openConnection();
		String sql="select * from policy where nbrand=?";
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		List<Policy> policies=new ArrayList();
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, nbrand);
			rs=preparedStatement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("policy_name");
				double premium=rs.getDouble("premium");
				String type=rs.getString("type");
				Integer duration=rs.getInt("duration");
				String coverage=rs.getString("coverage");
				String brand=rs.getString("brand");
				String category=rs.getString("category");
				double sum_assured=rs.getDouble("sum_assured");
				
				Policy policy=new Policy(name, duration, premium, type, 0, coverage, brand, sum_assured, category);
				
				policies.add(policy);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				}catch (SQLException e) {
					e.printStackTrace();
			}
		}
		return policies;
	}

	public List<Policy> findByHighsumAssured(String nsumAssured) throws PolicyNotFoundException {
		Connection connection=DbConnection.openConnection();
		String sql="select * from policy where nsumAssured=?";
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		List<Policy> policies=new ArrayList();
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, nsumAssured);
			rs=preparedStatement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("policy_name");
				double premium=rs.getDouble("premium");
				String type=rs.getString("type");
				Integer duration=rs.getInt("duration");
				String coverage=rs.getString("coverage");
				String brand=rs.getString("brand");
				String category=rs.getString("category");
				double sum_assured=rs.getDouble("sum_assured");
				
				Policy policy=new Policy(name, duration, premium, type, 0, coverage, brand, sum_assured, category);
				
				policies.add(policy);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				}catch (SQLException e) {
					e.printStackTrace();
			}
		}
		return policies;
	}

	public List<Policy> findByCoverage(String ncoverage) throws PolicyNotFoundException {
		Connection connection=DbConnection.openConnection();
		String sql="select * from policy where ncoverage=?";
		PreparedStatement preparedStatement=null;
		ResultSet rs=null;
		List<Policy> policies=new ArrayList();
		
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, ncoverage);
			rs=preparedStatement.executeQuery();
			while(rs.next()) {
				String name=rs.getString("policy_name");
				double premium=rs.getDouble("premium");
				String type=rs.getString("type");
				Integer duration=rs.getInt("duration");
				String coverage=rs.getString("coverage");
				String brand=rs.getString("brand");
				String category=rs.getString("category");
				double sum_assured=rs.getDouble("sum_assured");
				
				Policy policy=new Policy(name, duration, premium, type, 0, coverage, brand, sum_assured, category);
				
				policies.add(policy);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				DbConnection.closeConnection();
				if(preparedStatement!=null)
					preparedStatement.close();
				}catch (SQLException e) {
					e.printStackTrace();
			}
		}
		return policies;
	}

	public List<Policy> findByCoverage(double coverage) throws PolicyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	
		
		
		
	}

	

	
	

	



