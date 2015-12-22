package com.example.volleygson;

import java.util.ArrayList;

public class Cloud103Entity {

  private ArrayList<String> bindlist;
  private String message;// 返回信息
  private String sessionkey;// 登录成功后，后续操作以此sessionKey为准
  private String username;
  private short subversion = 0;// 业务接口协议版本号
  private String email;// email号码账号
  private long meiid;// 美贝壳内部id
  private int faceid;// 用户头像id
  private int code;// 返回码
  private String faceurl;// 用户头像url
  private String mobile;// 手机号码账号
  private int function;

  public ArrayList<String> getBindlist() {
    return this.bindlist;
  }

  public void setBindlist(ArrayList<String> bindlist) {
    this.bindlist = bindlist;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getSessionkey() {
    return this.sessionkey;
  }

  public void setSessionkey(String sessionkey) {
    this.sessionkey = sessionkey;
  }

  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public short getSubversion() {
    return this.subversion;
  }

  public void setSubversion(short subversion) {
    this.subversion = subversion;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getMeiid() {
    return this.meiid;
  }

  public void setMeiid(long meiid) {
    this.meiid = meiid;
  }

  public int getFaceid() {
    return this.faceid;
  }

  public void setFaceid(int faceid) {
    this.faceid = faceid;
  }

  public int getCode() {
    return this.code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getFaceurl() {
    return this.faceurl;
  }

  public void setFaceurl(String faceurl) {
    this.faceurl = faceurl;
  }

  public String getMobile() {
    return this.mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public int getFunction() {
    return this.function;
  }

  public void setFunction(int function) {
    this.function = function;
  }

  /**
   * 
   * { "bindlist": [ "C001B00010000008" ], "message": "登录成功", "sessionkey":
   * "DC385A65D2FEA3FB2021F3F717B4FCD1", "username": "", "subversion": 0,
   * "email": "mm730@mbk.com", "meiid": 1000023, "faceid": 0, "code": 0,
   * "faceurl": "", "mobile": "", "function": "103" }
   */
}
