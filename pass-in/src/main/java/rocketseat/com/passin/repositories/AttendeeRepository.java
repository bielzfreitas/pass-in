package rocketseat.com.passin.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import rocketseat.com.passin.domain.attendee.Attendee;



public interface AttendeeRepository extends JpaRepository<Attendee, String> {

    List<Attendee> findByEventId(String eventId);

    //busca para verificação se usuario já está cadastrado
    Optional<Attendee> findByEventIdAndEmail(String eventID, String email);
}
