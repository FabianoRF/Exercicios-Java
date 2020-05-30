package aula04;
public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampa;
    private String cor;
    
    public Caneta(String m, String c, float p){//Este é o metodo construtor
        this.modelo= m;
        this.cor=c;
        this.ponta=p;
        setTampa(true);
    }
    
    private void setTampa(boolean t){
        this.tampa=t;
    }
    public boolean getTampa(){
        return this.tampa;
    }
        
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo=m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta=p;
    }
    
    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta: "+ this.getPonta());
    }
        
}
