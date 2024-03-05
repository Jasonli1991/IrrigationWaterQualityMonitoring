package com.example.mapper;

import com.example.model.IrrigationData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IrrigationDataMapper {
    void insertIrrigationData(IrrigationData data);
    void deleteAllIrrigationData();
}
