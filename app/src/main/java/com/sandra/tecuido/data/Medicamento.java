package com.sandra.tecuido.data;

public class Medicamento {
    private String name;
    private String expirationdate;
    private String times;
    private String dosis;
    private String observaciones;

    public Medicamento() {

    }

    public Medicamento(String name, String expirationdate, String times, String dosis, String observaciones) {
        this.name = name;
        this.expirationdate = expirationdate;
        this.times = times;
        this.dosis = dosis;
        this.observaciones = observaciones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpirationdate() {
        return expirationdate;
    }

    public void setExpirationdate(String expirationdate) {
        this.expirationdate = expirationdate;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}

