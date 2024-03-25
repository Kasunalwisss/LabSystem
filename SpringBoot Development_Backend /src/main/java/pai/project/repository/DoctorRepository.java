
package pai.project.repository;

import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import pai.project.domain.Doctor;


public interface DoctorRepository extends CrudRepository<Doctor, Integer> {
    ArrayList<Doctor> findByDepartment(String department); 
    Doctor findById(long id); 
}
