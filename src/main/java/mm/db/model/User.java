package mm.db.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "nom")
    private String nom;
    @Column(name = "prenom")
    private String prenom;
    @Column(name = "mail")
    private String email;
    @ManyToOne
    @JoinColumn(name = "telephone_id")
    private Telephone telephone;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "user_has_role",joinColumns =@JoinColumn(name = "user_id" ),inverseJoinColumns = @JoinColumn(name = "role_id"))
    List<Role>roles;



}
