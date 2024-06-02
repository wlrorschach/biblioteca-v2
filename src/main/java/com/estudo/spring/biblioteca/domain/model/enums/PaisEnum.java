package com.estudo.spring.biblioteca.domain.model.enums;

public enum PaisEnum {
    BRASIL("BRASIL"),
    INGLATERRA("INGLATERRA"),
    EUA("EUA"),
    JAPAO("JAPAO");

    private final String pais;

    PaisEnum(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }
}
