package com.example.myiii.domain.usecase

import com.example.myiii.domain.model.Note
import com.example.myiii.domain.repository.NoteRepository

class CreateNoteUseCase (private val noteRepository: NoteRepository){

    fun createNote(note: Note)= noteRepository.createNote(note)
}