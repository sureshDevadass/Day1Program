package com.onesoft.day1;

import java.math.BigInteger;

public class MoreDigits {
	
	public static void main(String[] args) {
		
		BigInteger big=new BigInteger("48754575866954875152563654565");
		BigInteger big1=new BigInteger("8754578992145236512563548855");
		BigInteger bigMultiply=big.multiply(big1);
		System.out.println(bigMultiply);
	
	}

}
