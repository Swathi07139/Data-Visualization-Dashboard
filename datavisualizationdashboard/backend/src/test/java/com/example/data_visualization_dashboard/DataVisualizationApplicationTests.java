package com.example.datavisualization;

import com.example.datavisualization.entity.Data;
import com.example.datavisualization.repository.DataRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DataVisualizationApplicationTests {

    @Autowired
    private DataRepository dataRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testDataLoading() {
        List<Data> dataList = dataRepository.findAll();
        assertThat(dataList).isNotEmpty();
    }
}
