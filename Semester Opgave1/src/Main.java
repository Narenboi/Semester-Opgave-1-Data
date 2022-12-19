import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import static jdk.internal.org.jline.utils.Colors.s;

public class Main {


    public static void main(String[] args) {
        menu();
    }

    public static Users createUser() {
        Scanner in = new Scanner(System.in);
        Users u1 = new Users();
        System.out.println("fnavn, enavn, mail, cprNr, tlfNr, kontoNr, regNr, balance");
        // u1.setUserID(in.next());
        u1.setFnavn(in.next());
        u1.setEnavn(in.next());
        u1.setMail(in.next());
        u1.setTlfNr(String.valueOf((in.next())));
        u1.setCprNr(String.valueOf((in.next())));
        u1.setKontoNr(String.valueOf((in.next())));
        u1.setRegNr(String.valueOf((in.next())));
        u1.setBalance(String.valueOf((in.next())));
        return u1;
    }

    public static void menu() {
        int valg = 1;
        Scanner input = new Scanner(System.in);
        DbSql db = new DbSql();
        Users u = new Users();
        ArrayList<Users> users = new ArrayList<Users>();

        while (valg != 0) {
            System.out.println("1. Opret ny User");
            System.out.println("2. Udskriv oplysninger om en User ");
            System.out.println("3. Udskriv alle oplysninger om alle Users ");
            System.out.println("4. Send penge ");
            System.out.println("5. Slet user ");
            System.out.println("0. Stop programmet");
            System.out.print("Indtast valg:  ");
            valg = input.nextInt();
            switch (valg) {
                case 1:
                    u = createUser();
                    db.indsaetUser(u);
                    break;
                case 2:
                    System.out.println("Indtast UserID");
                    u = db.soegUserID(input.nextInt());
                    System.out.println(u.toString());
                    break;
                case 3:
                    users.clear();
                    users = db.alleoplysninger();
                    for (int i = 0; i < users.size(); i++) {
                        System.out.format("%s \n", users.get(i).toString());
                    }
                    break;
                case 4:
                    System.out.println("indtast beløbet du vil sende");
                    u.setBeloeb(String.valueOf((input.next())));
                    db.updateUserBalance(1, 2, Integer.parseInt(u.getBeloeb()));
                    break;

            }
        }
    }
    }
