package com.example.myiii.di

import android.content.Context
import androidx.room.Room
import com.example.myiii.data.local.NoteDao
import com.example.myiii.data.local.NoteDataBase
import com.example.myiii.data.repository.NoteRepositoryImpl
import com.example.myiii.domain.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NoteAppModule {
    @Singleton
    @Provides
    fun provideNoteDataBase(
        @ApplicationContext context: Context
    )= Room.databaseBuilder(
        context,
        NoteDataBase::class.java,
        "note_db"
    )

    @Provides
    fun provideNoteDao(noteDataBase: NoteDataBase) = noteDataBase.noteDao()

    @Provides
    fun provideNoteRepository(noteDao: NoteDao) : NoteRepository {
       return NoteRepositoryImpl(noteDao)
    }
}