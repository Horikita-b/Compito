package Main;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RegistroStudenti registro = new RegistroStudenti();
        Scanner scanner = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungere uno studente");
            System.out.println("2. Visualizzare tutti gli studenti");
            System.out.println("3. Cercare uno studente per matricola");
            System.out.println("4. Uscire");
            System.out.print("Inserisci la tua scelta: ");
            scelta = scanner.nextInt();
            scanner.nextLine();  // Consuma il newline rimasto nel buffer

            switch (scelta) {
                case 1:
                    registro.aggiungereStudente();
                    break;
                case 2:
                    registro.visualizzareStudenti();
                    break;
                case 3:
                    registro.cercaStudente();
                    break;
                case 4:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        } while (scelta != 4);

        scanner.close();
    }
}