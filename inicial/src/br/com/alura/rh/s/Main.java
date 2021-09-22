package br.com.alura.rh.s;

import br.com.alura.rh.s.model.Cargo;
import br.com.alura.rh.s.model.Funcionario;
import br.com.alura.rh.s.service.ReajusteService;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", "5467878753", Cargo.GERENTE, BigDecimal.valueOf(9000.00));
        new ReajusteService().reajustaSalario(f1, BigDecimal.valueOf(300.00));
        System.out.println("Salario: "+ f1.getSalario());
    }
}
