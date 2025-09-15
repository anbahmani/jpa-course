package fr.pantheonsorbonne.ufr27.miage.jpa;

import java.util.List;

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

import fr.pantheonsorbonne.ufr27.miage.jpa.domain.Department;
import fr.pantheonsorbonne.ufr27.miage.jpa.domain.Employee;

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
		}
	}
}
