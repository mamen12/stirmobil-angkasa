# stirmobil-angkasa
API STIR MOBIL DI ANGKASA
## Method POST = http://localhost:port/cabang/all-cabang 
#### request payload nothing

## Method POST = http://localhost:port/cabang/owner
#### generate owner, request payload nothing

## Method POST = http://localhost:port/cabang/insert  
#### request payload : 
```

{
    "rq_payload" :{
        "nama_cabang" : "Mobil Indonesia",
        "alamat_cabang": "Jl. Teluk Jambe",
        "region" : "Karawang"
    }
}
```

## Method POST = http://localhost:port/cabang/update  
#### request payload :
```
{
    "rq_payload" :{
        "id_cabang" : "eb373324-123d-4f3e-8766-f3b855ee1bc4",
        "nama_cabang" : "Mobil Indonesia",
        "alamat_cabang": "Jl. Teluk Jambe",
        "region" : "Karawang"
    }
}
```
