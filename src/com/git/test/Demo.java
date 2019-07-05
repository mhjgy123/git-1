package com.git.test;

public class Demo {
    public static void main(String[] args) {
		//    char 类型是无符号的 16位
		  //char c='\uFFFF'; System.out.println((int)c);
    	
		 //2147483647
    	/*
    	 * float比long大
    	 * 进行四则运算的时候
    	 *    如果没有比int大,先转int类型在运算
    	 *    比int大，先转比int大的类型然后在运算
    	 *    
    	 *    基本类型互相转换debug看不到的
    	 */
    	int i=2147483647;
    	  //long l=a/c+i+1l;
    	  short s=(short)i;
    	System.out.println(s);
	}
}
