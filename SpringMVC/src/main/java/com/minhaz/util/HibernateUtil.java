package com.minhaz.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.sun.xml.internal.ws.api.addressing.WSEndpointReference.Metadata;

public class HibernateUtil {
	public static StandardServiceRegistry standardServiceRegistry;
	public static SessionFactory sessionFactory;

	static {
		try {
			standardServiceRegistry = new StandardServiceRegistryBuilder().configure().build();
			// Create MetadataSources
			MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
			// Create Metadata
			Metadata metadata = (Metadata) metadataSources.getMetadataBuilder().build();
			// Create SessionFactory
			sessionFactory = ((org.hibernate.boot.Metadata) metadata).getSessionFactoryBuilder().build();
		} catch (Exception e) {
			e.printStackTrace();
			if (standardServiceRegistry != null) {
				StandardServiceRegistryBuilder.destroy(standardServiceRegistry);
			}
		}
		
		
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void main(String[] args) {
		getSessionFactory();	
	}
}
