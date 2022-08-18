package school.hei.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
    private long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
}
