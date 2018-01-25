package com.greenfoxacademy.demo.repositories;

import com.greenfoxacademy.demo.models.ExerciseLog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<ExerciseLog, Long> {
}
