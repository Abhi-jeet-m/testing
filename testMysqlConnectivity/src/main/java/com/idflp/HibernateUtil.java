
package com.idflp;
import java.net.URL;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;



@SuppressWarnings("deprecation")
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    static {
		try {
	        	Configuration cfg =  new Configuration().configure("hibernate.cfg.xml");	
			sessionFactory = cfg.buildSessionFactory();
			
//			 Configuration configuration = new Configuration();
//
//             // Hibernate settings equivalent to hibernate.cfg.xml's properties
//             Properties settings = new Properties();
//             settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//             settings.put(Environment.URL, "jdbc:mysql://10.10.40.63:3306/esign?useSSL=false");
//             settings.put(Environment.USER, "root");
//             settings.put(Environment.PASS, "root");
//             settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5InnoDBDialect");
//
//             settings.put(Environment.SHOW_SQL, "true");
//
//             settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
//
//             settings.put(Environment.HBM2DDL_AUTO, "update");
//             
//             configuration.addAnnotatedClass(Service_Master.class);
//
//             configuration.setProperties(settings);
//             ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//                 .applySettings(configuration.getProperties()).build();
//
//             sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			
			
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}