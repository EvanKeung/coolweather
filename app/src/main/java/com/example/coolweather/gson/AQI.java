package com.example.coolweather.gson;

/**
 * Created by Ivan_Keung on 2016/12/26.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
