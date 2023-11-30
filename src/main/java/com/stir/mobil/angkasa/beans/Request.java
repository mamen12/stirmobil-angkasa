package com.stir.mobil.angkasa.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Request<T> {

    private String isAdmin;

    @JsonProperty(value = "rq_payload")
    private T rqPayload;

    public T getRqPayload() {
        return rqPayload;
    }

    public void setRqPayload(T rqPayload) {
        this.rqPayload = rqPayload;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    
    
}
