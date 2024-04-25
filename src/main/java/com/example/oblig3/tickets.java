package com.example.oblig3;


public class tickets {
    private String movie;
    private String name;
    private String sname;
    private String quantity;
    private String email;
    private String nmb;
    private String id;
    public tickets(String movie, String name, String sname, String quantity, String email, String nmb, String id) {
        this.movie = movie;
        this.name = name;
        this.sname = sname;
        this.quantity = quantity;
        this.email = email;
        this.nmb = nmb;
        this.id = id;
    }
    public tickets() {
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNmb() {
        return nmb;
    }

    public void setNmb(String nmb) {
        this.nmb = nmb;
    }

    public String getId(){return id;}
    public void setId(String id){
        this.id=id;
    }

}