package com.example.aplikasiuts.Model;

public class Dosen {
    private String namaDosen;
    private String nidn;
    private String gelar;
    private String emailDsn;
    private String alamatDsn;
    private int fotoDsn;

    public Dosen(String namaDosen, String nidn, String gelar, String emailDsn, String alamatDsn, int fotoDsn) {
        this.nidn = nidn;
        this.namaDosen = namaDosen;
        this.gelar = gelar;
        this.emailDsn = emailDsn;
        this.alamatDsn = alamatDsn;
        this.fotoDsn = fotoDsn;
    }

    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getEmailDsn() {
        return emailDsn;
    }

    public void setEmailDsn(String emailDsn) {
        this.emailDsn = emailDsn;
    }

    public String getAlamatDsn() {
        return alamatDsn;
    }

    public void setAlamatDsn(String alamatDsn) {
        this.alamatDsn = alamatDsn;
    }

    public int getFotoDsn() {
        return fotoDsn;
    }

    public void setFotoDsn(int fotoDsn) {
        this.fotoDsn = fotoDsn;
    }
}
