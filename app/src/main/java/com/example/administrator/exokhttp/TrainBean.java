package com.example.administrator.exokhttp;

import java.util.List;

/**
 * Created by Administrator on 2016/5/21 0021.
 */
public class TrainBean {
    public String resultcode;
    public String reason;
    public Result result;
    private int error_code;
    public static class Result{
        public Train_Info train_info;
        public List<Station_List>station_list;
        public static class Train_Info{
            public String name;
            public String start;
            public String end;
            public String starttime;
            public String endtime;
            public String mileage;

            @Override
            public String toString() {
                return "Train_Info{" +
                        "end='" + end + '\'' +
                        ", name='" + name + '\'' +
                        ", start='" + start + '\'' +
                        ", starttime='" + starttime + '\'' +
                        ", endtime='" + endtime + '\'' +
                        ", mileage='" + mileage + '\'' +
                        '}';
            }
        }
        public static class Station_List{
            public String train_id;
            public String station_name;
            public String arrived_time;
            public String leave_time;
            public String mileage;
            public String fsoftSeat;
            public String ssoftSeat;
            public String hardSead;
            public String softSeat;
            public String hardSleep;
            public String softSleep;
            public String wuzuo;
            public String swz;
            public String tdz;
            public String gjrw;
            public String stay;

        }
    }
}
