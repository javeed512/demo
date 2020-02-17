package capgemini;

import java.util.*;

public class Child extends Parent {

	int cid = 99;

	public Child() {
		super();
		System.out.println("Child()....");

	}

	void books() {
		System.out.println("engineering books");
	}
	void bike()
	{
		System.out.println("500 cc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj=new Parent();
		Parent p=new Parent();
		Parent q=new Child();
		Parent x=new Parent();
		Child c=new Child();
		q.bike();
		x.bike();
        
       
       
       
        
      
         
		
		
		

	}

}
