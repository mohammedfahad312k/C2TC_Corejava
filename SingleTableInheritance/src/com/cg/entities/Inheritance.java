package com.cg.entities;



	import javax.persistence.EntityManager;
	import javax.persistence.EntityManagerFactory;
	import javax.persistence.Persistence;

	public class Inheritance {

		public static void main(String[] args) {
			
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em = factory.createEntityManager();
			em.getTransaction().begin();
			
			//create one employee
			Employee employee = new Employee();
			employee.setName("Mansi");
			employee.setSalary(20000);
			em.persist(employee);

			
			//create one manager
			Manager manager = new Manager();
			manager.setName("Shubro");
			manager.setSalary(400000);
			manager.setDepartmentName("Training");
			em.persist(manager);
			
			
			
			em.getTransaction().commit();
			
			System.out.println("Added one employee and manager to database.");
			em.close();
			factory.close();
		}
	}