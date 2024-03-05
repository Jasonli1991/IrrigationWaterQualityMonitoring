package com.example.controller;

import com.example.mapper.IrrigationDataMapper;
import com.example.model.IrrigationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StationDataController {

    @Autowired
    private IrrigationDataMapper irrigationDataMapper;

    @GetMapping("/stations")
    public List<String> getStations() {
        // Fetch the list of unique station names from the database
        return irrigationDataMapper.getDistinctStations();
    }

    @GetMapping("/station-data/{station}")
    public IrrigationData getStationData(@PathVariable String station) {
        // Fetch data for the specified station from the database
        return irrigationDataMapper.getLatestDataByStation(station);
    }
}
