package ro.societateahermes.backendservice.entities.form;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Form {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany(mappedBy = "form", cascade = CascadeType.ALL)
    private List<Question> questions;
}
