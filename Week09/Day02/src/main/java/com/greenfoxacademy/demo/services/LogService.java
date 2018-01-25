package com.greenfoxacademy.demo.services;

import com.greenfoxacademy.demo.factories.LogFactory;
import com.greenfoxacademy.demo.models.ExerciseLog;
import com.greenfoxacademy.demo.models.ExerciseLogList;
import com.greenfoxacademy.demo.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {
  
  private final LogRepository logRepository;
  private final LogFactory logFactory;
  private final ExerciseLogList logList;
  
  @Autowired
  public LogService(LogRepository logRepository, LogFactory logFactory, ExerciseLogList logList) {
    this.logRepository = logRepository;
    this.logFactory = logFactory;
    this.logList = logList;
  }
  
  public ExerciseLogList updateAndGetLogList(){
    logList.setEntries(getAllLogs());
    logList.setEntryCount(getAllLogs().size());
    return logList;
  }
  
  public void createLog(String endpoint, String data){
    logRepository.save(logFactory.produceLogObjectWithFields(endpoint, data));
  }
  
  public void modifyLog(ExerciseLog log){
    logRepository.save(log);
  }
  
  public void deleteLog(long id){
    logRepository.delete(id);
  }
  
  public List<ExerciseLog> getAllLogs(){
    return (List<ExerciseLog>)logRepository.findAll();
  }
  
  public ExerciseLog getLog(long id){
    return logRepository.findOne(id);
  }
}
