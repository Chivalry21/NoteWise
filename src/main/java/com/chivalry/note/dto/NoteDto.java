package com.chivalry.note.dto;

import com.chivalry.note.model.Note;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NoteDto {
    private  int id;
    private String title;
    private String content;

    public NoteDto(Note note){
        this.id = note.getId();
        this.title = note.getTitle();
        this.content = getContent();
    }

    /*
     *define the fields TODO DONE
     *create constructors TODO DONE
     *generate getter/setter method TODO DONE
     *generate toString method TODO DONE
     *create constructor to convert Note to noteDTO TODO DONE
     */
}
