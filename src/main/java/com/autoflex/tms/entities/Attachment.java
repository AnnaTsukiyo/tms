package com.autoflex.tms.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.File;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@org.hibernate.annotations.Immutable
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attachment_id", unique = true)
    private Long id;

    private File file;

    @Column(nullable = false)
    private String attachmentName;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

    @Column
    private LocalDateTime created;

    @Column
    private LocalDateTime updated;
}
