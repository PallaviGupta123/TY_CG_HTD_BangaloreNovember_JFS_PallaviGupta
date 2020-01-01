package com.capgemini.parallelprojectcollection.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.parallelprojectbyjdbc.connection.DbConnector;
import com.capgemini.parallelprojectcollection.abstraction.IProductDao;
import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Product;
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
String query="insert into product(product_type,product_name,weight,stock,added_by) values(?,?,?,?,?)";

	@Override
	public boolean addProduct(Product product) {
		try(Connection conn=DbConnector.getConnection();
				
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("insert1"));
				){
			System.out.println(query);
			//pstmt.setInt(1,product.getProductId());
			pstmt.setString(1, product.getProductName());
			pstmt.setString(2, product.getProductType());
			pstmt.setInt(3, product.getWeight());
			pstmt.setInt(4, product.getStock());
			pstmt.setInt(5, product.getAddedBy());
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
				product.setWeight(rs.getInt(4));
				product.setStock(rs.getInt(5));
				product.setAddedBy(rs.getInt(6));
				list.add(product);	
			}return list;
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		  return list;
	}
	

}
