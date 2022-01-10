package sahil.springbootjava11demo.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sahil.springbootjava11demo.dao.entity.Note;
import sahil.springbootjava11demo.dao.repository.NotesRepository;
import sahil.springbootjava11demo.models.NoteDto;
import sahil.springbootjava11demo.service.NoteService;

import java.util.Objects;

@Service
public class NoteServiceImpl implements NoteService {
    private NotesRepository notesRepository;

    @Autowired
    public NoteServiceImpl(final NotesRepository notesRepository){
        this.notesRepository = notesRepository;
    }
    @Override
    public NoteDto getNote(final Integer id) {
        final Note note =  notesRepository.findById(id).get();
        return Objects.nonNull(note) ? note.responseMapper() : null;
    }
}
