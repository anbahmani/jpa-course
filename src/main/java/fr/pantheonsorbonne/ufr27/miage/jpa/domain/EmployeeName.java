package fr.pantheonsorbonne.ufr27.miage.jpa.domain;

import jakarta.persistence.Entity;

public class EmployeeName {

    String name;

    public EmployeeName(String name) {
        this.name = name;
    }

    public EmployeeName() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
