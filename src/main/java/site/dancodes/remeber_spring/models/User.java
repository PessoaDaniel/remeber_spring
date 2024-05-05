package site.dancodes.remeber_spring.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "user")
public class User  extends BaseEntity {
    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "username", nullable = false)
    protected String userName;

    @Column(name = "password", nullable = false)
    protected String password;

    @Column(name = "email", nullable = false)
    protected String email;

    @Column(name = "banned")
    protected boolean banned;


    @Column(name = "locked")
    protected boolean locked;

    public User () {
        this.banned = false;
        this.locked = false;
    }

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

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }
}
