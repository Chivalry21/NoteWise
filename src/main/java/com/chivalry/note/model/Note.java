package com.chivalry.note.model;

import com.chivalry.note.dto.NoteDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Note {
   /* Id
    Tittle
    Content
*/
    /*annotate the class to an entity and map to db table TODO DONE
*define the fields TODO DONE
*annotate the field with db columns names TODO DONE
*create constructors
*generate getter/setter method
*generate toString method
*create constructor to convert Note to noteDTO
*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "title")
    private String title;
    @Column
    private String content;

    public Note(NoteDto noteDto){
     this.id =noteDto.getId();
     this.title = noteDto.getTitle();
     this.content =noteDto.getContent();

    }

}
