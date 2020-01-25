package com.capgemini.forestrymanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.forestrymanagementsystem.bean.Client;
import com.capgemini.forestrymanagementsystem.bean.Contract;
import com.capgemini.forestrymanagementsystem.bean.Hauliers;
import com.capgemini.forestrymanagementsystem.bean.Land;
import com.capgemini.forestrymanagementsystem.bean.OrderDetail;
import com.capgemini.forestrymanagementsystem.bean.Product;
import com.capgemini.forestrymanagementsystem.bean.Request;


public class StaticData {
   
	static List<Client> _Client=new ArrayList<Client>();
	static List<Product> _Product=new ArrayList<Product>();
	static List<OrderDetail> _OrderDetail=new ArrayList<OrderDetail>();
	static List<Request>  _Request=new ArrayList<Request>();
	static List<Contract> _Contract=new ArrayList<Contract>();
	static List<Hauliers> _Haulier=new ArrayList<Hauliers>();
	static List<Land> _Land=new ArrayList<Land>();
	public static void addClient(Client client) {
		_Client.add(client);

	}
	public static List<Client> getClient(){
		return _Client;
	}
   public static boolean deliveOrder(Contract contract) {
	   for (Contract _contract : _Contract) {
		   if(_contract.getContractId()==contract.getContractId()) {
			   return false;
		   }
	}
	   _Contract.add(contract);
	   return true;
   }
	
	public static boolean addProduct(Product product) {
		for (Product  _product : _Product) {
			if (_product.getProductId() == product.getProductId()) {
				return false;
			}
		}
		_Product.add(product);
		return true;
	}
	public static List<Product> getProduct(){
		return _Product;
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
			if(_Request1.getRequestId()==(id)) {
				_Request.remove(_Request1);
				return true;
			}	
		}return false;
	}
	public static boolean delieverProduct(Contract contract) {
		_Contract.add(contract);
		return true;
	}
	public static void addHaulier(Hauliers haulier) {
		_Haulier.add(haulier); 
	}
    public static boolean deleteHaulier(int haulierId) {
    	Hauliers haulier=null;
    	for (Hauliers _Hauliers : _Haulier) {
    		if(_Hauliers.getHaulierId()==(haulierId)) {
    			_Haulier.remove(_Hauliers);
    			return true;
    		}		
		}
		return false;
    
    }
    public static List<Hauliers> getAllHaulier(){
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
    	public static boolean delayDelieveryProduct(int contractId) {
    		Contract contract=null;
    		for (Contract contract1 : _Contract) {
				if(contract1.getContractId()==contractId)
					_Contract.remove(contractId);
				return true;
			}
    	return false;
    }
    
    public static List<Land> getAllLandDetail(){
    	return _Land;
    }
    public static void addContract(Contract contract) {
    	_Contract.add(contract);
    }
    public static List<Contract> getAllContract(){
    	return _Contract;
    }
    public static boolean deleteCustomer(int custId) {
    	Client client=null;
    	for (Client _client1 : _Client) {
    		if(_client1.getCustId()==custId) {
    			_Client.remove(_client1);
    			return true;
    		}
			
		}
		return false;
    }
   public static void acceptOrder(OrderDetail order) {
	   _OrderDetail.add(order);
	   
   }
   public static boolean rejectOrder(int requestId) {
	   for (OrderDetail _orderDetail1 : _OrderDetail) {
		   if(_orderDetail1.getRequestId()==requestId) {
			   _OrderDetail.remove(_orderDetail1);
			   return true;
		   }
	}return false;
   }
   public static List<OrderDetail> getAllOrder(){
	   return _OrderDetail;
   }
    
    
    
}