package fr.pantheonsorbonne.ufr27.miage.jpa;

import fr.pantheonsorbonne.ufr27.miage.jpa.domain.Department;
import fr.pantheonsorbonne.ufr27.miage.jpa.domain.Employee;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;

import java.util.List;


@Dependent
public class JpaTest {

	@Inject
	private EntityManager manager;

	public static void main(String[] args) {
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
		try (SeContainer container = initializer
				.addPackages(true, JpaTest.class.getPackage())
				.initialize()) {

			JpaTest jpa = container.select(JpaTest.class).get();

			EntityTransaction tr = jpa.manager.getTransaction();
			try {
				tr.begin();
				jpa.createEmployees();
				tr.commit();
			} catch (Exception e) {
				if (tr.isActive()) {
					tr.rollback();
					throw e;
				}
			}
			jpa.listEmployees();
		}

	}

	private void createEmployees() {
		CriteriaBuilder cb = manager.getCriteriaBuilder();

		{
			// JAVA
			CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
			Root<Employee> root = cq.from(Employee.class);
			Join<Employee, Department> join = root.join("department");
			cq.select(root).where(cb.equal(join.get("name"), "java"));

			List<Employee> javaEmployees = manager.createQuery(cq).getResultList();
			if (!javaEmployees.isEmpty()) {
				Department depJava = new Department("java");
				manager.persist(depJava);
				manager.persist(new Employee("Anis Bahmani", depJava, 1000));
				manager.persist(new Employee("Jean Dupont", depJava, 2400));
			}

			// PHP
			cq.select(root).where(cb.equal(join.get("name"), "php"));

			List<Employee> phpEmployees = manager.createQuery(cq).getResultList();
			if (!phpEmployees.isEmpty()) {
				Department depPhp = new Department("php");
				manager.persist(depPhp);
				manager.persist(new Employee("Joh Doe", depPhp, 1300));
				manager.persist(new Employee("Test test", depPhp, 2400));
			}

		}

	}

	private void listEmployees() {
		CriteriaBuilder cb = manager.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
		Root<Employee> root = cq.from(Employee.class);
		cq.select(root);
		List<Employee> employees = manager.createQuery(cq).getResultList();
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}

