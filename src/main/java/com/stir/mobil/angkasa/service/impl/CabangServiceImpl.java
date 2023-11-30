package com.stir.mobil.angkasa.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stir.mobil.angkasa.beans.Cabang;
import com.stir.mobil.angkasa.beans.CabangRequest;
import com.stir.mobil.angkasa.dao.ICabangDao;
import com.stir.mobil.angkasa.service.ICabangService;

@Service
public class CabangServiceImpl implements ICabangService {

    @Autowired
    ICabangDao cabangDao;

    @Override
    public void deleteCabangById(String id) {
        cabangDao.deleteCabangById(id);        
    }

    @Override
    public List<Cabang> getAllCabang() {
       return cabangDao.getAllCabang();
    }

    @Override
    public Cabang getCabang(String id) {
        return cabangDao.getCabang(id);
    }

    @Override
    public void insertCabang(CabangRequest cbRequest) {

        Cabang cb = new Cabang(UUID.randomUUID().toString(), cbRequest.getNameCabang(), cbRequest.getAlamat(), cbRequest.getKota());
        cabangDao.insertCabang(cb);
    }

    @Override
    public void updateCabangById(String id, String name, String alamat, String kota) {
        cabangDao.updateCabangById(id, name, alamat, kota);
    }

    @Override
    public List<Cabang> getAllCabangByOwner() {
       List<Cabang> listCabang =  cabangDao.getAllCabang();
       
       listCabang.stream().forEach(
        cb -> cb.setOwner(cb.getKota().equals("Karawang") ? "Abdul Malik" : "")
       );
       return listCabang;
    }
    
    
    
}
