package aula07;
public class Aula07 {
    public static void main(String[] args) {
        
    Lutador l[]=new Lutador[6];
    
    l[0]= new Lutador("Pretty Boy", "França", 31, 1.75f, 
                            68.9f, 11, 2, 1);
    l[1]=new Lutador("Putscript", "Brasil", 29, 1.68f, 
                            57.8f, 14, 2, 3);
    l[2]=new Lutador("Sanpshadow", "EUA", 29, 1.68f, 
                            80.9f, 14, 2, 3);
    l[3]=new Lutador("Dead Code", "Austrália", 29, 1.68f, 
                            51.6f, 14, 2, 3);
    l[4]=new Lutador("UFOCobol", "Brasil", 29, 1.68f, 
                            113.3f, 14, 2, 3);
    l[5]=new Lutador("Nerdaart", "EUA", 29, 1.68f, 
                            105.7f, 14, 2, 3);
    
    Luta luta1=new Luta();
    
    luta1.marcarLuta(l[0], l[1]);
    luta1.lutar();
    
    
    
    }
    
}
