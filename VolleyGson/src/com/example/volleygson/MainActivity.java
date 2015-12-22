package com.example.volleygson;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.Request.Method;
import com.android.volley.toolbox.Volley;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
  
  TextView show;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    show = (TextView)findViewById(R.id.show);
    
    Button test = (Button)findViewById(R.id.test);
    test.setOnClickListener(new View.OnClickListener() {
      
      @Override
      public void onClick(View v) {
        
        RequestQueue queue = MyVolley.getRequestQueue();
        GsonRequestNew<Cloud103Entity> myReq = new GsonRequestNew<Cloud103Entity>(Method.POST,
                                                "http://192.168.2.33:8084/mcloud/cloudclub/cloudService",
                                                Cloud103Entity.class,
                                                createMyReqSuccessListener(),
                                                createMyReqErrorListener()){
          //传参数
          protected Map<String, String> getParams() throws com.android.volley.AuthFailureError {
            Map<String, String> params = new HashMap<String, String>();
            params.put("mainversion", "1.0");
            params.put("commoninfo", getCommoninfo());
            params.put("json", getJson());
            Log.i("TAG", "发送参数" + params);
            return params;
        };
          
        };
        
        Log.i("TAG", "发送URL" + "http://192.168.2.33:8084/mcloud/cloudclub/cloudService");
        

        queue.add(myReq);
        
      }
    });
  }
  
  
  protected String getCommoninfo() {

    JSONObject commoninfo = new JSONObject();
    try {
      commoninfo.put("commonversion", "1.0");
      commoninfo.put("clienttype", "3");
      commoninfo.put("clientversion", "6.0");
      commoninfo.put("clientdescription", "goof");
      commoninfo.put("timestamp", "1450765392640");
      commoninfo.put("format", "json");
    } catch (JSONException e) {
      Log.i("TAG", "e---" + e.getMessage());
    }
    
    
    return commoninfo.toString();
  }
  
  protected String getJson() {
    
    JSONObject json = new JSONObject();
    try {
    json.put("function", 103);
    json.put("subversion", 0);
    json.put("userid", "mm730@mbk.com");
    json.put("password", "e10adc3949ba59abbe56e057f20f883e");
    json.put("accounttype", 0);
    } catch (JSONException e) {
      Log.i("TAG", "e---" + e.getMessage());
    }
    
    return json.toString();
  }
  
  
  private Response.Listener<Cloud103Entity> createMyReqSuccessListener() {
      return new Response.Listener<Cloud103Entity>() {
          @Override
          public void onResponse(Cloud103Entity response) {
            show.setText(response.getMessage());
          }
      };
  }
  
  
  private Response.ErrorListener createMyReqErrorListener() {
      return new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            show.setText(error.getMessage());
          }
      };
  }
  
  
  
}
