package school.hei.model;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

//Lombok
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity //JPA pour le rendre " CREATE TABLE "
@Table(name = "\"user\"") //JPA
public class User implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "firs_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "user_name", length = 100)
    private String username;

    @Column(unique = true)
    private String email;

    @Column
    private String password;
}
