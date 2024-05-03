package site.dancodes.remeber_spring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "user")
public class User  extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "username")
    protected String userName;

    @Column(name = "passowd")
    protected String password;

    @Column(name = "email")
    protected String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
