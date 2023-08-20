package com.chivalry.note.service;

import com.chivalry.note.dao.NoteDao;
import com.chivalry.note.dto.NoteDto;
import com.chivalry.note.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NoteServices implements INoteServices{
    private final NoteDao noteDao;
    @Autowired
    public NoteServices(NoteDao noteDao){
        this.noteDao = noteDao;
    }
    @Override
    public String save(NoteDto noteDto) {
        Note note = new Note(noteDto);
        noteDao.save(note);
        return null;
    }

    @Override
    public String update(NoteDto noteDto) {
        return null;
    }

    @Override
    public List<NoteDto> fetchAll() {
        return null;
    }

    @Override
    public NoteDto fetchById(int id) {
        return null;
    }

    @Override
    public String deleteNote(int id) {
        return null;
    }
}
