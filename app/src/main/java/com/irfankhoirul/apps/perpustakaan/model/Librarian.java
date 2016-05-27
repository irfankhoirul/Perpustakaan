package com.irfankhoirul.apps.perpustakaan.model;

import io.realm.RealmObject;

/**
 * Created by Irfan Khoirul on 26/05/2016.
 */
public class Librarian extends RealmObject {
    private String id;
    private String name;
    private String password;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
