package fabiano.com;
public class Dog implements Comparable<Dog>{//interface que diz para a treeset o que sera comparado

    public int cod;
    public String nome;


    public Dog(int c, String n){
        this.cod=c;
        this.nome=n;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Dog o) {//metodo que deve ser implementado pela interface

        //return this.cod;//exibe da forma que foi inserido
        return this.cod - o.cod;//exibe na ordem crescente
    }

    @Override
    public String toString() {
        return "Dog{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                '}';
    }
}
