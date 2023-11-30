package com.stir.mobil.angkasa.service;

import java.util.List;

import com.stir.mobil.angkasa.beans.Cabang;
import com.stir.mobil.angkasa.beans.CabangRequest;

/**
 * ICabangService
 */
public interface ICabangService {

    public void insertCabang(CabangRequest cb);

    public Cabang getCabang(String id);

    public void deleteCabangById(String id);
    
    public void updateCabangById(String id, String name, String alamat, String kota);

    public List<Cabang> getAllCabang();

    public List<Cabang> getAllCabangByOwner();
}