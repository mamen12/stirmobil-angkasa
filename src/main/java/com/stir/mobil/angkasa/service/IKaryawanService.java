package com.stir.mobil.angkasa.service;

import java.util.List;

import com.stir.mobil.angkasa.beans.Karyawan;

public interface IKaryawanService {
    public void insertKaryawan(Karyawan karyawan);

    public Karyawan getKaryawan(String id);

    public void deleteKaryawanById(String id);
    
    public void updateKaryawanById(String id);

    public List<Karyawan> getListKaryawan();

    public List<Karyawan> getListKaryawanByIdCabang(String id);

}
