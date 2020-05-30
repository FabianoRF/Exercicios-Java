package fabiano.com;

//codigo exemplo testando o uso de uma TreeSet(arvore rubro)
//documentação: https://docs.oracle.com/javase/6/docs/api/java/util/TreeSet.html

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Dog> treeSet=new TreeSet<Dog>();

        treeSet.add(new Dog(1, "Joao"));
        treeSet.add(new Dog(4, "Mano"));
        treeSet.add(new Dog(2, "Tody"));


        Iterator<Dog> iterator=treeSet.iterator();//para percorrer a arvore se utiliza de um iterator

        while(iterator.hasNext()){//metodo que retorna true enquanto houver algum elemento na arvore

            System.out.println(iterator.next().);//exibe
        }

    }
}
