package com.example.aplikasiuts.Model;

public class Kelas {
    private String kodeKelas;
    private String namaKelas;
    private String sksKelas;
    private String hariKelas;
    private String dosenKelas;
    private String jumlahMhsKelas;

    public Kelas(String kodeKelas, String namaKelas, String sksKelas, String hariKelas,
                 String dosenKelas, String jumlahMhsKelas) {
        this.kodeKelas = kodeKelas;
        this.namaKelas = namaKelas;
        this.sksKelas = sksKelas;
        this.hariKelas = hariKelas;
        this.dosenKelas = dosenKelas;
        this.jumlahMhsKelas = jumlahMhsKelas;
    }

    public String getKodeKelas() {
        return kodeKelas;
    }

    public void setKodeKelas(String kodeKelas) {
        this.kodeKelas = kodeKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getSksKelas() {
        return sksKelas;
    }

    public void setSksKelas(String sksKelas) {
        this.sksKelas = sksKelas;
    }

    public String getHariKelas() {
        return hariKelas;
    }

    public void setHariKelas(String hariKelas) {
        this.hariKelas = hariKelas;
    }

    public String getDosenKelas() {
        return dosenKelas;
    }

    public void setDosenKelas(String dosenKelas) {
        this.dosenKelas = dosenKelas;
    }

    public String getJumlahMhsKelas() {
        return jumlahMhsKelas;
    }

    public void setJumlahMhsKelas(String jumlahMhsKelas) {
        this.jumlahMhsKelas = jumlahMhsKelas;
    }
}