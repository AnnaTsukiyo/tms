package com.autoflex.tms.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@org.hibernate.annotations.Immutable
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private List<Employee> employeeList;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User managerData;

    public Manager(User managerData) {
        this.managerData = managerData;
    }

    public Manager(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public User getManagerData() {
        return managerData;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", managerData=" + managerData +
                '}';
    }
}
