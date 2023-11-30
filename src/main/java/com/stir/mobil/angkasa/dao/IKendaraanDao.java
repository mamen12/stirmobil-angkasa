package com.stir.mobil.angkasa.dao;

import java.util.List;

import com.stir.mobil.angkasa.beans.Kendaraan;

public interface IKendaraanDao {

    public void insertKendaraan(Kendaraan kendaraan);

    public Kendaraan getKendaraan(String id);

    public void deleteKendaraanById(String id);
    
    public void updateKendaraanById(String id);

    public List<Kendaraan> getAllKendaraan();

    public List<Kendaraan> getListKendaraanByIdCabang(String id);
}
