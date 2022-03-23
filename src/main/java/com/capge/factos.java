package com.capge;

public class factos {
	
	public  int getFact(int n) {
		int fact=1;
		for(int x=1;x<=n;x++)
		{
			fact=fact*x;
		}
		return fact;
	}
}
