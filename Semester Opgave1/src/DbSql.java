import java.sql.*;

public class DbSql {
    private Connection connection;
    private Statement stmt;
    private Statement stmt1;

    DbSql() {
        connection = null;
        stmt = null;
        try {
            String url = "jdbc:sqlite:C://Users/luhav/OneDrive/Skrivebord/Semester projekts/Semester-Opgave-1-Data-rigtige/databaseProjekt1Rigtige.db";
            connection = DriverManager.getConnection(url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void indsaetUser(Users u1) {
        try {
            String sql = "INSERT INTO User (fnavn,enavn,mail,tlfnr,cprnr,kontonr,regnr) VALUES('" +
                    u1.getFnavn() + "','" + u1.getEnavn() + "','" + u1.getMail() + "','" + u1.getTlfNr() + "','" + u1.getCprNr() + "','" + u1.getKontoNr() + "','" + u1.getRegNr() + "')";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void indsaetUserFornavn(Users fnavn) {
        try {
            String sql = "INSERT INTO User (fnavn) VALUES('" + fnavn.getFnavn() + "'";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    void indsaetUserEfterNavn(Users enavn) {
        try {
            String sql = "INSERT INTO User (enavn) VALUES('" + enavn.getEnavn() + "'";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void indsaetUserEmail(Users mail) {
        try {
            String sql = "INSERT INTO User (mail) VALUES('" + mail.getMail() + "'";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void indsaetUserTlfNr(Users tlfNr) {
        try {
            String sql = "INSERT INTO User (tlfNr) VALUES('" + tlfNr.getTlfNr() + "'";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public void indsaetUserCprNr(Users cprNr) {
        try {
            String sql = "INSERT INTO User (cprNr) VALUES('" + cprNr.getCprNr() + "'";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void indsaetUserKontoNr(Users kontoNr) {
        try {
            String sql = "INSERT INTO User (kontoNr) VALUES('" + kontoNr.getKontoNr() + "'";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void indsaetUserRegNr(Users regNr) {
        try {
            String sql = "INSERT INTO User (regNr) VALUES('" + regNr.getRegNr() + "'";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("Connection to SQLite has been established.");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void indsaetUserFornavn(String next) {
    }

    public void indsaetUserEfterNavn(String next) {
    }

    public void indsaetUserEmail(String next) {
    }

    public void indsaetUserTlfNr(int nextInt) {
    }

    public void indsaetUserKontoNr(int nextInt) {
    }

    public void indsaetUserRegNr(int nextInt) {
    }

    public void indsaetUserCprNr(int nextInt) {
    }
}