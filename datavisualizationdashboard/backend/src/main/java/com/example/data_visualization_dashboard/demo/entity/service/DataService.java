package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.DataRepository;
import com.example.demo.model.Data;

import java.util.List;

@Service
public class DataService {
  @Autowired
  private DataRepository dataRepository;

  public List<Data> getAllData() {
    return dataRepository.findAll();
  }

  public List<Data> getDataByFilters(String endYear, String topics, String sector, String region, String pest, String source, String swot, String country, String city) {
    // Implement filtering logic here
    return dataRepository.findAll();
  }
}
