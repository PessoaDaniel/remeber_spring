package site.dancodes.remeber_spring.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import site.dancodes.remeber_spring.models.security.AccessProfile;
@Entity()
public class Admin  extends User {
    @ManyToOne
    protected AccessProfile accessProfile;
}
