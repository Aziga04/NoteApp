package com.example.myiii.domain.repository

import com.example.myiii.domain.model.Note

interface NoteRepository {

    fun createNote(note: Note)

    fun detAllNotes():List<Note>

    fun editNote(note: Note)

    fun deleteNote(note: Note)

}