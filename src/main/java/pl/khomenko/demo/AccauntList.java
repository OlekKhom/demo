package pl.khomenko.demo;

public class AccauntList {
    private String login;
    private int pasword;


    public AccauntList(String login, int pasword) {

        this.login = login;
        this.pasword = pasword;
    }

    public String getLogin() {
        return login;
    }

    public AccauntList setLogin(String login) {
        this.login = login;
        return this;
    }

    public int getPasword() {
        return pasword;
    }

    public AccauntList setPasword(int pasword) {
        this.pasword = pasword;
        return this;
    }

    @Override
    public String toString() {
        return "accauntList{" +
                "login='" + login + '\'' +
                ", pasword=" + pasword +
                '}';
    }


}
