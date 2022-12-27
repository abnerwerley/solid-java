package br.com.alura.rh.promocao.service;

import br.com.alura.rh.cargo.model.Cargo;
import br.com.alura.rh.exception.ValidacaoException;
import br.com.alura.rh.funcionario.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida) {

        Cargo cargoAtual = funcionario.getCargo();
        if (cargoAtual.equals(Cargo.GERENTE)) {
            throw new ValidacaoException("Gerentes não podem ser promovidos.");
        }
        if (metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new ValidacaoException("Funcionário não bateu a meta.");
        }
    }
}
