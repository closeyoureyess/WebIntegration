package com.webproject1.mywebproject.mapper;

import com.webproject1.mywebproject.dto.FieldsEntityDto;
import com.webproject1.mywebproject.FieldsEntity;
import org.springframework.stereotype.Component;

@Component
public class FieldsMapper{
    public FieldsEntity fieldsEntityDtoToFieldsEntity(FieldsEntityDto fieldsEntityDto){
        FieldsEntity fieldsEntity = new FieldsEntity();
        fieldsEntity.setLocalDateTimeEvent(fieldsEntityDto.getLocalDateTimeEvent());
        fieldsEntity.setContentField(fieldsEntityDto.getContentField());
        fieldsEntity.setNameField(fieldsEntityDto.getNameField());
        fieldsEntity.setId(fieldsEntityDto.getId());
        fieldsEntity.setFieldsAndContents(fieldsEntityDto.getFieldsAndContents());
        return fieldsEntity;
    }

    public FieldsEntityDto filedsEntityToFieldsEntityDto(FieldsEntity fieldsEntity){
        FieldsEntityDto fieldsEntityDto = new FieldsEntityDto();
        fieldsEntityDto.setLocalDateTimeEvent(fieldsEntity.getLocalDateTimeEvent());
        fieldsEntityDto.setContentField(fieldsEntity.getContentField());
        fieldsEntityDto.setNameField(fieldsEntity.getNameField());
        fieldsEntityDto.setId(fieldsEntity.getId());
        fieldsEntityDto.setFieldsAndContents(fieldsEntity.getFieldsAndContents());
        return fieldsEntityDto;
    }
}
