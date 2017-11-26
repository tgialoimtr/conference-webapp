package conference.repository;

import conference.model.Submission;
import org.springframework.data.repository.CrudRepository;

public interface SubmissionRepository extends CrudRepository<Submission, Long> {

}
