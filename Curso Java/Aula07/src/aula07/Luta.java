package aula07;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria().equals(l2.getCategoria())) && l1!=l2){
            this.setAprovada(true);
            this.desafiado=l1;
            this.desafiante=l2;
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

     public void lutar(){
        if(this.getAprovada()){
            this.desafiado.apresentar();
            this.desafiado.apresentar();
            Random aleatorio=new Random();
            int vencedor=aleatorio.nextInt(3);//gera numero aleatorio entre este intervalo
            switch(vencedor){
                case 0:{
                    System.out.println("Empatou!");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                }
                case 1:{
                    System.out.println("O vencedor foi: "+desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                }
                case 2:{
                    System.out.println("O vencedor foi: "+desafiante.getNome());
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
                }
            }
        }else{
            System.out.println("A luta não pode acontecer!");
        }
        
    }
    
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
   
}
