package school.hei.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.hei.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    
}
