package com.autoflex.tms.entities;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@org.hibernate.annotations.Immutable
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attachment_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    //    private File file; todo ??? created column in bd
//    private static void readFileToBytes(String filePath) throws IOException {
//
//        File file = new File(filePath);
//        byte[] bytes = new byte[(int) file.length()];
//
//        // funny, if can use Java 7, please uses Files.readAllBytes(path)
//        try(FileInputStream fis = new FileInputStream(file)){
//            fis.read(bytes);
//        }
//    }

    @Column
    private LocalDateTime created;

    @Column
    private LocalDateTime updated;

    public Attachment(Long id, String name, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.name = name;
        this.created = created;
        this.updated = updated;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    @Override
    public String toString() {
        return "Attachment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
