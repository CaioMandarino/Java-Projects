package projetopessoas;
public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    public void fazerAniver(){
        this.setIdade(this.getIdade()+1);
    }

    public Pessoa(String nome, int idade, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.setSexo(sexo);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if ( (sexo == 'M') || (sexo == 'F') ){
            this.sexo = sexo;
        } else {
            System.out.println("Nao foi possivel registrar o sexo, coloque [M] ou [F].");
            this.sexo = '\u0000';
        }
        
    }
    }
