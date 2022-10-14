package com.product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bean.Electronics;
import com.bean.product;

public class ProductDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Configuration cfg= new Configuration().configure("com/resources/hibernate.cfg.xml");
		
		SessionFactory sfact= cfg.buildSessionFactory();
		
		Session sess = sfact.openSession();
		
		
		/*product valueset=new product();		
		valueset.setId(4);
		valueset.setB_name("dell");		
		valueset.setP_name("computer");
		valueset.setP_price(10000);	
		valueset.setQty(2);	
		
		product valueset1=new product();		
		valueset1.setId(5);
		valueset1.setB_name("Hp");		
		valueset1.setP_name("smartphone");
		valueset1.setP_price(500);	
		valueset1.setQty(10);	
		
		Electronics elect = new Electronics();
		
		elect.setE_id(212);
		elect.setE_name("computer");
		elect.setPrice(30000);
		
		
		Set set = new HashSet();
		
		set.add(valueset1);
		set.add(valueset);
		
		
		elect.setAdditems(set);
		
		
		sess.save(elect);		
		Transaction tx = sess.beginTransaction();
		tx.commit();*/
		
		/* Steal getsteal = (Steal) sess.load(Steal.class,new Integer(14));
		 
		 System.out.println(getsteal.getP_id());
		 System.out.println(getsteal.getP_name());
		 
		 System.out.println(getsteal.getFixed_price());
		 System.out.println(getsteal.getQty());
		 System.out.println(getsteal.getS_name());
		 System.out.println(getsteal.getPrice());*/
		 
		 System.out.println("Done");
		 
		 
		 
		  Electronics readata1 =(Electronics) sess.load(Electronics.class, 212);
		  
		  System.out.println(readata1.getE_id());
		  System.out.println(readata1.getE_name());
		  System.out.println(readata1.getPrice());
		  Set readset= readata1.getAdditems();
		  
		  readset.stream().forEach(t->System.out.println("reading by data : "+t));
		  
		  
		 
		/* @Entity
		 @Table
		 @id
		 @Column
		 */

	}

}
