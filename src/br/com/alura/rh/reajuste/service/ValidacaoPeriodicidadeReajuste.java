package br.com.alura.rh.reajuste.service;

import br.com.alura.rh.exception.ValidacaoException;
import br.com.alura.rh.funcionario.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeReajuste implements ValidacaoReajuste {


    @Override
    public void validar(Funcionario funcionario, BigDecimal aumento) {
        long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(funcionario.getDataUltimoReajuste(), LocalDate.now());
        if (mesesDesdeUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajustes deve ser maior que 6 meses.");
        }
    }
}
