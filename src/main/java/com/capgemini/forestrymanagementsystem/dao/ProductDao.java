package com.capgemini.forestrymanagementsystem.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.forestrymanagementsystem.abstraction.IProductDao;
import com.capgemini.forestrymanagementsystem.bean.Product;
import com.capgemini.forestrymanagementsystem.connector.DbConnector;
import com.mysql.jdbc.PreparedStatement;

public class ProductDao implements IProductDao{
	FileReader reader;
	Properties prop;
	Product product;
public ProductDao (){
	try {
		reader =new FileReader("admin.properties");
		prop=new Properties();
      	prop.load(reader);
	} catch (Exception  e) {
		e.printStackTrace();
	}
	
}
String query="insert into product(product_type,product_name,weight,stock) values(?,?,?,?,?)";

	@Override
	public boolean addProduct(Product product) {
		try(Connection conn=DbConnector.getConnection();
				
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insert1"));
				){
			System.out.println(query);
			//pstmt.setInt(1,product.getProductId());
			pstmt.setString(1, product.getProductName());
			pstmt.setString(2, product.getProductType());
			pstmt.setInt(3, product.getStock());
			
			int count=pstmt.executeUpdate();
			if(count>0) {
				return true;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	
		 return false;
	}

	@Override
	public List<Product> getAllProduct() {
		List<Product> list=new ArrayList<Product>();
		try(Connection conn=DbConnector.getConnection();
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("getAllProduct"));){
			while(rs.next()) {
				Product product=new Product();
				product.setProductId(rs.getInt(1));
				product.setProductType(rs.getString(2));
				product.setProductName(rs.getString(3));
				product.setStock(rs.getInt(4));
			
				list.add(product);	
			}return list;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		  return list;
	}

	@Override
	public boolean deleteProduct(int productId) {
try(Connection conn=DbConnector.getConnection();
	java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteProduct"));)
{
	pstmt.setInt(1, productId);
	int count =pstmt.executeUpdate();
	if(count>0)
	{
		return true;
	}
}catch(Exception e) {
	e.printStackTrace();
}
		return false;
	}

	@Override
	public boolean updateProduct(int productId, Product product) {
		try(Connection conn=DbConnector.getConnection();
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("deleteProduct"));){
		
		pstmt.setString(1,product.getProductName());
		pstmt.setString(2,product.getProductType());
		pstmt.setInt(3, product.getStock());
		
		int count = pstmt.executeUpdate();

		if(count>0) {
			return true;
		}

	}catch(Exception e) {
		e.printStackTrace();
	}
	return false;
		
	}

	@Override
	public boolean isProductNameExist(String  productName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean searchProduct(int productId) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
