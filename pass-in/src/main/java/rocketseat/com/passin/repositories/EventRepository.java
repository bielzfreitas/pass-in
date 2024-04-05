package rocketseat.com.passin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface EventRepository extends JpaRepository<Event, String> {

    void save(rocketseat.com.passin.domain.event.Event newEvent);

}
