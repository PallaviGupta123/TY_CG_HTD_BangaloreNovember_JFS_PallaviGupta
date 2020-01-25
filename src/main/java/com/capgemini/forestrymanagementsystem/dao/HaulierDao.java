package com.capgemini.forestrymanagementsystem.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.forestrymanagementsystem.abstraction.IHaulierDao;
import com.capgemini.forestrymanagementsystem.bean.Hauliers;
import com.capgemini.forestrymanagementsystem.connector.DbConnector;
import com.capgemini.forestrymanagementsystem.exception.CustomerException;

public class HaulierDao implements IHaulierDao{
	FileReader reader;
	Properties prop;
	Hauliers haulier;
	public HaulierDao() {
		try {
			   reader=new FileReader("admin.properties");
			   prop=new Properties();
			   prop.load(reader);
		   }catch(Exception e) {
			   e.printStackTrace();
		   }
	}
  String add="insert into transportation(driverName,vehicleType,vehicleNo,companyName) values(?,?,?,?)";
	@Override
	public boolean addHaulier(Hauliers haulier) {

		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(add);){
			System.out.println(add);
			pstmt.setString(1, haulier.getDriverName());
			pstmt.setString(2,haulier.getTransportationType());
			pstmt.setString(3, haulier.getVehicleNo());
			pstmt.setString(4, haulier.getCompanyName());
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}else {
				return false;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteHaulier(int haulierId) {
		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteHaulier"));)
		{
			pstmt.setInt(1, haulierId);
			int count=pstmt.executeUpdate();
		if(count>0) {
			return true;
		}
		}catch(CustomerException e) {
			throw new CustomerException("ID is not exist");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean editHaulier(int haulierId, Hauliers haulier) {
		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("cancelOrder"));)
		{
			pstmt.setString(1, haulier.getDriverName());
			pstmt.setString(2,haulier.getTransportationType());
			pstmt.setString(3, haulier.getVehicleNo());
			pstmt.setString(4, haulier.getCompanyName());
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Hauliers> getAllHauliers() {
		List<Hauliers> list=new ArrayList<Hauliers>();
		try(Connection conn=DbConnector.getConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("getAllHaulier"));)
		{
			while(rs.next()) {
				haulier=new Hauliers();
				haulier.setDriverName(rs.getString(1));
			haulier.setTransportationType(rs.getString(2));
				haulier.setVehicleNo(rs.getString(3));
				haulier.setCompanyName(rs.getString(4));
				list.add(haulier);
			}return list;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	

}
