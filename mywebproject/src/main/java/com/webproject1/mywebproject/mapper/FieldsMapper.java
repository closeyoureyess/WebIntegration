package com.webproject1.mywebproject.mapper;

import com.webproject1.mywebproject.dto.FieldsEntityDto;
import com.webproject1.mywebproject.FieldsEntity;

public class FieldsMapper {
    public FieldsEntity fieldsEntityDtoToFieldsEntity(FieldsEntityDto fieldsEntityDto){
        FieldsEntity fieldsEntity = new FieldsEntity();
        fieldsEntity.setContentField(fieldsEntityDto.getContentField());
        fieldsEntity.setNameField(fieldsEntityDto.getNameField());
        fieldsEntity.setId(fieldsEntityDto.getId());
        return fieldsEntity;
    }

    public FieldsEntityDto filedsEntityToFieldsEntityDto(FieldsEntity fieldsEntity){
        FieldsEntityDto fieldsEntityDto = new FieldsEntityDto();
        fieldsEntityDto.setContentField(fieldsEntity.getContentField());
        fieldsEntityDto.setNameField(fieldsEntity.getNameField());
        fieldsEntityDto.setId(fieldsEntity.getId());
        return fieldsEntityDto;
    }
}
