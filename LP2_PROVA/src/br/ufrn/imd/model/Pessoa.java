package br.ufrn.imd.model;

public class Pessoa {
    String nome;
    double Salario;
    ContaCorrente conta;
    SeguroVida seguro;

    public Pessoa(){
        this.nome = "";
        this.Salario = 0;
        this.conta = null;
        this.seguro = null;
    }

    public Pessoa(String nome, double Salario, ContaCorrente conta, SeguroVida seguro){
        this.nome = nome;
        this.Salario = Salario;
        this.conta = conta;
        this.seguro = seguro;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setSalario(double Salario){
        this.Salario = Salario;
    }

    public double getSalario(){
        return this.Salario;
    }

    public void setConta(ContaCorrente conta){
        this.conta = conta;
    }

    public ContaCorrente getConta(){
        return this.conta;
    }

    public void setSeguro(SeguroVida seguro){
        this.seguro = seguro;
    }

    public SeguroVida getSeguro(){
        return this.seguro;
    }
    
}
