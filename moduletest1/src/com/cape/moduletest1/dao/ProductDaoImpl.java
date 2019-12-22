package com.cape.moduletest1.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import com.cape.moduletest1.bean.ProductBean;
public class ProductDaoImpl implements ProductDao{
	FileReader reader;
	Properties prop;
	ProductBean bean;
	
	public ProductDaoImpl()
	{
		try {
			reader =new FileReader("db.properties");
			prop=new Properties();
		prop.load(reader);
			Class.forName("com.mysql.jdbc.Driver");
		
		} catch (Exception  e) {
			
			e.printStackTrace();
		}
	}


	@Override
	public List<ProductBean> showProduct() {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
			Statement stmt=conn.createStatement();)
		{
			ResultSet rs=stmt.executeQuery(prop.getProperty("query1"));
				while(rs.next())
				{
					bean=new ProductBean();
					bean.setPid(rs.getInt(1));
					bean.setPname(rs.getString(2));
					bean.setColor(rs.getString(3));
					bean.setCost(rs.getInt(4));
					bean.setDescription(rs.getString(5));
					bean.setTotalProduct(rs.getInt(6));
		}list.add(bean);
}
				catch(Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}

	@Override
	public boolean buyProduct(ProductBean bean) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("query2"));)
			{
			pstmt.setInt(1,bean.getPid());
		    pstmt.setString(2,bean.getPname());
		    pstmt.setString(3,bean.getColor());
		    pstmt.setDouble(4,bean.getCost());
		    pstmt.setString(5, bean.getDescription());
		    pstmt.setInt(6, bean.getTotalProduct());
		    int isBuy=pstmt.executeUpdate();
		    if(isBuy>0) {
		    	return true;
		    }
		    
			
			}catch(Exception e) {
				e.printStackTrace();
			}
				
		return false;
	}

	@Override
	public boolean searchProduct(String name) {
		Scanner sc=new Scanner(System.in);
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("query3"));)
			{
				System.out.println("Enter the name to search");
				pstmt.setString(2, sc.nextLine());
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()) {
					rs.getString(rs.getString(2));
				}
			}catch(Exception e) {
				e.printStackTrace();
	}return true;

}}
