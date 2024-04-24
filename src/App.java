import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in); 
        
        // Array med bokningsbara platser
        int[] platser = new int[20];
        for (int i = 0; i < platser.length; i++) {
            platser[i] = 0;
        }

        // Huvudmeny i en loop
        while (true) {
            // Skriv ut menyalternativ
            System.out.println("Välj ett alternativ:");
            System.out.println("1. Visa tillgängliga platser");
            System.out.println("2. Boka plats");
            System.out.println("3. Visa vinst");
            System.out.println("4. Avsluta");

            // Ta emot användarens val
            System.out.print("Ange ditt val: ");
            int val = scanner.nextInt();

            // Jämför val med olika siffror 
            // OM val är 1 :
            if (val == 1) {
                // Visa lediga platser (de som inte är bokade, alltså inte har värdet 1)
                System.out.println("Lediga platser:");
                for (int i = 0; i < platser.length; i++) {
                    if (platser[i] == 0) {
                        System.out.println("Plats " + (i + 1) + " är ledig");
                    }
                }
            } 
            // ANNARS OM val är 2 :
            else if (val == 2) {
                // Implementera bokning av plats
                System.out.print("Ange platsnummer att boka: ");
                int platsnummer = scanner.nextInt();

                // Kontrollera att platsnumret är giltigt
                if (platsnummer >= 1 && platsnummer <= platser.length) {
                    // Kontrollera om platsen redan är bokad
                    if (platser[platsnummer - 1] != 0) {
                        System.out.println("Platsen är redan bokad av en annan person.");
                    } else {
                        // Boka platsen med användarens födelseår som identifikation
                        System.out.print("Ange ditt födelseår för att bekräfta bokningen: ");
                        int fodelsear = scanner.nextInt();
                        platser[platsnummer - 1] = fodelsear;
                        System.out.println("Plats " + platsnummer + " har bokats av dig.");
                    }
                } else {
                    System.out.println("Ogiltigt platsnummer.");
                }
            } 
            // ANNARS OM val är 3 :
            else if (val == 3) {
                // Implementera visning av vinst
                int antalBokadePlatser = 0;
                for (int i = 0; i < platser.length; i++) {
                    if (platser[i] != 0) {
                        antalBokadePlatser++;
                    }
                }
                double biljettpris = 299.90; 
                double vinst = antalBokadePlatser * biljettpris;
                System.out.println("Vinsten är: " + vinst + " kr");
            } 
            // ANNARS OM val är 4 :
            else if (val == 4) {
                // Implementera avslutning av programmet
                System.out.println("Programmet avslutas.");
                break; // Avsluta while-loopen
            } 
            // ANNARS:
            else {
                System.out.println("Ogiltigt val. Vänligen välj igen.");
            }
        }      
        // Stäng scanner
        scanner.close();
    }
}
    

     