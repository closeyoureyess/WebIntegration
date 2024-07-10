package com.webproject1.mywebproject;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "fieldsentity")
public class FieldsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name_field")
    private String nameField;
    @Column(name = "content_field")
    private String contentField;
    @Column(name = "local_time")
    private LocalDateTime localDateTimeEvent;

    public FieldsEntity(int id, String nameField, String contentFild) {
        this.nameField = nameField;
        this.contentField = contentFild;
    }

    public FieldsEntity(String nameField, String contentFild) {
        this.nameField = nameField;
        this.contentField = contentFild;
    }

    public FieldsEntity(int id) {
        this.id = id;
    }

    public FieldsEntity(StringBuilder nameField) {
        this.nameField = nameField.toString();
    }

    public FieldsEntity(String contentFild) {
        this.contentField = contentFild;
    }

    public FieldsEntity() {
    }
}
