package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by zhodui on 2018/10/15.
 */

public class City extends DataSupport{
    private int id;
    private String citynName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCitynName() {
        return citynName;
    }

    public void setCitynName(String citynName) {
        this.citynName = citynName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
