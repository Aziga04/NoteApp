package com.example.myiii.data.repository

import com.example.myiii.data.local.NoteDao
import com.example.myiii.data.local.base.BaseRepository
import com.example.myiii.data.local.mappes.toEntity
import com.example.myiii.data.local.mappes.toNote
import com.example.myiii.domain.model.Note
import com.example.myiii.domain.repository.NoteRepository
import com.example.myiii.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException
import javax.inject.Inject

class NoteRepositoryImpl @Inject constructor(
    private val noteDao: NoteDao
) : NoteRepository, BaseRepository() {

    override fun createNote(note: Note)= doRequest {
        noteDao.createNote(note.toEntity())
    }

    override fun editNote(note: Note) = doRequest {
        noteDao.editNotes(note.toEntity())
    }



    override fun detAllNotes()= doRequest {
        noteDao.getAllNotes().map { it.toNote() }
    }

    override fun deleteNote(note: Note) = doRequest {
        noteDao.deleteNotes(note.toEntity())
    }


}