package com.example.administrator.exokhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.io.IOException;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    String url ="http://op.juhe.cn/onebox/weather/query";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            new Thread(){
                @Override
                public void run() {
                    try{

                    new GetWeather().run();}
                    catch (Exception e){

                    }
                }
            }.start();




    }
 public  class GetWeather{
     OkHttpClient client=new OkHttpClient();
     private void run() throws  Exception{
         Log.i("aaaa","run");
         RequestBody formBody = new FormBody.Builder()
                 .add("cityname", "重庆")
                 .add("key", "1adae4c7546c89639f2f5cc9c3a3d118")
                 .add("dtype","json")
                 .build();
         Request request = new Request.Builder()
                 .url(url)
                 .post(formBody)
                 .build();
         Response response = client.newCall(request).execute();
         if (!response.isSuccessful()){
             Log.i("aaaa",response.toString());
             throw new IOException("Unexpected code " + response);}
         Log.i("aaaa",response.body().string());
         System.out.println(response.body().string());
     }

 }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
