package com.example.service;

import com.example.mapper.IrrigationDataMapper;
import com.example.model.IrrigationData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class IrrigationDataService {

    private final RestTemplate restTemplate;
    private final IrrigationDataMapper irrigationDataMapper;

    @Autowired
    public IrrigationDataService(RestTemplate restTemplate, IrrigationDataMapper irrigationDataMapper) {
        this.restTemplate = restTemplate;
        this.irrigationDataMapper = irrigationDataMapper;
    }

    @Transactional
    public void fetchDataAndSaveToDatabase() {
        String apiUrl = "https://data.moa.gov.tw/Service/OpenData/DataFileService.aspx?UnitId=789&IsTransData=1";
        System.out.println("Fetching data from API...");

        // 發送 API 請求並獲取數據
        IrrigationData[] dataFromApi = restTemplate.getForObject(apiUrl, IrrigationData[].class);

        // 先刪除所有數據
        irrigationDataMapper.deleteAllIrrigationData();

        // 將獲取的數據保存到資料庫
        if (dataFromApi != null) {
            saveDataToDatabase(Arrays.asList(dataFromApi));
        } else {
            System.out.println("dataFromApi is null.");
        }

    }

    private void saveDataToDatabase(List<IrrigationData> irrigationDataList) {
        // 調用 MyBatis Mapper 接口進行數據庫存儲
        for (IrrigationData irrigationData : irrigationDataList) {
            irrigationDataMapper.insertIrrigationData(irrigationData);
        }
    }

}
