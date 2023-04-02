package com.example.myiii.domain.usecase

import com.example.myiii.domain.model.Note
import com.example.myiii.domain.repository.NoteRepository

class DetAllNotesUseCase constructor(private val noteRepository: NoteRepository) {

    fun detAllNotes(note: Note)= noteRepository.detAllNotes()
}