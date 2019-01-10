package com.example.note.HomeLane.entity;

import com.example.note.HomeLane.dto.NotesDto;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "NOTES")
public class NotesEntity implements Serializable {
    private static final long serialVersionUID = 303291832019801L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "NOTE_TITLE", nullable = false)
    private String noteTitle;

    @Column(name = "NOTE_TEXT", nullable = false)
    private String noteText;

    @Column(name = "CREATE_TIME", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date createTime;

    @Column(name = "IMPORTANCE")
    // @Enumerated(EnumType.STRING)
    private String noteImportance;

    @Column(name = "COLOR_CODE")
    private String colorCode;

    public NotesEntity(NotesDto notesDto) {
        this.noteTitle = notesDto.getNoteTitle();
        this.noteText = notesDto.getNoteText();
        this.createTime = notesDto.getCreateTime();
        this.noteImportance = notesDto.getImportance();
        this.colorCode = notesDto.getColorCode();
    }

    public NotesEntity() {
    }

    public NotesEntity(int id, String noteTitle, String noteText, Date createTime, String noteImportance, String colorCode) {
        this.id = id;
        this.noteTitle = noteTitle;
        this.noteText = noteText;
        this.createTime = createTime;
        this.noteImportance = noteImportance;
        this.colorCode = colorCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getNoteImportance() {
        return noteImportance;
    }

    public void setNoteImportance(String noteImportance) {
        this.noteImportance = noteImportance;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NotesEntity that = (NotesEntity) o;
        return id == that.id &&
                Objects.equals(noteTitle, that.noteTitle) &&
                Objects.equals(noteText, that.noteText) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(noteImportance, that.noteImportance) &&
                Objects.equals(colorCode, that.colorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, noteTitle, noteText, createTime, noteImportance, colorCode);
    }

    @Override
    public String toString() {
        return "NotesEntity{" +
                "id=" + id +
                ", noteTitle='" + noteTitle + '\'' +
                ", noteText='" + noteText + '\'' +
                ", createTime=" + createTime +
                ", noteImportance='" + noteImportance + '\'' +
                ", colorCode='" + colorCode + '\'' +
                '}';
    }
}
