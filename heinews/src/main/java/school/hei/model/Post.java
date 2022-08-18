package school.hei.model;

import java.time.LocalDate;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Post {
    
    private long id;
    private String title;
    private String content;
    private LocalDate postingDate;
    private User user;
}
