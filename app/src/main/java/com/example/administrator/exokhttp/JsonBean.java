package com.example.administrator.exokhttp;

import java.security.PublicKey;
import java.sql.ParameterMetaData;
import java.util.Arrays;
import java.util.List;

import javax.xml.transform.Result;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
public class JsonBean {
    public String resultcode;
    public String reason;
    public Result result;

    public static class Result {
        public String province;
        public String city;
        public String areacode;
        public String zip;
        public String company;
        public String card;
    }


    @Override
    public String toString() {
        return "JsonBean{" +
                "reason='" + reason + '\'' +
                ", resultcode='" + resultcode + '\'' +
                ", result=" + result +
                '}';
    }
}


