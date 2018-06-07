package cn.com.taiji.stream;

import java.util.function.Supplier;

public  class MySupplier implements Supplier<Integer> {
	int a=1;
	int b=1;
	public Integer get() {
		// TODO Auto-generated method stub
		int x= a+b;
		a=b ;
		b=x;
		return  a;
	}
	
	
}
