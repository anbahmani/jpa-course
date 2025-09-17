package fr.pantheonsorbonne.ufr27.miage.jpa;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;


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
