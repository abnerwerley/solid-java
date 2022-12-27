package br.com.alura.rh.reajuste.service;

import br.com.alura.rh.funcionario.model.Funcionario;

import java.math.BigDecimal;

public interface ValidacaoReajuste {

    void validar(Funcionario funcionario, BigDecimal aumento);
}
