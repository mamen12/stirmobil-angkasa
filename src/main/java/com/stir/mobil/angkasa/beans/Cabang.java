package com.stir.mobil.angkasa.beans;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class Cabang  implements Serializable{

    @JsonProperty(value = "id_cabang")
    private String idCabang;

    @JsonProperty(value = "nama")
    private String nama;

    @JsonProperty(value = "alamat")
    private String alamat;

    @JsonProperty(value = "kota")
    private String kota;

    @JsonProperty(value ="owner")
    private String owner;
    
    public Cabang(String idCabang, String nama, String alamat, String kota) {
        this.idCabang = idCabang;
        this.nama = nama;
        this.alamat = alamat;
        this.kota = kota;
    }

    public Cabang() {
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
     * @return String return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return String return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return String return the kota
     */
    public String getKota() {
        return kota;
    }

    /**
     * @param kota the kota to set
     */
    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    
}
