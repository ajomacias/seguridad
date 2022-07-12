package yavirac.seguridad.models;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table(value = "help.career")
public class Career {
    @Id()
    @Column(value = "caarer_id")
    private Long id;
    @Column(value = "caarer_name")
    private String name;
    @Column(value = "career_semesters")
    private int semesters;
    private String created;
    private Boolean enable;
    private Boolean achieved;
}
