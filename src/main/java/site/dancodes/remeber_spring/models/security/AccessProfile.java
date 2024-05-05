package site.dancodes.remeber_spring.models.security;

import jakarta.persistence.*;
import site.dancodes.remeber_spring.models.BaseEntity;
import site.dancodes.remeber_spring.models.User;

import java.util.Date;
import java.util.List;

@Entity(name = "access_profile")
public class AccessProfile extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "active")
    private boolean active;

    @Column(name = "lock_date")
    private Date lockDate;

    @OneToMany(mappedBy = "accessProfile")
    private List<User> users;

    @ManyToMany
    @JoinTable(joinColumns =  @JoinColumn(name = "profile_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getLockDate() {
        return lockDate;
    }

    public void setLockDate(Date lockDate) {
        this.lockDate = lockDate;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
