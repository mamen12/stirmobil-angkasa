package com.stir.mobil.angkasa.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Kendaraan {
    @JsonProperty(value = "id_cabang")
    private String idCabang;

    @JsonProperty(value = "id_kendaraan")
    private String idKendaraan;

    @JsonProperty(value = "name_kendaraan")
    private String namaKendaraan;
    
    public Kendaraan(String idCabang, String idKendaraan, String namaKendaraan) {
        this.idCabang = idCabang;
        this.idKendaraan = idKendaraan;
        this.namaKendaraan = namaKendaraan;
    }

    /**
     * @return String return the idCabang
     */
    public String getIdCabang() {
        return idCabang;
    }


    /**
     * @param idCabang the idCabang to set
     */
    public void setIdCabang(String idCabang) {
        this.idCabang = idCabang;
    }

    /**
     * @return String return the idKendaraan
     */
    public String getIdKendaraan() {
        return idKendaraan;
    }

    /**
     * @param idKendaraan the idKendaraan to set
     */
    public void setIdKendaraan(String idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    /**
     * @return String return the namaKendaraan
     */
    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    /**
     * @param namaKendaraan the namaKendaraan to set
     */
    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

}
