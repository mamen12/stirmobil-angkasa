package com.stir.mobil.angkasa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stir.mobil.angkasa.beans.Cabang;
import com.stir.mobil.angkasa.beans.CabangRequest;
import com.stir.mobil.angkasa.beans.CabangResponse;
import com.stir.mobil.angkasa.beans.Request;
import com.stir.mobil.angkasa.service.ICabangService;

@RestController
@RequestMapping(path = "/cabang")
public class CabangController {

    @Autowired
    private ICabangService cabangService;

    @RequestMapping(value = "/ins", method =RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void insertCabang(@RequestBody Request<CabangRequest> rq){
        cabangService.insertCabang(rq.getRqPayload());
    }

    @RequestMapping(value = "/update", method =RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void updateCabangById(@RequestBody Request<CabangRequest> rq){
        CabangRequest rqPayload = rq.getRqPayload();
        cabangService.updateCabangById(rqPayload.getIdCabang(), rqPayload.getNameCabang(), rqPayload.getAlamat(), rqPayload.getKota());
    }

    @RequestMapping(value = "/all-cabang", method =RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public CabangResponse<List<Cabang>> getAllCabang(){
        CabangResponse<List<Cabang>> cr = new CabangResponse<List<Cabang>>();
        List<Cabang> cbList =cabangService.getAllCabang();
        cr.setData(cbList);
        return cr;
    }

    @RequestMapping(value = "/owner", method =RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
     public CabangResponse<List<Cabang>> getAllCabangByOwner(){
        CabangResponse<List<Cabang>> cr = new CabangResponse<List<Cabang>>();
        List<Cabang> cbList =cabangService.getAllCabangByOwner();
        cr.setData(cbList);
        return cr;
    }
}
