package com.example.myiii.data.local.mappes

import com.example.myiii.data.model.NoteEntity
import com.example.myiii.domain.model.Note

fun Note.toEntity() = NoteEntity(
    id, title, description
)
fun NoteEntity.toNote() = Note(
    id, title, description
)