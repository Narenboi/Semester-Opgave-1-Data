import java.util.Scanner;

public class Main {
            public static void main(String[] args) {
                Scanner reader = new Scanner(System.in); // Create a Scanner object

                System.out.print("Skriv dit navn: "); // Prompt the user for their name
                String name = reader.nextLine(); // Get the user's name

                System.out.println("Skriv din mail: "); // Propt the user for their mail
                String Mail = reader.nextLine();

                System.out.println("Skriv dit CPR Nummer: "); // Propt the user for their mail
                String cprnr = reader.nextLine();

                System.out.println("Skriv dit Konto Nummer: "); // Propt the user for their mail
                String Kontonr = reader.nextLine();

                System.out.println("Skriv dit registreings Nummer: "); // Propt the user for their mail
                String regnr = reader.nextLine();

                String phoneNumber;

                System.out.println("Name: " + name); // Print the name

                System.out.println("Mail: " + Mail);
                System.out.println("CPR NR: " + cprnr);
                System.out.println("Konto nr: " + Kontonr + " " + "regnr " + regnr);


                //TELEFON NUMMER KUN 8 TAL LANG
                case1: while (true) {
                    System.out.print("Skriv dit telefon nummer: "); // Prompt the user for their phone number
                    phoneNumber = reader.nextLine(); // Get the user's phone number
                    // Check if the phone number is exactly 8 digits long
                    if (phoneNumber.length() == 8) {
                        break ; // If the phone number is valid, exit the loop
                    }
                    System.out.println("Dit telefon nummer skal være 8 cifre lang, prøv igen.");

                    //CPR NUMMER KUN 10 TAL LANG

                    case2: while (true) {
                        System.out.print("Skriv dit CPR Nummer: "); // Prompt the user for their phone number
                        cprnr = reader.nextLine(); // Get the user's phone number
                        // Check if the phone number is exactly 8 digits long
                        if (cprnr.length() == 10) {
                            break ; // If the phone number is valid, exit the loop
                        }
                        System.out.println("Dit CPR nummer skal være 10 cifre lang, prøv igen.");


                        case3: while (true) {
                            System.out.print("Skriv dit Kontonr: "); // Prompt the user for their phone number
                            Kontonr = reader.nextLine(); // Get the user's phone number
                            // Check if the phone number is exactly 8 digits long
                            if (Kontonr.length() == 10) {
                                break ; // If the phone number is valid, exit the loop
                            }
                            System.out.println("Dit kontonummer skal være 10 cifre lang, prøb igen.");

                            case4:while (true) {
                                System.out.print("Skriv dit registringsnummer: "); // Prompt the user for their phone number
                                regnr = reader.nextLine(); // Get the user's phone number
                                // Check if the phone number is exactly 8 digits long
                                if (regnr.length() == 4) {
                                    break; // If the phone number is valid, exit the loop
                                }
                                System.out.println("Registrings nummer skal være 4 cifre lang, prøv igen.");

                            }

                        }
                    }
                }
            }
        }