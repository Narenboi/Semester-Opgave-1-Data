import java.util.Scanner;

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
    public static void menu(){
        int valg = 1;
        Scanner input = new Scanner(System.in);
        Users u = createUser();
        DbSql db = new DbSql();
        db.indsaetUser(u);
        System.out.println("indtast beløbet du vil sende");
        u.setBeloeb(String.valueOf((input.next())));
        db.updateUserBalance(1,2, Integer.parseInt(u.getBeloeb()));

         /*   switch(valg){
        case 1:
            System.out.print("Indtast fornavn: ");
            db.indsaetUserFornavn(input.next());
        case 2: System.out.println("Indtast efternavn");
            db.indsaetUserEfterNavn(input.next());
        case 3: System.out.println("Indtast E-mail");
            db.indsaetUserEmail(input.next());
        case 4: System.out.println("Indtast tlfNr");
            db.indsaetUserTlfNr(input.nextInt());
        case 5: System.out.println("Indtast cprNr");

            createUser().getCprNr() = (int) ( createUser().getCprNr() % 10);
            createUser().getCprNr() /= 10;

        case 6: System.out.println("Indtast KontoNr");
                    db.indsaetUserKontoNr(input.nextInt());
        case 7: System.out.println("Indtast regNr");
                    db.indsaetUserRegNr(input.nextInt());
            }

          */
            }
}