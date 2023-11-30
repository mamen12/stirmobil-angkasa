package com.stir.mobil.angkasa.service;

import java.util.List;

import com.stir.mobil.angkasa.beans.Operasional;

public interface IOperasionalService {
    public void insertOperasional(Operasional Operasional);

    public Operasional getOperasional(String id);

    public void deleteOperasionalById(String id);
    
    public void updateOperasionalById(String id);

    public List<Operasional> getAllOperasional();

    public List<Operasional> getListOperasionalByIdCabang(String id);

    public List<Operasional> getListOperasionalByIdKendaraan(String id);

    public List<Operasional> geListOperasionalByIdKendaraan(String id);
}
