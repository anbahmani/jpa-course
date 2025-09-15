package fr.pantheonsorbonne.ufr27.miage.jpa.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link fr.pantheonsorbonne.ufr27.miage.jpa.domain.Employee}
 **/
@StaticMetamodel(Employee.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Employee_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #name
	 **/
	public static final String NAME = "name";
	
	/**
	 * @see #salary
	 **/
	public static final String SALARY = "salary";
	
	/**
	 * @see #department
	 **/
	public static final String DEPARTMENT = "department";

	
	/**
	 * Static metamodel type for {@link fr.pantheonsorbonne.ufr27.miage.jpa.domain.Employee}
	 **/
	public static volatile EntityType<Employee> class_;
	
	/**
	 * Static metamodel for attribute {@link fr.pantheonsorbonne.ufr27.miage.jpa.domain.Employee#id}
	 **/
	public static volatile SingularAttribute<Employee, Long> id;
	
	/**
	 * Static metamodel for attribute {@link fr.pantheonsorbonne.ufr27.miage.jpa.domain.Employee#name}
	 **/
	public static volatile SingularAttribute<Employee, String> name;
	
	/**
	 * Static metamodel for attribute {@link fr.pantheonsorbonne.ufr27.miage.jpa.domain.Employee#salary}
	 **/
	public static volatile SingularAttribute<Employee, Double> salary;
	
	/**
	 * Static metamodel for attribute {@link fr.pantheonsorbonne.ufr27.miage.jpa.domain.Employee#department}
	 **/
	public static volatile SingularAttribute<Employee, Department> department;

}

