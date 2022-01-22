package com.jyothi.demoHibernate;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Alien alien=null;
    	
		
		/*
		 * AlienName an=new AlienName(); an.setFirstName("pavan");
		 * an.setMiddlename("kumar"); an.setLastName("vittal");
		 * 
		 * Alien alien=new Alien(); alien.setAid(101); alien.setAname(an);
		 * alien.setColor("white");
		 */
       Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
       SessionFactory sf=con.buildSessionFactory();
       Session session1=sf.openSession();
       
       Transaction tx=session1.beginTransaction();
       
       Query q1=session1.createQuery("from Alien where aid=101");
       q1.setCacheable(true);
       
       alien =(Alien)q1.uniqueResult();
     // s.save(alien);
     //  alien=(Alien)session1.get(Alien.class, 102);
       System.out.println(alien);

       tx.commit();
       session1.close();
       
       Session session2=sf.openSession();
       Transaction tx1=session2.beginTransaction();
       
 Query q2=session2.createQuery("from Alien where aid=101");
 q2.setCacheable(true);
       
       alien =(Alien)q2.uniqueResult();
     //  alien=(Alien)session2.get(Alien.class, 102);
       System.out.println(alien);
       tx1.commit();
       session2.close();
       

    }
}
