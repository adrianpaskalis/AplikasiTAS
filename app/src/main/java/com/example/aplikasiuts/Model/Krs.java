package com.example.aplikasiuts.Model;

public class Krs {
    private String kodeKrs;
    private String namaMatkul;
    private String hari;
    private String sks;
    private String sesi;
    private String dosenKrs;
    private String jmlMhs;

    public Krs(String kodeKrs, String namaMatkul, String hari, String sks, String sesi,
               String dosenKrs, String jmlMhs) {
        this.kodeKrs = kodeKrs;
        this.namaMatkul = namaMatkul;
        this.hari = hari;
        this.sks = sks;
        this.sesi = sesi;
        this.dosenKrs = dosenKrs;
        this.jmlMhs = jmlMhs;
    }

    public String getKodeKrs() {
        return kodeKrs;
    }

    public void setKodeKrs(String kodeKrs) {
        this.kodeKrs = kodeKrs;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }

    public String getSesi() {
        return sesi;
    }

    public void setSesi(String sesi) {
        this.sesi = sesi;
    }

    public String getDosenKrs() {
        return dosenKrs;
    }

    public void setDosenKrs(String dosenKrs) {
        this.dosenKrs = dosenKrs;
    }

    public String getJmlMhs() {
        return jmlMhs;
    }

    public void setJmlMhs(String jmlMhs) {
        this.jmlMhs = jmlMhs;
    }
}
