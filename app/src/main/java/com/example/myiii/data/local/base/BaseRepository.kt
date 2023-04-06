package com.example.myiii.data.local.base

import com.example.myiii.domain.utils.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.io.IOException


abstract class BaseRepository {
    protected fun <T> doRequest(request : suspend ()-> T)= flow {
        emit(Resource.Loading())
       try {

            emit(Resource.Success(request()))
        } catch (ioException: IOException) {
            emit(Resource.Error(ioException.localizedMessage ?: "Unknown error!"))
        }
    }.flowOn(Dispatchers.IO)
    }

