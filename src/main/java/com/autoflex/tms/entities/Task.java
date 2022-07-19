package com.autoflex.tms.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
//todo add BUGS class √
//todo add priority √
//todo add attachment files √

@Entity
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id", unique = true)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

//    @OneToOne(mappedBy = "task")
//    private Bug bug;

    @Column(nullable = false)
    private String taskName;

    @Column(name = "task_description")
    private String description;

    @Column
    private LocalDate deadline;

    @Column
    private boolean urgent;

    @Column
    private boolean important;

    @Column //fixme ???
    private String attachmentFile;

    @Enumerated(EnumType.STRING)
    @Column(name = "task_status", nullable = false)
    private Status status; //list of changed status

    //    @Column(columnDefinition = "boolean default true")
    @Column
    private boolean isActive;

    //    @Column(columnDefinition = "timestamp default now()")
    @Column
    private LocalDateTime created;

    //    @Column(columnDefinition = "timestamp default now()")
    @Column
    private LocalDateTime updated;
}