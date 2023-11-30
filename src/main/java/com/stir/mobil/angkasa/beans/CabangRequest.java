package com.stir.mobil.angkasa.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CabangRequest {
    
    @JsonProperty(value = "id_cabang")
    private String idCabang;

    @JsonProperty(value = "nama_cabang")
    private String nameCabang;

    @JsonProperty(value = "alamat_cabang")
    private String alamat;

    @JsonProperty(value ="region")
    private String kota;

    public String getIdCabang() {
        return idCabang;
    }
    public void setIdCabang(String idCabang) {
        this.idCabang = idCabang;
    }
    public String getNameCabang() {
        return nameCabang;
    }
    public void setNameCabang(String nameCabang) {
        this.nameCabang = nameCabang;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    public String getKota() {
        return kota;
    }
    public void setKota(String kota) {
        this.kota = kota;
    }

    

}
