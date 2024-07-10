package com.webproject1.mywebproject.repository;

import com.webproject1.mywebproject.FieldsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkRepository extends JpaRepository<FieldsEntity, Integer> {
}
