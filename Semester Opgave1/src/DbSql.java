import java.sql.*;
import java.util.ArrayList;

public class DbSql {
    private Connection connection;
    private Statement stmt;
    private Statement stmt1;

    DbSql() {
        connection = null;
        stmt = null;
        try {
            String url = "jdbc:sqlite:C://Users/luhav/OneDrive/Skrivebord/Projekt 1 data/Program/Semester-Opgave-1-Data/databaseProjekt1Rigtige.db";
            connection = DriverManager.getConnection(url);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void indsaetUser(Users u1) {
        try {            String sql = "INSERT INTO User (fnavn,enavn,mail,tlfnr,cprnr,kontonr,regnr, balance) VALUES('" + u1.getFnavn() + "','" + u1.getEnavn() + "','" + u1.getMail() + "','" +

                    u1.getTlfNr() + "','" + u1.getCprNr() + "','" + u1.getKontoNr() + "','" + u1.getRegNr() + "','" + u1.getBalance() + "')";
            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            System.out.println("your user is now beign stored in the database.");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void updateUserBalance(int UserID1, int UserID2, int beloeb) {
        try {
            //String sql = "UPDATE studerende SET klasse = '" + overførsel + "' WHERE stdnr=" + stdnr;

            String sql = "UPDATE User SET balance = balance - '" + beloeb + "' WHERE UserID =" + UserID1;

            String sql2 = "UPDATE User SET balance = balance + '" + beloeb + "' WHERE UserID =" + UserID2;


            Statement stmt = connection.createStatement();
            stmt.execute(sql);
            stmt.execute(sql2);
            System.out.println("beløbet er sendt/modtaget.");
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ArrayList<Users> alleoplysninger() {
        ArrayList<Users> users = new ArrayList<Users>();
        String sql = "select * from User";
        try {
            Statement stmt = connection.createStatement();
            Statement stmt1 = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Users u = new Users();
                int UserID = rs.getInt("UserID");
                u.setUserID(UserID);
                u.setFnavn(rs.getString("fnavn"));
                u.setEnavn(rs.getString("enavn"));
                u.setMail(rs.getString("mail"));
                u.setCprNr(rs.getString("tlfnr"));
                u.setTlfNr(rs.getString("cprnr"));
                u.setKontoNr(rs.getString("kontonr"));
                u.setRegNr(rs.getString("regnr"));
                u.setBalance(rs.getString("balance"));
                users.add(u);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;
    }
    public Users soegUserID(int UserID) {
        Users u = new Users();
        String sql = "SELECT * from User where UserID=" + String.valueOf(UserID);
        try {
            connection.setAutoCommit(true);
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                u.setUserID(rs.getInt("UserID"));
                u.setFnavn(rs.getString("fnavn"));
                u.setEnavn(rs.getString("enavn"));
                u.setMail(rs.getString("mail"));
                u.setCprNr(rs.getString("tlfnr"));
                u.setTlfNr(rs.getString("cprnr"));
                u.setKontoNr(rs.getString("kontonr"));
                u.setRegNr(rs.getString("regnr"));
                u.setBalance(rs.getString("balance"));
            } else
                u = null;
            stmt.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return u;
    }
}



    /*
    public void balance(Users b) {
        try {
            String sql = "INSERT INTO User (balance) VALUES('" + balance.getBalance() + "'";
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

     */
