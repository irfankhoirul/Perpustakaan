package com.irfankhoirul.apps.perpustakaan.model;

import io.realm.RealmObject;

/**
 * Created by Irfan Khoirul on 26/05/2016.
 */
public class Book extends RealmObject {
    private String bookId;
    private String author;
    private String title;
    private Long price;
    private String rackNo;
    private String status;
    private String edition;
    private Long dateOfPurchase;

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getRackNo() {
        return rackNo;
    }

    public void setRackNo(String rackNo) {
        this.rackNo = rackNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public Long getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Long dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}
