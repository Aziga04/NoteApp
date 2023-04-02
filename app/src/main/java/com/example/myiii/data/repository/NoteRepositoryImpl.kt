package com.example.myiii.data.repository

import com.example.myiii.data.local.NoteDao
import com.example.myiii.data.local.mappes.toEntity
import com.example.myiii.data.local.mappes.toNote
import com.example.myiii.domain.model.Note
import com.example.myiii.domain.repository.NoteRepository

class NoteRepositoryImpl (
    private val noteDao: NoteDao
    ) : NoteRepository {

    override fun createNote(note: Note) {
        noteDao.createNote(note.toEntity())
    }

    override fun detAllNotes(): List<Note> {
        return noteDao.getAllNotes().map {it.toNote() }
    }

    override fun editNote(note: Note) {
        noteDao.editNotes(note.toEntity())
    }

    override fun deleteNote(note: Note) {
        noteDao.deleteNotes(note.toEntity())
    }


}