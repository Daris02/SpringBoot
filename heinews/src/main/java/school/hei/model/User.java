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
    private Long id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(length = 100)
    private String userName;

    @Column(unique = true)
    private String email;

    @Column
    private String password;
    
}
