package com.sandra.tecuido.data;

public class CitaMedica {
    private String nameDoctor;
    private String date;
    private String tipoCita;
    private String acompañante;
    private String nombreCentro;
    private String localizacion;


    public  CitaMedica(){

    }
    public CitaMedica(String nameDoctor, String date, String tipoCita, String acompañante, String nombreCentro, String localizacion) {
        this.nameDoctor = nameDoctor;
        this.date = date;
        this.tipoCita = tipoCita;
        this.acompañante = acompañante;
        this.nombreCentro = nombreCentro;
        this.localizacion = localizacion;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public String getAcompañante() {
        return acompañante;
    }

    public void setAcompañante(String acompañante) {
        this.acompañante = acompañante;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }
}
