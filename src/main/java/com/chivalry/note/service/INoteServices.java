package com.chivalry.note.service;

import com.chivalry.note.dto.NoteDto;

import java.util.List;

public interface INoteServices {
    String save (NoteDto noteDto);
    String update(NoteDto noteDto);
    List<NoteDto> fetchAll();
    NoteDto fetchById(int id);
    String deleteNote(int id);

}
