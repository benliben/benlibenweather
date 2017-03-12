package com.example.administrator.benlibenweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/12:55.
 * Developer by LiYuanzXiong.
 * 县
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县的名称
    private String weatherId;//县对应的天气id
    private int cityId;//当前所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
