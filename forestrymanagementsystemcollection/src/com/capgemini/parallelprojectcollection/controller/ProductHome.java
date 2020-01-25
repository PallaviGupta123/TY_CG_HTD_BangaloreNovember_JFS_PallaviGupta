package com.capgemini.parallelprojectcollection.controller;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.capgemini.parallelprojectcollection.abstraction.IProductService;
import com.capgemini.parallelprojectcollection.bean.Product;
import com.capgemini.parallelprojectcollection.exception.Forestry_AdminException;
import com.capgemini.parallelprojectcollection.exception.ValidationException;
import com.capgemini.parallelprojectcollection.factory.Factory;

public class ProductHome {
	public static void main() {
		Scanner sc=new Scanner(System.in);
		IProductService service1=Factory.objectProductService();

		boolean logout=false;
		while(!logout) {
			boolean isChoiceCompleted=false;
			String choice;
			do {


				System.out.println("1.Add Product\n2.Get All Product\n3.Delete Product\n4.Update Product\n5.Exit");
				choice=sc.next();
				String choiceregex="^[1-5]$";
				Pattern choicePattern =Pattern.compile(choiceregex);
				Matcher choiceMatch=choicePattern.matcher(choice);
				if(!choiceMatch.matches()) {
					System.err.println("Always in number format between 1 to 5");
				}
				else {
					isChoiceCompleted=true;
				}
			}while(!isChoiceCompleted);
			switch(Integer.parseInt(choice)) {
			case 1:
				Product product=new Product();
				System.out.println("Enter product id: ");
				String productId=null;

				do {	
					try {	
						productId = sc.next();
						if (Validation.isNumber(productId)) {
							product.setProductId(Integer.parseInt(productId));
						} else {

							throw new Forestry_AdminException("Please enter 3 digit id only!");
						}
					}	catch (Forestry_AdminException  forestry_AdminException) {
						System.err.println(forestry_AdminException.getMessage());

					}

				} while (!Validation.isNumber(productId));



				System.out.println("Enter product name: ");
				String productName = null;
				do {
					try {
						productName = sc.next();
						if (Validation.isWord(productName)) {
							product.setProductName(productName);
						} else {

							throw new Forestry_AdminException("Please enter name only in alphabets!");
						}
					}
					catch(Forestry_AdminException forestry_AdminException) {
						System.err.println(forestry_AdminException.getMessage());

					}


				} while (!Validation.isWord(productName));



				System.out.println("Enter product Type: ");
				String productType =null;
				do {
					try {
						productType = sc.next();
						if (Validation.isWord(productType)) {
							product.setProductName(productType);
						} else {

							throw new Forestry_AdminException("Please enter name only in alphabets!");
						} 
					}catch (ValidationException validationException) {
						System.out.println(validationException.getMessage());
					}

				} while (!Validation.isWord(productType));



				System.out.println("Enter stock : ");
				String stock=null;
				do {
					try {
						stock = sc.next();
						if (Validation.isNumber(stock)) {
							product.setStock(Integer.parseInt(stock));
						} else {

							throw new ValidationException("Please enter 3 digit id only!");
						} 
					}catch (ValidationException  validationException) {
						System.err.println(validationException.getMessage());
					}

				} while (!Validation.isNumber(stock));

				boolean isProductAdded=service1.addProduct(product);

				if (isProductAdded) {
					System.out.println("Product is added...");
				} else {
					System.err.println("Product Id already Exist.");
				}

				break;
			case 2:
				Product productList=new Product();
				List<Product> list=service1.getAllProduct();
				System.out.println(list.toString());
				break;
			case 3:
				Product productBean=new  Product();
				System.out.println("Enter product id: ");
				String productIdToDelete =null;;
				do {
					try {
						productIdToDelete = sc.next();
						if (Validation.isNumber(productIdToDelete)) {
							productBean.setProductId(Integer.parseInt(productIdToDelete));
						} 
						else{

							throw new ValidationException("Please enter 3 digit id only!");
						} 
					}catch (ValidationException validationException) {
						System.err.println(validationException.getMessage());
					}

				} while (!Validation.isNumber(productIdToDelete));

				int productIdToDelet1e=Integer.parseInt(productIdToDelete);
				boolean isDeletedProduct=service1.deleteProduct(productIdToDelet1e);
				if(isDeletedProduct) {
					System.out.println("Product Deleted from Cart successfully");
				}

				else {
					System.err.println("Something Went Wrong");
				}
				break;
			case 4:

				while(true) {
					System.out.println("1.To Edit Product Name\n2. To Edit Product Type\n3.To Edit Product Weight\n4.To Edit Product Stock\n5.Return Back To Product Page");
					int select=sc.nextInt();
					switch (select) {
					case 1:
						Product productUpdateBean=new Product();
						List<Product>listProduct=service1.getAllProduct();
						boolean isProductIdMatch=false;

						String productIdToUpdate=null;
						do {
							try {
								System.out.println("Enter product id: ");

								productIdToUpdate = sc.next();
								if (Validation.isNumber(productIdToUpdate)) {
									int productIdToUpdateInt=Integer.parseInt(productIdToUpdate);

									for (Product _product : listProduct) {
										if(_product.getProductId()==productIdToUpdateInt) {
											isProductIdMatch=true;
											break;
										}

									}

									if(!isProductIdMatch) {
										System.out.println("Product Id does not exist... Please enter a valid product id");
									}


								}

								else {

									throw new Forestry_AdminException("Please enter 3 digit id only!");
								} 
							}catch (Forestry_AdminException e) {
								e.printStackTrace();
							}

						} while (!Validation.isNumber(productIdToUpdate) || !isProductIdMatch);



						System.out.println("Enter product name: ");
						String productNameToUpdate=null;
						do {
							try {
								productNameToUpdate = sc.next();
								if (Validation.isWord(productNameToUpdate)) {
									productUpdateBean.setProductName(productNameToUpdate);
								} else {

									throw new Forestry_AdminException("Please enter name only in alphabets!");
								}
							}catch (ValidationException validationException) {
								System.out.println(validationException.getMessage());
							}

						} while (!Validation.isWord(productNameToUpdate));

						int productIdToUpdate1=Integer.parseInt(productIdToUpdate);
						boolean isUpdateProductName=service1.updateProduct(productIdToUpdate1, productUpdateBean);
						if(isUpdateProductName) {
							System.out.println("Product Upated Succesffully");
						}
						else {
							System.out.println("Something went wrong");
						}

						break;
					case 2:


						Product productUpdate=new Product();
						List<Product>listProductName=service1.getAllProduct();
						boolean isProductIDMatch=false;

						String productIdToUpdate2;
						do {
							System.out.println("Enter product id: ");

							productIdToUpdate2 = sc.next();
							if (Validation.isNumber(productIdToUpdate2)) {
								int productIdToUpdateInt=Integer.parseInt(productIdToUpdate2);

								for (Product _product : listProductName) {
									if(_product.getProductId()==productIdToUpdateInt) {
										isProductIdMatch=true;
										break;
									}	
								}
								if(!isProductIDMatch) {
									System.out.println("Product Id does not exist... Please enter a valid product id");
								}	
							}

							else {
								try {
									throw new Forestry_AdminException("Please enter 3 digit id only!");
								} catch (Forestry_AdminException e) {
									e.printStackTrace();
								}
							}
						} while (!Validation.isNumber(productIdToUpdate2) || !isProductIDMatch);
						System.out.println("Enter product Type: ");
						String productTypeToUpdate=null;
						do {
							try {
								productTypeToUpdate = sc.next();
								if (Validation.isWord(productTypeToUpdate)) {
									productUpdate.setProductName(productTypeToUpdate);
								} 
								else 
								{
									throw new ValidationException("Please enter name only in alphabets!");
								} 
							}catch (ValidationException validationException) {
								System.err.println(validationException.getMessage());
							}
						
					} while (!Validation.isWord(productTypeToUpdate));
					int productIdToUpdate3=Integer.parseInt(productIdToUpdate2);


					boolean isProductTypeUpdate=service1.updateProduct(productIdToUpdate3,productUpdate);
					if(isProductTypeUpdate) {
						System.out.println("Product Type Update Successfully");
					}

					else {
						System.err.println("Something went wrong");
					}
					break;
				case 3:
					Product productStockBean=new Product();
					System.out.println("Enter product id: ");
					String productIdToUpdateStock;
					do {
						productIdToUpdateStock = sc.next();
						if (Validation.isNumber(productIdToUpdateStock)) {

							productStockBean.setProductId(Integer.parseInt(productIdToUpdateStock));	
						}

						else {
							try {
								throw new Forestry_AdminException("Please enter 3 digit id only!");
							} catch (Forestry_AdminException e) {
								e.printStackTrace();
							}
						}
					} while (!Validation.isNumber(productIdToUpdateStock));

					System.out.println("Enter stock : ");
					String stockToUPdate;
					do {
						stockToUPdate = sc.next();
						if (Validation.isNumber(stockToUPdate)) {
							productStockBean.setProductId(Integer.parseInt(stockToUPdate));
						} else {
							try {
								throw new Forestry_AdminException("Please enter 3 digit id only!");
							} catch (Forestry_AdminException e) {
								e.printStackTrace();
							}
						}
					} while (!Validation.isNumber(stockToUPdate));

					int productIdToUpdateStock1=Integer.parseInt(stockToUPdate);
					boolean isStockUpdate=service1.updateProduct(productIdToUpdateStock1,productStockBean);
					if(isStockUpdate) {
						System.out.println("Product Stock updated Successfully");
					}
					else {
						System.err.println("Something went Wrong");
					}
					break;
				case 5:
					ProductHome.main();
					break;
				}	


			}



		}

	}}
}
