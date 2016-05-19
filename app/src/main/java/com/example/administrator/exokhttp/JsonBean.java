package com.example.administrator.exokhttp;

import java.security.PublicKey;
import java.sql.ParameterMetaData;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/5/19 0019.
 */
public class JsonBean {
    public String reason;
    public Result result;
    public String error_code;
    static class Result{
        public Data data;
        static class  Data{
            public Realtime realtime;
            public Life life;
            public List<Weather> weatherList;
            public  PM Pm;
            public String datatime;
            public int isforeign;
            static class Realtime{
                public String city_code;
                public String city_name;
                public String date;
                public String time;
                public String week;
                public String moon;
                public String dataUptime;
                public Weather weather;
                public Wind wind;
                static class Weather{
                    public String temperature;
                    public String humidity;
                    public String info;
                    public String img;

                    public String getHumidity() {
                        return humidity;
                    }

                    public void setHumidity(String humidity) {
                        this.humidity = humidity;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }

                    public String getInfo() {
                        return info;
                    }

                    public void setInfo(String info) {
                        this.info = info;
                    }

                    public String getTemperature() {
                        return temperature;
                    }

                    public void setTemperature(String temperature) {
                        this.temperature = temperature;
                    }

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
                static class Wind{
                    public String direct;
                    public String power;
                    public String offset;
                    public String windspeed;

                    public String getDirect() {
                        return direct;
                    }

                    public void setDirect(String direct) {
                        this.direct = direct;
                    }

                    public String getOffset() {
                        return offset;
                    }

                    public void setOffset(String offset) {
                        this.offset = offset;
                    }

                    public String getPower() {
                        return power;
                    }

                    public void setPower(String power) {
                        this.power = power;
                    }

                    public String getWindspeed() {
                        return windspeed;
                    }

                    public void setWindspeed(String windspeed) {
                        this.windspeed = windspeed;
                    }

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

                public String getCity_code() {
                    return city_code;
                }

                public void setCity_code(String city_code) {
                    this.city_code = city_code;
                }

                public String getCity_name() {
                    return city_name;
                }

                public void setCity_name(String city_name) {
                    this.city_name = city_name;
                }

                public String getDataUptime() {
                    return dataUptime;
                }

                public void setDataUptime(String dataUptime) {
                    this.dataUptime = dataUptime;
                }

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getMoon() {
                    return moon;
                }

                public void setMoon(String moon) {
                    this.moon = moon;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public Weather getWeather() {
                    return weather;
                }

                public void setWeather(Weather weather) {
                    this.weather = weather;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
                }

                public Wind getWind() {
                    return wind;
                }

                public void setWind(Wind wind) {
                    this.wind = wind;
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
                            ", dataUptime='" + dataUptime + '\'' +
                            ", weather=" + weather +
                            ", wind=" + wind +
                            '}';
                }
            }
            static class Life{
                public String data;
                public Info info;
                static class Info{
                    public String[] chuanyi=new String[2];
                    public String[] ganmao=new String[2];
                    public String[] kongtiao=new String[2];
                    public String[] wuren=new String[2];
                    public String[] xiche=new String[2];
                    public String[] yundong=new String[2];
                    public String[] ziwaixian=new String[2];

                    public String[] getChuanyi() {
                        return chuanyi;
                    }

                    public void setChuanyi(String[] chuanyi) {
                        this.chuanyi = chuanyi;
                    }

                    public String[] getGanmao() {
                        return ganmao;
                    }

                    public void setGanmao(String[] ganmao) {
                        this.ganmao = ganmao;
                    }

                    public String[] getKongtiao() {
                        return kongtiao;
                    }

                    public void setKongtiao(String[] kongtiao) {
                        this.kongtiao = kongtiao;
                    }

                    public String[] getWuren() {
                        return wuren;
                    }

                    public void setWuren(String[] wuren) {
                        this.wuren = wuren;
                    }

                    public String[] getXiche() {
                        return xiche;
                    }

                    public void setXiche(String[] xiche) {
                        this.xiche = xiche;
                    }

                    public String[] getYundong() {
                        return yundong;
                    }

                    public void setYundong(String[] yundong) {
                        this.yundong = yundong;
                    }

                    public String[] getZiwaixian() {
                        return ziwaixian;
                    }

                    public void setZiwaixian(String[] ziwaixian) {
                        this.ziwaixian = ziwaixian;
                    }

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

                public String getData() {
                    return data;
                }

                public void setData(String data) {
                    this.data = data;
                }

                public Info getInfo() {
                    return info;
                }

                public void setInfo(Info info) {
                    this.info = info;
                }

                @Override
                public String toString() {
                    return "Life{" +
                            "data='" + data + '\'' +
                            ", info=" + info +
                            '}';
                }
            }
            static class Weather{
                public String data;
                public Info info;
                public String week;
                public String nongli;
                static class Info{
                    List<Dure> dureList;
                    static class Dure{
                        public String[] tianqi=new String[5];

