package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Ivan_Keung on 2016/12/25.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getcityName(){
        return cityName;
    }
    public void setcityName(String cityName){
        this.cityName=cityName;
    }
    public int getcityCode(){
        return cityCode;
    }
    public void setcityCode(int cityCode){
        this.cityCode=cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void getProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}
