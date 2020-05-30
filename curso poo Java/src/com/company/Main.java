package com.company;

public class Main {

    public static void main(String[] args) {
       // Pessoa p1=new Pessoa(); não eh possivel por ser abstrata
       /* Visitante v1=new Visitante();
        v1.setNome("Jevenal");
        v1.setIdade(10);
        v1.setSexo("M");
        System.out.println(v1.toString());*/

       Aluno a1= new Aluno();
       a1.setNome("Mario");
       a1.setCurso("TI");
       a1.setMatricula(123);
       a1.pagarMensalidade();

       Bolsista b1=new Bolsista();
       b1.setMatricula(3434);
       b1.setNome("Aluardo");
       b1.setBolsa(123.7f);
       b1.setSexo("M");
       b1.pagarMensalidade();

    }
}
