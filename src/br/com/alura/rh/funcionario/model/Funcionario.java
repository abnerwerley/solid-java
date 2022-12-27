package br.com.alura.rh.funcionario.model;

import br.com.alura.rh.cargo.model.Cargo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends DadosPessoais {

    private LocalDate dataUltimoReajuste;

    public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario, LocalDate dataUltimoReajuste) {
        super(nome, cpf, cargo, salario);
        this.dataUltimoReajuste = dataUltimoReajuste;
    }

    public void atualizaSalario(BigDecimal salarioReajustado) {
        this.setSalario(salarioReajustado);
        this.dataUltimoReajuste = LocalDate.now();
    }

    public void promover(Cargo novoCargo) {
        this.setCargo(novoCargo);
    }

    public LocalDate getDataUltimoReajuste() {
        return dataUltimoReajuste;
    }

    public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
        this.dataUltimoReajuste = dataUltimoReajuste;
    }
}
