package com.example.note.HomeLane.service.impl;

import com.example.note.HomeLane.exception.ResourceNotFoundException;
import com.example.note.HomeLane.dao.NotesDao;
import com.example.note.HomeLane.dto.NotesDto;
import com.example.note.HomeLane.entity.NotesEntity;
import com.example.note.HomeLane.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class NotesServiceImpl implements NotesService {

    @Autowired
    private NotesDao notesDao;

    @Override
    public List<NotesEntity> getAllNotes(){
        return notesDao.findAll();
    }

    @Override
    public NotesEntity getNoteById(int noteId) throws ResourceNotFoundException {
        Optional<NotesEntity> notesEntity = notesDao.findById(noteId);

        if (!notesEntity.isPresent())
            throw new ResourceNotFoundException("Note with id " + noteId + " is not found.");

        return notesEntity.get();
    }

    @Override
    public List<NotesEntity> getNoteByTitle(String noteTitle) {
        return notesDao.findByNoteTitle(noteTitle);
    }

    public List<NotesEntity> getNoteByImportance(String noteImportance) {
        return notesDao.findByNoteImportance(noteImportance);
    }

    @Override
    @Transactional
    public NotesEntity createNewNote(NotesDto notesDto) {
        NotesEntity notesEntity = new NotesEntity(notesDto);
        notesDao.save(notesEntity);
        return notesEntity;
    }

    @Override
    @Transactional
    public NotesEntity editNote(int noteId, NotesDto notesDto)  throws ResourceNotFoundException {
        Optional<NotesEntity> notesEntity = notesDao.findById(noteId);
        if (!notesEntity.isPresent())
            throw new ResourceNotFoundException("Note with id " + noteId + " is not found, hence can't update");

        NotesEntity noteToUpdate = notesEntity.get();
        noteToUpdate.setNoteTitle(notesDto.getNoteTitle());
        noteToUpdate.setNoteText(notesDto.getNoteText());
        noteToUpdate.setCreateTime(notesDto.getCreateTime());
        noteToUpdate.setNoteImportance(notesDto.getImportance());
        noteToUpdate.setColorCode(notesDto.getColorCode());

        return notesDao.save(noteToUpdate);
    }

    @Override
    @Transactional
    public void deleteNote(int noteId) throws ResourceNotFoundException {
        Optional<NotesEntity> notesEntity = notesDao.findById(noteId);
        if (!notesEntity.isPresent())
            throw new ResourceNotFoundException("Note with id " + noteId + " is not found, hence can't delete");
        notesDao.delete(notesEntity.get());
    }
}
