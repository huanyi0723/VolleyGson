package com.example.volleygson;


import android.app.Application;

public class MyApp extends Application{

  @Override
  public void onCreate() {
    super.onCreate();
    
    MyVolley.init(this);
  }
  
  
}
