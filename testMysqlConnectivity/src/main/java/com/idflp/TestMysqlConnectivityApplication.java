package com.idflp;

import java.util.List;
import java.util.ListIterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class TestMysqlConnectivityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMysqlConnectivityApplication.class, args);
		
			SessionFactory sf = null;
			Session session = null;
			JSONObject js = new JSONObject();
			JSONArray array = new JSONArray();
			try {
				sf = HibernateUtil.getSessionFactory();
				session = sf.openSession();
				Query query = session.createQuery("From Service_Master");

				List<Service_Master> list = query.list();
				ListIterator<Service_Master> iterator = list.listIterator();
				while (iterator.hasNext()) {
					Service_Master services = iterator.next();
					JSONObject serviceList = new JSONObject();
					serviceList.put("serviceName", services.getSERVICE_NAME());
					serviceList.put("serviceDescription", services.getSERVICE_DESCRIPTION());
					serviceList.put("enableStatus", services.getENABLE_STATUS());
					array.put(serviceList);
				}
				js.put("status", "SUCCESS");
				js.put("list", array);
				js.put("statusDetails", "List of services");
				
				System.out.println("output :::"+js);
				System.out.println("output :::"+js);
				
				
			} catch (Exception e) {
				e.printStackTrace();
				try {
					
					System.out.println();
					js.put("status", "FAILURE");
					js.put("statusDetails", e.getMessage());
				} catch (JSONException e1) {
					e1.printStackTrace();
				}

			} finally {
				if (session != null && session.isOpen()) {
					session.close();
				}
//				if (sf != null && !sf.isClosed()) {
//					sf.close();
//				}
			}
			
		
		
		
		
		
	}

}
