package com.kreuch.conversor_temperatura.dto;

public class ConversorRequest {

    private double temperatura;
    private String de;
    private String para;

    public ConversorRequest(double temperatura, String de, String para) {
        this.temperatura = temperatura;
        this.de = de;
        this.para = para;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }
}
