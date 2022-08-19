package school.hei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import school.hei.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> getAll();
}
