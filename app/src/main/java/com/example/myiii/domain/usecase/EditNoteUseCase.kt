package com.example.myiii.domain.usecase

import com.example.myiii.domain.model.Note
import com.example.myiii.domain.repository.NoteRepository

class EditNoteUseCase(private val  noteRepository: NoteRepository) {

    fun editNote(note: Note)= noteRepository.editNote(note)
}