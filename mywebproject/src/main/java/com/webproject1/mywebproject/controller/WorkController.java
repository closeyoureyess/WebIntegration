package com.webproject1.mywebproject.controller;

import com.webproject1.mywebproject.service.WorkService;
import com.webproject1.mywebproject.dto.FieldsEntityDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/integration")
@Slf4j
public class WorkController {

    @Autowired
    private WorkService workService;

    @PostMapping("/handler-request")
    public ResponseEntity<?> methodHandler(@RequestBody FieldsEntityDto filedsEntityDto){

        return ResponseEntity.ok("Успешно");
    }
}
