package com.stir.mobil.angkasa.beans;

public class Karyawan {
    
    private String idCabang;

    private String idKaryawan;

    private String nip;

    private String nama;

    private String isActive;

    public Karyawan(String idCabang, String idKaryawan, String nip, String nama, String isActive) {
        this.idCabang = idCabang;
        this.idKaryawan = idKaryawan;
        this.nip = nip;
        this.nama = nama;
        this.isActive = isActive;
    }

    public String getIdCabang() {
        return idCabang;
    }

    public void setIdCabang(String idCabang) {
        this.idCabang = idCabang;
    }

    public String getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getIsActive() {
        return isActive;
    }

    public void setIsActive(String isActive) {
        this.isActive = isActive;
    }

    
}
