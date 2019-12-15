package com.sandra.tecuido.data;

public class Aseo {
    private String date;
    private String tipoAseo;


    public Aseo(){

    }
    public Aseo(String date, String tipoAseo) {
        this.date = date;
        this.tipoAseo = tipoAseo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTipoAseo() {
        return tipoAseo;
    }

    public void setTipoAseo(String tipoAseo) {
        this.tipoAseo = tipoAseo;
    }
}
