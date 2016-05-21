package com.example.administrator.exokhttp;

import java.security.PublicKey;
import java.sql.ParameterMetaData;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
public class JsonBeanWeather {
    public String reason;
    public Result result;
    public int error_code;
    public static class Result{
        public Data data;
        public static class  Data{
            public Realtime realtime;
            public Life life;
            public List<Weather> weather;
            public  PM25 pm25;
            public String data;
            public int isForeign;
            public static class Realtime{
                public String city_code;
                public String city_name;
                public String date;
                public String time;
                public String week;
                public String moon;
                public int dataUptime;
                public Weather weather;
                public Wind wind;
                public static class Weather{
                    public String temperature;
                    public String humidity;
                    public String info;
                    public String img;

                    @Override
                    public String toString() {
                        return "Weather{" +
                                "humidity='" + humidity + '\'' +
                                ", temperature='" + temperature + '\'' +
                                ", info='" + info + '\'' +
                                ", img='" + img + '\'' +
                                '}';
                    }
                }
                public static class Wind{
                    public String direct;
                    public String power;
                    public String offset;
                    public String windspeed;

                    @Override
                    public String toString() {
                        return "Wind{" +
                                "direct='" + direct + '\'' +
                                ", power='" + power + '\'' +
                                ", offset='" + offset + '\'' +
                                ", windspeed='" + windspeed + '\'' +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "Realtime{" +
                            "city_code='" + city_code + '\'' +
                            ", city_name='" + city_name + '\'' +
                            ", date='" + date + '\'' +
                            ", time='" + time + '\'' +
                            ", week='" + week + '\'' +
                            ", moon='" + moon + '\'' +
                            ", dataUptime=" + dataUptime +
                            ", weather=" + weather +
                            ", wind=" + wind +
                            '}';
                }
            }
            public static class Life{
                public String data;
                public Info info;
                static class Info{
                    public String[] chuanyi;
                    public String[] ganmao;
                    public String[] kongtiao;
                    public String[] wuren;
                    public String[] xiche;
                    public String[] yundong;
                    public String[] ziwaixian;

                    @Override
                    public String toString() {
                        return "Info{" +
                                "chuanyi=" + Arrays.toString(chuanyi) +
                                ", ganmao=" + Arrays.toString(ganmao) +
                                ", kongtiao=" + Arrays.toString(kongtiao) +
                                ", wuren=" + Arrays.toString(wuren) +
                                ", xiche=" + Arrays.toString(xiche) +
                                ", yundong=" + Arrays.toString(yundong) +
                                ", ziwaixian=" + Arrays.toString(ziwaixian) +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "Life{" +
                            "data='" + data + '\'' +
                            ", info=" + info +
                            '}';
                }
            }
            public static class Weather{
                public String data;
                public Info info;
                public String week;
                public String nongli;
                static class Info{
                    List<Dure> dureList;
                    static class Dure{
                        public String[] tianqi;

                        @Override
                        public String toString() {
                            return "Dure{" +
                                    "tianqi=" + Arrays.toString(tianqi) +
                                    '}';
                        }
                    }

                    @Override
                    public String toString() {
                        return "Info{" +
                                "dureList=" + dureList +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "Weather{" +
                            "data='" + data + '\'' +
                            ", info=" + info +
                            ", week='" + week + '\'' +
                            ", nongli='" + nongli + '\'' +
                            '}';
                }
            }
            public static class PM25{
                public String key;
                public int show_desc;
                public Pm25 pm25;
                public String dateTime;
                public String cityName;
                public static class Pm25 {
                    public String curPm;
                    public String pm25;
                    public String pm10;
                    public int level;
                    public String quality;
                    public String des;

                    @Override
                    public String toString() {
                        return "Pm25{" +
                                "curPm='" + curPm + '\'' +
                                ", pm25='" + pm25 + '\'' +
                                ", pm10='" + pm10 + '\'' +
                                ", level=" + level +
                                ", quality='" + quality + '\'' +
                                ", des='" + des + '\'' +
                                '}';
                    }
                }

                @Override
                public String toString() {
                    return "PM25{" +
                            "cityName='" + cityName + '\'' +
                            ", key='" + key + '\'' +
                            ", show_desc=" + show_desc +
                            ", pm25=" + pm25 +
                            ", dateTime='" + dateTime + '\'' +
                            '}';
                }
            }

            @Override
            public String toString() {
                return "Data{" +
                        "data='" + data + '\'' +
                        ", realtime=" + realtime +
                        ", life=" + life +
                        ", weather=" + weather +
                        ", pm25=" + pm25 +
                        ", isForeign=" + isForeign +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "Result{" +
                    "data=" + data +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "JsonBeanWeather{" +
                "error_code=" + error_code +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                '}';
    }
}


