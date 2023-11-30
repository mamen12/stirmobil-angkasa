package com.stir.mobil.angkasa.dao;

import java.util.List;

import com.stir.mobil.angkasa.beans.Karyawan;

public interface IKaryawanDao {
    public void insertKaryawan(Karyawan karyawan);

    public Karyawan getKaryawan(String id);

    public void deleteKaryawanById(String id);
    
    public void updateKaryawanById(String id);

    public List<Karyawan> getListKaryawan();

    public List<Karyawan> getListKaryawanByIdCabang(String id);

}
