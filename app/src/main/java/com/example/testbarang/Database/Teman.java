package com.example.testbarang.Database;

import java.io.Serializable;

public class Teman implements Serializable {
    String kode;
    String nama;
    String telpon;

    public Teman(String nm, String tlp) {
    }

    public Teman(String id, String nama, String telpon) {
        this.nama = nama;
        this.telpon = telpon;
    }

    public String getNama() { return nama; }

    public void setNama(String id) {this.nama = id; }

    public String getTelpon() { return telpon; }

    public void setTelpon(String id) {this.telpon = id; }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
}
