package mm.db.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "telephone")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Telephone {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "marque")
    private String marque;
    @Column(name = "model")
    private String model;
    @JsonIgnore
    @OneToMany(mappedBy = "telephone", cascade = CascadeType.ALL)
    List<User> users;



}
