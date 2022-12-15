import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        createUser();
        menu();
    }

    public static Users createUser() {
        Scanner in = new Scanner(System.in);
        DbSql db = new DbSql();
        ArrayList<Users> users = new ArrayList<Users>();
        Users u1 = new Users();
        System.out.println("fnavn, enavn, mail, cprNr, tlfNr, kontoNr, regNr");
        // u1.setUserID(in.next());
        u1.setFnavn(in.next());
        u1.setEnavn(in.next());
        u1.setMail(in.next());
        u1.setTlfNr(Integer.valueOf(in.next()));
        u1.setCprNr(Integer.valueOf(in.next()));
        u1.setKontoNr(Integer.valueOf(in.next()));
        u1.setRegNr(Integer.valueOf(in.next()));
        return u1;
    }
    public static void menu(){
        int valg = 1;
        Scanner input = new Scanner(System.in);
        DbSql db = new DbSql();
        ArrayList<Users> users = new ArrayList<Users>();
            switch(valg){
        case 1: Users u = new Users();
            u = createUser();
            db.indsaetUser(u);
            break;
        case 2:
            System.out.print("Indtast fornavn: ");
            db.indsaetUserFornavn(input.next());
            break;
        case 3: System.out.println("Indtast efternavn");
            db.indsaetUserEfterNavn(input.next());
            break;
        case 4: System.out.println("Indtast E-mail");
            db.indsaetUserEmail(input.next());
            break;
        case 5: System.out.println("Indtast tlfNr");
            db.indsaetUserTlfNr(input.nextInt());
            break;
        case 6: System.out.println("Indtast tlfNr");
            db.indsaetUserKontoNr(input.nextInt());
            break;
        case 8: System.out.println("Indtast regNr");
            db.indsaetUserRegNr(input.nextInt());
            break;
    }
}
}