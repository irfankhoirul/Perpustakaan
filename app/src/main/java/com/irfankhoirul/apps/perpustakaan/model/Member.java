package com.irfankhoirul.apps.perpustakaan.model;

import io.realm.RealmObject;

/**
 * Created by Irfan Khoirul on 26/05/2016.
 */
public class Member extends RealmObject {
    private String memberId;
    private String type;
    private long dateOfMembership;
    private int noOfBookIssued;
    private int maxBookLimit;
    private String name;
    private String address;
    private String phone;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(long dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public int getNoOfBookIssued() {
        return noOfBookIssued;
    }

    public void setNoOfBookIssued(int noOfBookIssued) {
        this.noOfBookIssued = noOfBookIssued;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public void setMaxBookLimit(int maxBookLimit) {
        this.maxBookLimit = maxBookLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
