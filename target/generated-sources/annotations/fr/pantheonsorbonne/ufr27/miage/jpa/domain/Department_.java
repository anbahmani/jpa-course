package fr.pantheonsorbonne.ufr27.miage.jpa.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link fr.pantheonsorbonne.ufr27.miage.jpa.domain.Department}
 **/
@StaticMetamodel(Department.class)
@Generated("org.hibernate.processor.HibernateProcessor")
public abstract class Department_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #name
	 **/
	public static final String NAME = "name";
	
	/**
	 * @see #employees
	 **/
	public static final String EMPLOYEES = "employees";

	
	/**
	 * Static metamodel type for {@link fr.pantheonsorbonne.ufr27.miage.jpa.domain.Department}
	 **/
	public static volatile EntityType<Department> class_;
	
	/**
	 * Static metamodel for attribute {@link fr.pantheonsorbonne.ufr27.miage.jpa.domain.Department#id}
	 **/
	public static volatile SingularAttribute<Department, Long> id;
	
	/**
	 * Static metamodel for attribute {@link fr.pantheonsorbonne.ufr27.miage.jpa.domain.Department#name}
	 **/
	public static volatile SingularAttribute<Department, String> name;
	
	/**
	 * Static metamodel for attribute {@link fr.pantheonsorbonne.ufr27.miage.jpa.domain.Department#employees}
	 **/
	public static volatile ListAttribute<Department, Employee> employees;

}

