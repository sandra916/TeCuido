package com.sandra.tecuido.data;

public class User {
    private String name;
    private String password;
    private int age;
    private boolean diabetes;
    private boolean hipertension;
    private boolean heparina;

    public User(){

    }

    public User(String name, String password, int age, boolean diabetes, boolean hipertension, boolean heparina) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.diabetes = diabetes;
        this.hipertension = hipertension;
        this.heparina = heparina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(boolean diabetes) {
        this.diabetes = diabetes;
    }

    public boolean isHipertension() {
        return hipertension;
    }

    public void setHipertension(boolean hipertension) {
        this.hipertension = hipertension;
    }

    public boolean isHeparina() {
        return heparina;
    }

    public void setHeparina(boolean heparina) {
        this.heparina = heparina;
    }
}
