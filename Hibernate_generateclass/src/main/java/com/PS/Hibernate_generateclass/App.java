package com.PS.Hibernate_generateclass;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       try 
       {
    	Configuration cfg = new  Configuration();
    	 cfg.configure();
         SessionFactory sess = cfg.buildSessionFactory();
         Session s = sess.openSession();
         Transaction txn=s.beginTransaction();
         
         Student sd = new Student();
         sd.setSname("Narayana");
         sd.setSdept("CSE");
         sd.setSphone(125);
         
         s.save(sd);
         txn.commit();
         System.out.println("records inserted suuccesfully");
         
         
       }catch(Exception e) {
           e.printStackTrace();
         }
    }
}
