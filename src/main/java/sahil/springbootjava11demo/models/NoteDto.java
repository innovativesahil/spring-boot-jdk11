package sahil.springbootjava11demo.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import sahil.springbootjava11demo.dao.entity.Note;

@Getter
@Setter
@AllArgsConstructor
public class NoteDto {
    private Integer id;
    private String note;

    public NoteDto(final Note note){
        this.note = note.getNote();
    }
}
