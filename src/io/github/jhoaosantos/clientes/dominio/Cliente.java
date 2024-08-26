package io.github.jhoaosantos.clientes.dominio;

import io.github.jhoaosantos.clientes.dominio.enums.TipoSexo;

public class Cliente {
    private String nome;
    private String cpf;  // Declare o campo cpf
    private TipoSexo sexo;

    // Construtor que inicializa nome, cpf e sexo
    public Cliente(String nome, String cpf, TipoSexo sexo) {
        this.nome = nome;
        this.cpf = cpf;  // Inicialize o campo cpf
        this.sexo = sexo;
    }

    // Getter e setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e setter para cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Getter e setter para sexo
    public TipoSexo getSexo() {
        return sexo;
    }

    public void setSexo(TipoSexo sexo) {
        this.sexo = sexo;
    }
}
