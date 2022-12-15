/* public class seneremaybe {

    public static void main(String[] args) {
        System.out.print("Skriv dit fornavn: "); // Pr        Scanner input = new Scanner(System.in);
        ompt the user for their name
        String fnavn = input.nextLine(); // Get the user's first name
        System.out.println("skriv dit efternavn");
        String enavn = input.nextLine(); // Get the user's last name

        System.out.println("Skriv din mail: "); // Propt the user for their mail
        String Mail = input.nextLine();


        //CPR NUMMER KUN 10 TAL LANG


        while (true) {
            System.out.print("Skriv dit CPR Nummer: "); // Prompt the user for their phone number
            Integer cprNr = Integer.valueOf(input.nextLine()); // Get the user's phone number
            // Check if the phone number is exactly 8 digits long
            if (cprNr.intValue() == 10) {
                continue; // If the phone number is valid, exit the loop
            } else {
                System.out.println("Dit CPR nummer skal være 10 cifre lang, prøv igen.");

            }
//TELEFON NUMMER KUN 8 TAL LANG
            System.out.print("Skriv dit telefon nummer: "); // Prompt the user for their phone number
            Integer tlfNr = Integer.valueOf(input.nextLine()); // Get the user's phone number
            // Check if the phone number is exactly 8 digits long
            if (tlfNr.intValue() == 8) {

            } else {
                System.out.println("Dit telefon nummer skal være 8 cifre lang, prøv igen.");
                continue; // If the phone number is valid, exit the loop
            }

            while (true) {
                System.out.print("Skriv dit Kontonr: "); // Prompt the user for their phone number
                Integer KontoNr = Integer.valueOf(input.nextLine()); // Get the user's phone number
                // Check if the phone number is exactly 8 digits long
                if (KontoNr.intValue() == 10) {

                } else {
                    System.out.println("Dit kontonummer skal være 10 cifre lang, prøb igen.");
                    continue; // If the phone number is valid, exit the loop
                }

                while (true) {
                    System.out.print("Skriv dit registringsnummer: "); // Prompt the user for their phone number
                    Integer regNr = Integer.valueOf(input.nextLine()); // Get the user's phone number
                    // Check if the phone number is exactly 8 digits long
                    if (regNr.intValue() == 4) {
                        continue; // If the phone number is valid, exit the loop
                    }
                    System.out.println("Registrings nummer skal være 4 cifre lang, prøv igen.");

                }

            }
        }
    }
}
*/
