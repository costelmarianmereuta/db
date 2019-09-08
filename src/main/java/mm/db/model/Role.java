package mm.db.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "role")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Role {
    @Id @GeneratedValue
    private long id;

    @Column(name = "role")
    private String role;
    @JsonIgnore
    @ManyToMany(mappedBy = "roles")
    List<User> users;

}
