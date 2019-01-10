package com.example.note.HomeLane.dao;

import com.example.note.HomeLane.entity.NotesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotesDao extends JpaRepository<NotesEntity, Integer> {

    List<NotesEntity> findAll();
    List<NotesEntity> findByNoteTitle(String noteTitle);
    List<NotesEntity> findByNoteImportance(String noteImportance);
}
