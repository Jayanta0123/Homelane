package com.example.note.HomeLane.dto;

// import com.example.note.HomeLane.entity.NoteImportance;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NotesDto {
    private static final long serialVersionUID = 871330099131L;
    private String noteTitle;
    private String noteText;
    private Date createTime;
    private String importance;
    private String colorCode;

    public NotesDto() {
    }

    public NotesDto(String noteTitle, String noteText, Date createTime, String importance, String colorCode) {
        this.noteTitle = noteTitle;
        this.noteText = noteText;
        this.createTime = createTime;
        this.importance = importance;
        this.colorCode = colorCode;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
}
