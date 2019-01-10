package com.example.note.HomeLane.service;

import com.example.note.HomeLane.exception.ResourceNotFoundException;
import com.example.note.HomeLane.dto.NotesDto;
import com.example.note.HomeLane.entity.NotesEntity;

import java.util.List;

public interface NotesService {
    List<NotesEntity> getAllNotes();
    NotesEntity getNoteById(int noteId) throws ResourceNotFoundException;
    List<NotesEntity> getNoteByTitle(String noteTitle);
    List<NotesEntity> getNoteByImportance(String noteImportance);
    NotesEntity createNewNote(NotesDto notesDto);
    NotesEntity editNote(int noteId, NotesDto notesDto) throws ResourceNotFoundException;
    void deleteNote(int noteId) throws ResourceNotFoundException;
}
