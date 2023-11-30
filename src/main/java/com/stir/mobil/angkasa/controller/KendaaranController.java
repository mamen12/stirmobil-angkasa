package com.stir.mobil.angkasa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stir.mobil.angkasa.beans.CabangRequest;
import com.stir.mobil.angkasa.beans.Request;
import com.stir.mobil.angkasa.service.IKendaraanService;

@RestController
@RequestMapping(path = "/kendaraan")
public class KendaaranController {

    @Autowired
    private IKendaraanService kendaraanService;

    @RequestMapping(value = "/ins", method =RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void insertCabang(@RequestBody Request<CabangRequest> rq){
        kendaraanService.insertKendaraan(null);
    }

   
}
