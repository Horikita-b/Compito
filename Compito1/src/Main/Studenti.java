package Main;
public class Studenti {
    private String nome;
    private String cognome;
    private String matricola;

    // Costruttore
    public Studenti(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    // Metodo toString per una rappresentazione leggibile dello studente
    @Override
    public String toString() {
        return "Nome: " + nome + ", Cognome: " + cognome + ", Matricola: " + matricola;
    }
}


