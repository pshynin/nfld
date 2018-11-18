package sweater.repos;

import org.springframework.data.repository.CrudRepository;
import sweater.domain.Message;

import java.util.List;

/**
 * Created by pshynin on Nov, 2018
 */
public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);
}
