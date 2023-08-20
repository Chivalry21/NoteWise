package com.chivalry.note.controller;

import com.chivalry.note.dto.NoteDto;
import com.chivalry.note.service.NoteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("note")
public class NoteController {
   private final NoteServices noteServices;
   @Autowired
   public NoteController(NoteServices noteServices){
       this.noteServices = noteServices;
   }

   @PostMapping("save")
   public ResponseEntity<String> save(@RequestBody NoteDto noteDto){
       noteServices.save(noteDto);
       return new ResponseEntity("saved", HttpStatus.OK);
   }
   @GetMapping("get")
   public ResponseEntity<String> getNotes(){
       return new ResponseEntity<>("notes",HttpStatus.OK);
   }
   @PostMapping("login")
    public ResponseEntity<String> login() {
       return new ResponseEntity<>("Logged in successfully", HttpStatus.OK);
   }


}
