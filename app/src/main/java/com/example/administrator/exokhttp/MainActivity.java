package com.example.administrator.exokhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Map;

import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    String url ="http://op.juhe.cn/onebox/weather/query";
    private EditText edit;
    private TextView textView;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            edit=(EditText)findViewById(R.id.myedit);
        textView=(TextView)findViewById(R.id.mytext);
        btn=(Button)findViewById(R.id.btn);

          btn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  new Thread(){
                      @Override
                      public void run() {
                          try{
                              new GetWeather().run();}
                          catch (Exception e){
                              Log.i("aaaa","Exception"+e.getCause()+e.getMessage());
                          }
                      }
                  }.start();
              }
          });




    }
 public  class GetWeather{
     OkHttpClient client=new OkHttpClient();
     String string = edit.getText().toString();
     private void run() {
         Request request = new Request.Builder()
                 .url("http://apis.juhe.cn/mobile/get?phone="+string+"&key="
                 +"2f121eb8bf260e938df638ec3cc2e5d4")
                 .get()
                 .build();
         try{
             Response response = client.newCall(request).execute();

             //System.out.println(response.body().string());

             Gson gson = new Gson();
             java.lang.reflect.Type type = new TypeToken<JsonBean>() {}.getType();
             final JsonBean jsonBean = gson.fromJson(response.body().string(), type);
             MainActivity.this.runOnUiThread(new Runnable() {
                 @Override
                 public void run() {
                     textView.setText("归属地：" + jsonBean.result.city);
                 }
             });

             Log.i("json------", jsonBean.result.city);
         }catch (Exception e){
             Log.i("json------", e.getMessage()+"/"+e.getCause());
         }

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
