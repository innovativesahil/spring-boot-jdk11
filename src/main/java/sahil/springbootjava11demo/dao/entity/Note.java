package sahil.springbootjava11demo.dao.entity;

import lombok.Getter;
import lombok.Setter;
import sahil.springbootjava11demo.models.NoteDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Note {
    @Id
    private UUID id;
    private String note;

    public NoteDto responseMapper(){
        return new NoteDto(this);
    }
}
