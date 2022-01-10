package sahil.springbootjava11demo.dao.repository;

import org.springframework.data.repository.CrudRepository;
import sahil.springbootjava11demo.dao.entity.Note;

public interface NotesRepository extends CrudRepository<Note, Integer> {
}
