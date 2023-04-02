package com.example.myiii.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.FileDescriptor

@Entity("notes")
class NoteEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
    val description: String
        )