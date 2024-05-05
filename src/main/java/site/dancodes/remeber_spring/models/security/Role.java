package site.dancodes.remeber_spring.models.security;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import site.dancodes.remeber_spring.models.BaseEntity;

import java.util.List;

@Entity
public class Role  extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "activated")
    private boolean activated;

    @ManyToMany(mappedBy = "roles")
    private List<AccessProfile> accessProfiles;

    public Role() {
        this.activated = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public List<AccessProfile> getAccessProfiles() {
        return accessProfiles;
    }

    public void setAccessProfiles(List<AccessProfile> accessProfiles) {
        this.accessProfiles = accessProfiles;
    }
}
