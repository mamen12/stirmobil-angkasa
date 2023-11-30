package com.stir.mobil.angkasa.beans;

public class Operasional {
    private String idCabang;
    private String idKendaraan;
    private String idKaryawan;
    private String timeIn;
    private String timeOut;

    public Operasional(String idCabang, String idKendaraan, String idKaryawan, String timeIn, String timeOut) {
        this.idCabang = idCabang;
        this.idKendaraan = idKendaraan;
        this.idKaryawan = idKaryawan;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }
    public String getIdCabang() {
        return idCabang;
    }
    public void setIdCabang(String idCabang) {
        this.idCabang = idCabang;
    }
    public String getIdKendaraan() {
        return idKendaraan;
    }
    public void setIdKendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }
    public String getIdKaryawan() {
        return idKaryawan;
    }
    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }
    public String getTimeIn() {
        return timeIn;
    }
    public void setTimeIn(String timeIn) {
        this.timeIn = timeIn;
    }
    public String getTimeOut() {
        return timeOut;
    }
    public void setTimeOut(String timeOut) {
        this.timeOut = timeOut;
    }
    
}
