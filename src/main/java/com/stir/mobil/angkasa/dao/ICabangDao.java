package com.stir.mobil.angkasa.dao;

import java.util.List;

import com.stir.mobil.angkasa.beans.Cabang;

/**
 * ICabangService
 */
public interface ICabangDao {

    public void insertCabang(Cabang cb);

    public Cabang getCabang(String id);

    public void deleteCabangById(String id);
    
    public void updateCabangById(String id, String name, String kota, String alamat);

    public List<Cabang> getAllCabang();
}