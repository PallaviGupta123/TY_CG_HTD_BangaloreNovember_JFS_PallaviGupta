package com.capgemini.parallelprojectcollection.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.capgemini.parallelprojectcollection.bean.Client;
import com.capgemini.parallelprojectcollection.bean.Contract;
import com.capgemini.parallelprojectcollection.bean.Hauliers;
import com.capgemini.parallelprojectcollection.bean.Land;
import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.bean.Request;
import com.capgemini.parallelprojectcollection.bean.Stock;

public class StaticData {

	static Set<Client> _Client=new HashSet<Client>();
	static List<Product> _Product=new ArrayList<Product>();
	static List<Stock>   _Stock=new ArrayList<Stock>();
	static List<Request>  _Request=new ArrayList<Request>();
	static Set<Contract> _Contract=new HashSet<Contract>();
	static Set<Hauliers> _Haulier=new HashSet<Hauliers>();
	static Set<Land> _Land=new HashSet<Land>();
	public static void addClient(Client client) {
		_Client.add(client);

	}
	public static Set<Client> getClient(){
		return _Client;
	}

	public static void addProduct(Product product) {
		_Product.add(product);
	}
	public static List<Product> getProduct(){
		return _Product;
	}
	public static void addStock(Stock stock) {
		_Stock.add(stock);
	}
	public static  List<Stock> getAllStock() {
		return _Stock;	
	}
	public static  void createRequest(Request request){
		_Request.add(request);
	}
	public static List<Request> viewAllRequest(){
		return _Request;
	}
	public static boolean cancelOrder(int id) {
		Request request=null;
		for (Request _Request1:_Request) {
			if(_Request1.getRequestId()==id) {
				_Request.remove(_Request1);
				return true;
			}	
		}return false;
	}
	public static boolean acceptRequest(Contract contract) {
		_Contract.add(contract);
		return true;
	}
	public static void addHaulier(Hauliers haulier) {
		_Haulier.add(haulier); 
	}
    public static boolean deleteHaulier(String haulierId) {
    	Hauliers haulier=null;
    	for (Hauliers _Hauliers : _Haulier) {
    		if(_Hauliers.getHaulierId().equals(haulierId)) {
    			_Haulier.remove(_Hauliers);
    			return true;
    		}		
		}
		return false;
    
    }
    public static Set<Hauliers> getAllHaulier(){
    	return _Haulier;	
    }
    public static boolean editHaulier(String haulierId) {
    	_Haulier.contains(haulierId);
    	_Haulier.remove(haulierId);
    //	_Haulier.add(e);
    	return true;
    }
    public static void  addLandDetails(Land land) {
    	_Land.add(land);
    }
    public static boolean deleteLandDetail(int landId) {
    	Land land=null;
    	for (Land _Land1 : _Land) {
    		if( _Land1.getLandId()==landId) {
    			_Land.remove(_Land1);
    			return true;
    		}
		}
    	return false;
    }
    public static Set<Land> getAllLandDetail() {
    	return _Land;
    }
}