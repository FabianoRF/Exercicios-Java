
package aula02;
public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void Status(){
        System.out.println("Modelo "+ this.modelo);
        System.out.println("Uma caneta "+ this.cor);
        System.out.println("Esta tampada? "+ this.tampada);
        System.out.println("Ponta "+ this.ponta);
        System.out.println("Carga "+ this.carga);
    }
    
    public void rabiscar(){
        if(this.tampada){
            System.out.println("Erro! Não posso rabiscar");
        }else{
            System.out.println("Estou Rabiscando!!");
        }
    }
    protected void tampar(){
        this.tampada=true;
    }
    protected void destampar(){
        this.tampada=false;
    }
        
}
