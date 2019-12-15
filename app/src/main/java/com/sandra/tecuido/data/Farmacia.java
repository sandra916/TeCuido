package com.sandra.tecuido.data;

public class Farmacia {
    private String name;
    private String adress;
    private String timetable;
    private String phone;

    public Farmacia(){

    }

    public Farmacia(String name, String adress, String timetable,String phone) {
        this.name = name;
        this.adress = adress;
        this.timetable = timetable;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTimetable() {
        return timetable;
    }

    public void setTimetable(String timetable) {
        this.timetable = timetable;
    }
}
