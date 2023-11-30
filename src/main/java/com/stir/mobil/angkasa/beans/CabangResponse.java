package com.stir.mobil.angkasa.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CabangResponse<T> {
    
    @JsonProperty(value = "data")
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    

}
