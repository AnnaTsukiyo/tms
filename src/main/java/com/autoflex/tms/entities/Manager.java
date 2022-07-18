package com.autoflex.tms.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manager_id")
    private Long id;

    @OneToMany(mappedBy = "manager")
    private List<Employee> employeeList;

    @OneToOne(mappedBy = "manager")
    private User managerData;

}