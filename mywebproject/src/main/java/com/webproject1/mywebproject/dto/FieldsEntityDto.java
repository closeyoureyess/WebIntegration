package com.webproject1.mywebproject.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Setter
@Getter
public class FieldsEntityDto implements Serializable {

    private Integer id;
    private String nameField;
    private String contentField;
    private LocalDateTime localDateTimeEvent;

    @JsonProperty("fields")
    private Map<String, String> fieldsAndContents = new HashMap<>();

    public FieldsEntityDto(int id, String nameField, String contentFild, LocalDateTime localDateTimeEvent) {
        this.id = id;
        this.nameField = nameField;
        this.contentField = contentFild;
        this.localDateTimeEvent = localDateTimeEvent;
    }

    public FieldsEntityDto(String nameField, String contentFild, LocalDateTime localDateTimeEvent) {
        this.nameField = nameField;
        this.contentField = contentFild;
        this.localDateTimeEvent = localDateTimeEvent;
    }

    public FieldsEntityDto(String nameField, String contentFild) {
        this.nameField = nameField;
        this.contentField = contentFild;
    }

    public FieldsEntityDto(int id) {
        this.id = id;
    }

    public FieldsEntityDto(StringBuilder nameField) {
        this.nameField = nameField.toString();
    }

    public FieldsEntityDto(String contentField) {
        this.contentField = contentField;
    }

    public FieldsEntityDto() {
    }

}
