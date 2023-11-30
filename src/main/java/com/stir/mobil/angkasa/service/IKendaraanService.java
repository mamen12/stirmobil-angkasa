package com.stir.mobil.angkasa.service;

import java.util.List;

import com.stir.mobil.angkasa.beans.Kendaraan;

public interface IKendaraanService {

    public void insertKendaraan(Kendaraan kendaraan);

    public Kendaraan getKendaraan(String id);

    public void deleteKendaraanById(String id);
    
    public void updateKendaraanById(String id);

    public List<Kendaraan> getAllKendaraan();

    public List<Kendaraan> getListKendaraanByIdCabang(String id);
}
