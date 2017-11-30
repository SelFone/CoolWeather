package com.coolweather.test.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/11/30.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        public String info;
    }
}
