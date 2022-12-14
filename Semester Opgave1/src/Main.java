import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Users createUser(){
        Scanner in=new Scanner(System.in);
        Users u1 = new Users();
        System.out.println("fnavn, enavn, adresse, postnr, mobil, klasse");
       // u1.setUserID(in.next());
        u1.setFnavn(in.next());
        u1.setEnavn(in.next());
        u1.setMail(in.next());
        u1.setCprNr(Integer.valueOf(in.next()));
        u1.setTlfNr(Integer.valueOf(in.next()));
        u1.setKontoNr(Integer.valueOf(in.next()));
        u1.setRegNr(Integer.valueOf(in.next()));
        return u1;
    }


    public static void menu(){
        int valg=1;
        Scanner input=new Scanner(System.in);
        DbSql db=new DbSql();
        ArrayList<Studerende> tabel = new ArrayList<Studerende>();
        while(valg!=0) {
            System.out.println("1. Opret ny studerende");
            System.out.println("2. Opret nyt fag ");
            System.out.println("3. Tildel studerende nyt fag ");
            System.out.println("4. Udskriv stamdata em en studerende ");
            System.out.println("5. Udskriv alle oplysninger om alle studerende ");
            System.out.println("6. Udskriv alle oplysninger om en studerende ");
            System.out.println("7. Søg alle der har et givet fag ");
            System.out.println("8. Opdater studerendes klasse ");
            System.out.println("9. Slet studerende ");
            System.out.println("0. Stop programmet");
            System.out.print("Indtast valg:  ");
            valg=input.nextInt();
            switch(valg){
                case 1: Studerende s;
                    s=inputstuddata();
                    db.indsaetStud(s);
                    break;
                case 2:
                    System.out.print("Indtast fagnavn: ");
                    Fag f=new Fag();
                    f.setFagnavn(input.next());
                    db.indsaetFag(f);
                    break;
                case 3: System.out.println("Indtast stdnr og fagnr");
                    db.indsaetfagstud(input.nextInt(),input.nextInt());
                    break;
                case 4: System.out.println("Indtast stdnr");
                    s=db.soegStdnr(input.nextInt());
                    System.out.println(s.toString());
                    break;
                case 5: tabel.clear();
                    tabel=db.alleoplysninger();
                    for(int i=0;i<tabel.size();i++) {
                        System.out.format("%s \n",tabel.get(i).toString());
                    }
                    break;
                case 6: System.out.println("Indtast stdnr");
                    s=db.soegAltStdnr(input.nextInt());
                    System.out.println(s.toString());
                    break;
                case 7: System.out.println("Indtast fagnr");
                    tabel.clear();
                    tabel=db.allestudmedfag(input.nextInt());
                    for(int i=0;i<tabel.size();i++) {
                        System.out.format("%s \n",tabel.get(i).toString());
                    }
                    break;
                case 8: System.out.println("Indtast stdnr og den nye klasse");
                    db.updateStudKlasse(input.nextInt(),input.next());
                    break;
            }
        }

    }

    public static void main(String[] args) {
        menu();

    }
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in); // Create a Scanner object

        String phoneNumber;
        String cprnr;
        String Kontonr;
        String regnr;


        System.out.print("Skriv dit navn: "); // Prompt the user for their name
        String name = reader.nextLine(); // Get the user's name

        System.out.println("Skriv din mail: "); // Propt the user for their mail
        String Mail = reader.nextLine();

        //TELEFON NUMMER KUN 8 TAL LANG
    case1: while (true) {
             System.out.print("Skriv dit telefon nummer: "); // Prompt the user for their phone number
            phoneNumber = reader.nextLine(); // Get the user's phone number
            // Check if the phone number is exactly 8 digits long
         if (phoneNumber.length() == 8) {

            }
        else {
            System.out.println("Dit telefon nummer skal være 8 cifre lang, prøv igen.");

        }
        }



        //CPR NUMMER KUN 10 TAL LANG

        case2: while (true) {
            System.out.print("Skriv dit CPR Nummer: "); // Prompt the user for their phone number
            cprnr = reader.nextLine(); // Get the user's phone number
            // Check if the phone number is exactly 8 digits long
            if (cprnr.length() == 10) {

            }
            else {
                System.out.println("Dit CPR nummer skal være 10 cifre lang, prøv igen.");

            }}

            case3: while (true) {
                System.out.print("Skriv dit Kontonr: "); // Prompt the user for their phone number
                Kontonr = reader.nextLine(); // Get the user's phone number
                // Check if the phone number is exactly 8 digits long
                if (Kontonr.length() == 10) {

                }
                else {
                    System.out.println("Dit kontonummer skal være 10 cifre lang, prøb igen.");

                }}


                case4:while (true) {
                    System.out.print("Skriv dit registringsnummer: "); // Prompt the user for their phone number
                    regnr = reader.nextLine(); // Get the user's phone number
                    // Check if the phone number is exactly 8 digits long
                    if (regnr.length() == 4) {

                    }
                    System.out.println("Registrings nummer skal være 4 cifre lang, prøv igen.");

                }
    }

}