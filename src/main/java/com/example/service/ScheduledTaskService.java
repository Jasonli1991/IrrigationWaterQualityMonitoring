package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTaskService {

    private final IrrigationDataService irrigationDataService;

    @Autowired
    public ScheduledTaskService(IrrigationDataService irrigationDataService) {
        this.irrigationDataService = irrigationDataService;
    }

    @Scheduled(fixedRate = 600000) // 每10分鐘執行一次
    public void scheduledTask() {
        System.out.println("Scheduled task is running...");
        irrigationDataService.fetchDataAndSaveToDatabase();
    }
}

