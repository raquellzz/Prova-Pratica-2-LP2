package src.br.ufrn.imd.controller;

import src.br.ufrn.imd.model.Pessoa;

public class GeradorImpostoRenda {
    double totalTributo;

    public double calculaValorTotalTributo(Pessoa p) {
        return p.calcularTributos();
    }
}
