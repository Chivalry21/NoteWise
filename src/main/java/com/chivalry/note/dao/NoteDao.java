package com.chivalry.note.dao;

import com.chivalry.note.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDao extends JpaRepository <Note,Integer>{
}
