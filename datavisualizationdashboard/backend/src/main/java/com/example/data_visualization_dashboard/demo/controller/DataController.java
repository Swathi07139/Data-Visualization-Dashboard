package com.example.datavisualization.controller;

import com.example.datavisualization.entity.Data;
import com.example.datavisualization.repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DataController {

    @Autowired
    private DataRepository dataRepository;

    @GetMapping("/data")
    public List<Data> getData(@RequestParam(required = false) Integer endYear,
                              @RequestParam(required = false) String topics,
                              @RequestParam(required = false) String sector,
                              @RequestParam(required = false) String region,
                              @RequestParam(required = false) String pest,
                              @RequestParam(required = false) String source,
                              @RequestParam(required = false) String swot,
                              @RequestParam(required = false) String country,
                              @RequestParam(required = false) String city) {

        List<Data> allData = dataRepository.findAll();

        return allData.stream()
                .filter(data -> endYear == null || data.getEnd_year().equals(endYear))
                .filter(data -> topics == null || data.getTopics().equalsIgnoreCase(topics))
                .filter(data -> sector == null || data.getSector().equalsIgnoreCase(sector))
                .filter(data -> region == null || data.getRegion().equalsIgnoreCase(region))
                .filter(data -> pest == null || data.getPest().equalsIgnoreCase(pest))
                .filter(data -> source == null || data.getSource().equalsIgnoreCase(source))
                .filter(data -> swot == null || data.getSwot().equalsIgnoreCase(swot))
                .filter(data -> country == null || data.getCountry().equalsIgnoreCase(country))
                .filter(data -> city == null || data.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }
}
