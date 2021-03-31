package com.example.daomain;

public class Sale {
    int id;
    int gid;
    int nums;

    public Sale() {
    }

    public Sale(int id, int gid, int nums) {
        this.id = id;
        this.gid = gid;
        this.nums = nums;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }

    public int getId() {
        return id;
    }

    public int getGid() {
        return gid;
    }

    public int getNums() {
        return nums;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", gid=" + gid +
                ", nums=" + nums +
                '}';
    }
}
