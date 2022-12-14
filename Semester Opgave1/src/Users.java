
public class Users {

    private Integer userID;
    private String fnavn;
    private String enavn;
    private String mail;
    private Integer cprNr;
    private Integer tlfNr;
    private Integer kontoNr;
    private Integer regNr;

    public Users () {

    }
    public Users(Integer userID, String fnavn, String enavn, String mail, Integer cprNr, Integer tlfNr, Integer kontoNr, Integer regNr) {
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

    public Integer getCprNr() {
        return cprNr;
    }

    public void setCprNr(Integer cprNr) {
        this.cprNr = cprNr;
    }

    public Integer getTlfNr() {
        return tlfNr;
    }

    public void setTlfNr(Integer tlfNr) {
        this.tlfNr = tlfNr;
    }

    public Integer getKontoNr() {
        return kontoNr;
    }

    public void setKontoNr(Integer kontoNr) {
        this.kontoNr = kontoNr;
    }

    public Integer getRegNr() {
        return regNr;
    }

    public void setRegNr(Integer regNr) {
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
