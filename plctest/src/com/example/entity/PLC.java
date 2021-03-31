package com.example.entity;

public class PLC {
    boolean switch1;
    Integer tem;
    String str1;
    String str2;

    public PLC(boolean switch1, Integer tem, String str1, String str2) {
        this.switch1 = switch1;
        this.tem = tem;
        this.str1 = str1;
        this.str2 = str2;
    }


    public boolean isSwitch1() {
        return switch1;
    }

    public void setSwitch1(boolean switch1) {
        this.switch1 = switch1;
    }

    public Integer getTem() {
        return tem;
    }

    public void setTem(Integer tem) {
        this.tem = tem;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }
}
