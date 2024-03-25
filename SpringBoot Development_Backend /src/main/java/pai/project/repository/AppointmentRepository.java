
package pai.project.repository;

import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import pai.project.domain.Appointment;
import pai.project.domain.Doctor;


public interface AppointmentRepository extends CrudRepository<Appointment, Integer> {
    ArrayList<Appointment> findByUserId(long userId);
    
    @Transactional
    Integer deleteById(long id);
}

