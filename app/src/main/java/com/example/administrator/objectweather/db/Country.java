package com.example.administrator.objectweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/7/2.
 */

public class Country extends DataSupport {
    private int id;

    private String countryName;

    private String weatherId;//对应的县城的天气id

    private int cityId;//当前县城所属的城市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
