package com.webproject1.mywebproject.service;

import com.webproject1.mywebproject.FieldsEntity;
import com.webproject1.mywebproject.dto.FieldsEntityDto;
import com.webproject1.mywebproject.mapper.FieldsMapper;
import com.webproject1.mywebproject.repository.WorkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Service
public class WorkService {
    @Autowired
    private WorkRepository workRepository;
    @Autowired
    private FieldsMapper fieldsMapper;

    public void createMethod(FieldsEntityDto fieldsEntityDto){
        LocalDateTime localDateTimeEvent = LocalDateTime.now();
        fieldsEntityDto.setLocalDateTimeEvent(localDateTimeEvent);
        FieldsEntity fieldsEntityObject = fieldsMapper.fieldsEntityDtoToFieldsEntity(fieldsEntityDto);
        for(Map.Entry<String, String> cycleFieldsEntity : fieldsEntityObject.getFieldsAndContents().entrySet()){
            workRepository.save(new FieldsEntity(fieldsEntityObject.getLocalDateTimeEvent(),
                    cycleFieldsEntity.getKey(), cycleFieldsEntity.getValue()));
        }
        fieldsEntityDto.getFieldsAndContents().clear();
        fieldsEntityObject.getFieldsAndContents().clear();
    }
}
