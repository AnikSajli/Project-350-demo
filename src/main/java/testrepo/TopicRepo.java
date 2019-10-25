package testrepo;
import org.springframework.data.repository.CrudRepository;

import io.javabrains.springbootstarter.topic.Topic;

public interface TopicRepo extends CrudRepository<Topic, Integer> {

}
