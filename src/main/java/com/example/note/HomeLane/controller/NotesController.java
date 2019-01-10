package com.example.note.HomeLane.controller;

import com.example.note.HomeLane.dto.NotesDto;
import com.example.note.HomeLane.entity.NotesEntity;
import com.example.note.HomeLane.exception.ResourceNotFoundException;
import com.example.note.HomeLane.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NotesController {

    @Autowired
    private NotesService notesService;

    @GetMapping("/allnotes")
    List<NotesEntity> getAllNotes() {
        return notesService.getAllNotes();
    }

    @GetMapping("/note/id/{noteId}")
    NotesEntity getNoteById(@PathVariable int noteId) throws ResourceNotFoundException {
        return notesService.getNoteById(noteId);
    }

    @GetMapping("/note/title/{noteTitle}")
    List<NotesEntity> getNoteByTitle(@PathVariable String noteTitle) {
        return notesService.getNoteByTitle(noteTitle);
    }

    @GetMapping("/note/level/{noteImportance}")
    List<NotesEntity> getNoteByImportance(@PathVariable String noteImportance) {
        return notesService.getNoteByImportance(noteImportance);
    }

    @PostMapping("/newnote")
    NotesEntity addNewNote(@RequestBody NotesDto notesDto) {
        return notesService.createNewNote(notesDto);
    }

    @PutMapping("/allnotes/id/{noteId}")
    NotesEntity editNote (@PathVariable int noteId, @RequestBody NotesDto notesDto) throws ResourceNotFoundException {
        return notesService.editNote(noteId, notesDto);
    }

    @DeleteMapping("/note/id/{noteId}")
    public void deleteNote(@PathVariable int noteId) throws ResourceNotFoundException{
        notesService.deleteNote(noteId);
    }
}
