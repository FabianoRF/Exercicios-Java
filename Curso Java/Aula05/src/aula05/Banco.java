
package aula05;

public class Banco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String Dono;
    private float saldo;
    private boolean status;

    public Banco(String tipo, boolean status) {
        this.setTipo(tipo);
        
        this.status = status;
    }

    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    private void setTipo(String t) {
        this.tipo = t;
    }
 
    public String getDono() {
        return Dono;
    }

    public void setDono(String Dono) {
        this.Dono = Dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo){
        if("CC".equals(tipo)){
            this.saldo=50f;
        }else if("CP".equals(tipo)){
            this.saldo=150f;
        }
    }
    
    public void fecharConta(){
        
        if(this.saldo<0){
            System.out.println("Impossivel fechar a conta o usuario é devedor!!");
        }else{
            System.out.println("COnta fechada com sucesso!");
            this.saldo=0;
            this.status=false;
        }   
    }
    public void depositar(float qtd){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+ qtd);
        }else{
            System.out.println("Impossivel depositar!");
        }
    }
    public void sacar(float qtd){
        if(this.getStatus()){
            if(this.saldo-qtd<0){
                System.out.println("Nao é possivel sacar! saldo insuficiente");
            }else this.saldo-=qtd;
        }else{
            System.out.println("Conta nao existe!");
        }    
            
    }
    
    public void pagarMensal(){
        if(this.tipo.equals("CC")){
            this.saldo-=12f;
        }else if(this.tipo.equals("CP")){
            this.saldo-=20f;
        }else System.out.println("Tipo incorreto");
    }
}
