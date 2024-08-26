package io.github.jhoaosantos.clientes.logicanegocio;

import java.util.UUID;

public interface Cadastro <TIPO> {
    void salvar(TIPO objetoCadastra);
    TIPO buscar(UUID codigo);
    void deletar(UUID codigo);
    void atualizar(TIPO objetoAtualizar);



}
