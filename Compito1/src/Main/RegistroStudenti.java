package Main;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroStudenti {
    private ArrayList<Studenti> studenti;
    private Scanner scanner;

    // Costruttore
    public RegistroStudenti() {
        studenti = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Aggiunge uno studente al registro
    public void aggiungereStudente() {
        System.out.print("Inserisci il nome dello studente: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci il cognome dello studente: ");
        String cognome = scanner.nextLine();
        System.out.print("Inserisci la matricola dello studente: ");
        String matricola = scanner.nextLine();

        // Controllo se la matricola è già presente
        for (Studenti s : studenti) {
            if (s.getMatricola().equals(matricola)) {
                System.out.println("Matricola già esistente. Impossibile aggiungere lo studente.");
                return;
            }
        }

        studenti.add(new Studenti(nome, cognome, matricola));
        System.out.println("Studente aggiunto con successo.");
    }

    // Visualizza tutti gli studenti
    public void visualizzareStudenti() {
        if (studenti.isEmpty()) {
            System.out.println("Nessuno studente presente nel registro.");
        } else {
            System.out.println("\nElenco degli studenti:");
            for (Studenti s : studenti) {
                System.out.println(s);
            }
        }
    }

    // Cerca uno studente per matricola
    public void cercaStudente() {
        System.out.print("Inserisci la matricola dello studente da cercare: ");
        String matricola = scanner.nextLine();
        boolean trovato = false;

        for (Studenti s : studenti) {
            if (s.getMatricola().equals(matricola)) {
                System.out.println("Studente trovato: " + s);
                trovato = true;
                break;
            }
        }

        if (!trovato) {
            System.out.println("Studente con matricola " + matricola + " non trovato.");
        }
    }
}





    

