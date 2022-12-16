
public class Users {

    private Integer userID;
    private String fnavn;
    private String enavn;
    private String mail;
    private String cprNr;
    private String tlfNr;
    private String kontoNr;
    private String regNr;

    public Users () {

    }
    public Users(Integer userID, String fnavn, String enavn, String mail, String cprNr, String tlfNr, String kontoNr, String regNr) {
        this.userID = userID;
        this.fnavn = fnavn;
        this.enavn = enavn;
        this.mail = mail;
        this.cprNr = cprNr;
        this.tlfNr = tlfNr;
        this.kontoNr = kontoNr;
        this.regNr = regNr;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getFnavn() {
        return fnavn;
    }

    public void setFnavn(String fnavn) {
        this.fnavn = fnavn;
    }

    public String getEnavn() {
        return enavn;
    }

    public void setEnavn(String enavn) {
        this.enavn = enavn;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCprNr() {
        return cprNr;
    }

    public void setCprNr(String cprNr) {
        this.cprNr = cprNr;
    }

    public String getTlfNr() {
        return tlfNr;
    }

    public void setTlfNr(String tlfNr) {
        this.tlfNr = tlfNr;
    }

    public String getKontoNr() {
        return kontoNr;
    }

    public void setKontoNr(String kontoNr) {
        this.kontoNr = kontoNr;
    }

    public String getRegNr() {
        return regNr;
    }

    public void setRegNr(String regNr) {
        this.regNr = regNr;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userID=" + userID +
                ", fnavn='" + fnavn + '\'' +
                ", enavn='" + enavn + '\'' +
                ", mail='" + mail + '\'' +
                ", cprNr=" + cprNr +
                ", tlfNr=" + tlfNr +
                ", kontoNr=" + kontoNr +
                ", regNr=" + regNr +
                '}';
    }
}
