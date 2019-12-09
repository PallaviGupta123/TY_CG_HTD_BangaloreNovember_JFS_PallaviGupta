package com.tyss.tyss.typecasting.pack1;

public class Primitive {
	byte a=10;
	int i=a;
	float f=a;
	double d=a;
	
	void print()
	{
		System.out.println("Vale of byte is ="+a);
		System.out.println("Vale of int is ="+a);
		System.out.println("Vale of double is ="+d);

		System.out.println("Vale of float is ="+f);
		System.out.println("Vale of int "+i2);

	}
  // Narrowing
	double  d1=20.34;
	int i2=(int)d1;
}
