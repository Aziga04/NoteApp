package com.example.myiii.domain.usecase

import com.example.myiii.domain.model.Note
import com.example.myiii.domain.repository.NoteRepository

class DeleteNoteUseCase(private val  noteRepository: NoteRepository) {

    fun deleteNote(note: Note)= noteRepository.createNote(note)
}