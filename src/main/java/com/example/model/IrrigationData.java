package com.example.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class IrrigationData {
    private Long id;
    @JsonProperty("管理處名稱")
    private String managementName;
    @JsonProperty("工作站")
    private String station;
    @JsonProperty("名稱")
    private String name;
    @JsonProperty("採樣日期")
    private String samplingDate;
    @JsonProperty("水溫°C")
    private BigDecimal waterTemperature;
    @JsonProperty("pH值")
    private BigDecimal pHValue;
    @JsonProperty("EC(μS/cm)")
    private BigDecimal ecValue;
    @JsonProperty("備註")
    private String remarks;

    // Getter methods
    public Long getId() {
        return id;
    }
    public String getManagementName() {
        return managementName;
    }
    public String getStation() {
        return station;
    }
    public String getName() {
        return name;
    }
    public String getSamplingDate() {
        return samplingDate;
    }
    public BigDecimal getWaterTemperature() {
        return waterTemperature;
    }
    public BigDecimal getpHValue() {
        return pHValue;
    }
    public BigDecimal getEcValue() {
        return ecValue;
    }
    public String getRemarks() {
        return remarks;
    }

    // Setter methods
    public void setId(Long id) {
        this.id = id;
    }
    public void setManagementName(String managementName) {
        this.managementName = managementName;
    }
    public void setStation(String station) {
        this.station = station;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSamplingDate(String samplingDate) {
        this.samplingDate = samplingDate;
    }
    public void setWaterTemperature(BigDecimal waterTemperature) {
        this.waterTemperature = waterTemperature;
    }
    public void setpHValue(BigDecimal pHValue) {
        this.pHValue = pHValue;
    }
    public void setEcValue(BigDecimal ecValue) {
        this.ecValue = ecValue;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}

