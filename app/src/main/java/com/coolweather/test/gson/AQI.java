package com.coolweather.test.gson;

/**
 * Created by Administrator on 2017/11/30.
 */

public class AQI {
    public AQICity city;
    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
