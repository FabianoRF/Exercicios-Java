package com.company;

public class Professor extends Pessoa {
    private String  especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    private float salario;

    public void receberaum(float aum){
        this.setSalario(this.getSalario()+aum);
    }
}
