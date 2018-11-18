package sweater.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import sweater.domain.User;

/**
 * Created by pshynin on Nov, 2018
 */
public interface UserRepo extends JpaRepository<User, Long> {
    
    User findByUsername(String username);
}
