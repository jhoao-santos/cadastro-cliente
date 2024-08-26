package io.github.jhoaosantos.clientes.dominio.enums;

import java.security.PrivateKey;

public enum FormaGeometrica {
    QUADRADO (4, "Quadrado"),
    CIRCULO (0, "Circulo"),
    TRIANGULO (3, "triangulo"),
    RETANGULO (4, "Retangulo");

    private final int lados;
    private final String descricao;

    FormaGeometrica(int lados, String descricao) {
        this.lados = lados;
        this.descricao = descricao;
    }

    public int getLados() {
        return this.lados;
    }
}
