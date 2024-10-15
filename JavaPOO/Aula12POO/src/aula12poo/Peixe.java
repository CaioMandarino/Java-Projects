package aula12poo;
public class Peixe extends Animal{
    private String corEscama;
    public void soltarBolha(){
        System.out.println("Soltando Bolhas");
    }
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substancia");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao faz som");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}