                        public String[] getTianqi() {
                            return tianqi;
                        }

                        public void setTianqi(String[] tianqi) {
                            this.tianqi = tianqi;
                        }

                        @Override
                        public String toString() {
                            return "Dure{" +
                                    "tianqi=" + Arrays.toString(tianqi) +
                                    '}';
                        }
                    }

                    public List<Dure> getDureList() {
                        return dureList;
                    }

                    public void setDureList(List<Dure> dureList) {
                        this.dureList = dureList;
                    }

                    @Override
                    public String toString() {
                        return "Info{" +
                                "dureList=" + dureList +
                                '}';
                    }
                }

                public String getData() {
                    return data;
                }

                public void setData(String data) {
                    this.data = data;
                }

                public Info getInfo() {
                    return info;
                }

                public void setInfo(Info info) {
                    this.info = info;
                }

                public String getNongli() {
                    return nongli;
                }

                public void setNongli(String nongli) {
                    this.nongli = nongli;
                }

                public String getWeek() {
                    return week;
                }

                public void setWeek(String week) {
                    this.week = week;
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
            static class PM{
                public String key;
                public String show_desc;
                public PM25 pm25;
                public String dateTime;
                public String cityName;
                static class PM25 {
                    public String curPm;
                    public String pm25;
                    public String pm10;
                    public String level;
                    public String quality;
                    public String des;

                    public String getCurPm() {
                        return curPm;
                    }

                    public void setCurPm(String curPm) {
                        this.curPm = curPm;
                    }

                    public String getDes() {
                        return des;
                    }

                    public void setDes(String des) {
                        this.des = des;
                    }

                    public String getLevel() {
                        return level;
                    }

                    public void setLevel(String level) {
                        this.level = level;
                    }

                    public String getPm10() {
                        return pm10;
                    }

                    public void setPm10(String pm10) {
                        this.pm10 = pm10;
                    }

                    public String getPm25() {
                        return pm25;
                    }

                    public void setPm25(String pm25) {
                        this.pm25 = pm25;
                    }

                    public String getQuality() {
                        return quality;
                    }

                    public void setQuality(String quality) {
                        this.quality = quality;
                    }

                    @Override
                    public String toString() {
                        return "PM25{" +
                                "curPm='" + curPm + '\'' +
                                ", pm25='" + pm25 + '\'' +
                                ", pm10='" + pm10 + '\'' +
                                ", level='" + level + '\'' +
                                ", quality='" + quality + '\'' +
                                ", des='" + des + '\'' +
                                '}';
                    }
                }

                public String getCityName() {
                    return cityName;
                }

                public void setCityName(String cityName) {
                    this.cityName = cityName;
                }

                public String getDateTime() {
                    return dateTime;
                }

                public void setDateTime(String dateTime) {
                    this.dateTime = dateTime;
                }

                public String getKey() {
                    return key;
                }

                public void setKey(String key) {
                    this.key = key;
                }

                public PM25 getPm25() {
                    return pm25;
                }

                public void setPm25(PM25 pm25) {
                    this.pm25 = pm25;
                }

                public String getShow_desc() {
                    return show_desc;
                }

                public void setShow_desc(String show_desc) {
                    this.show_desc = show_desc;
                }

                @Override
                public String toString() {
                    return "PM{" +
                            "cityName='" + cityName + '\'' +
                            ", key='" + key + '\'' +
                            ", show_desc='" + show_desc + '\'' +
                            ", pm25=" + pm25 +
                            ", dateTime='" + dateTime + '\'' +
                            '}';
                }
            }

            public String getDatatime() {
                return datatime;
            }

            public void setDatatime(String datatime) {
                this.datatime = datatime;
            }

            public int getIsforeign() {
                return isforeign;
            }

            public void setIsforeign(int isforeign) {
                this.isforeign = isforeign;
            }

            public Life getLife() {
                return life;
            }

            public void setLife(Life life) {
                this.life = life;
            }

            public PM getPm() {
                return Pm;
            }

            public void setPm(PM pm) {
                Pm = pm;
            }

            public Realtime getRealtime() {
                return realtime;
            }

            public void setRealtime(Realtime realtime) {
                this.realtime = realtime;
            }

            public List<Weather> getWeatherList() {
                return weatherList;
            }

            public void setWeatherList(List<Weather> weatherList) {
                this.weatherList = weatherList;
            }

            @Override
            public String toString() {
                return "Data{" +
                        "datatime='" + datatime + '\'' +
                        ", realtime=" + realtime +
                        ", life=" + life +
                        ", weatherList=" + weatherList +
                        ", Pm=" + Pm +
                        ", isforeign=" + isforeign +
                        '}';
            }
        }

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Result{" +
                    "data=" + data +
                    '}';
        }
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "JsonBean{" +
                "error_code='" + error_code + '\'' +
                ", reason='" + reason + '\'' +
                ", result=" + result +
                '}';
    }
}


