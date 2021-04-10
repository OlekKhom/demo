package pl.khomenko.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "LOGI")
public class LogiAcc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String login;
    private int pasword;

    public LogiAcc() {
    }

    public LogiAcc(long id, String login, int pasword) {
        this.id = id;
        this.login = login;
        this.pasword = pasword;
    }

    public long getId() {
        return id;
    }

    public LogiAcc setId(long id) {
        this.id = id;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public LogiAcc setLogin(String login) {
        this.login = login;
        return this;
    }

    public int getPasword() {
        return pasword;
    }

    public LogiAcc setPasword(int pasword) {
        this.pasword = pasword;
        return this;
    }
}
