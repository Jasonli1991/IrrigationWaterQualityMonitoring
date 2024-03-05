package com.example.mapper;

import com.example.model.IrrigationData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface IrrigationDataMapper {
    void insertIrrigationData(IrrigationData data);
    void deleteAllIrrigationData();

    // 新增的方法，用於獲取所有站點的列表
    List<String> getDistinctStations();

    // 新增的方法，用於根據站點獲取最新的數據
    IrrigationData getLatestDataByStation(String station);
}

