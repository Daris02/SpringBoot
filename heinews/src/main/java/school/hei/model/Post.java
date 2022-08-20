package school.hei.model;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "T_post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private String content;

    @Column
    private LocalDate postingDate;

    @ManyToOne
    private User user;

    @Transient // Pour ne pas l'envoyée à la table 
    private int TotalLikes;
}
