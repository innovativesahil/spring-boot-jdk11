package sahil.springbootjava11demo.service;

import sahil.springbootjava11demo.models.NoteDto;

public interface NoteService {
    NoteDto getNote(final Integer id);

}
