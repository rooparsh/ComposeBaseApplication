package com.darklabs.data.repository

import com.darklabs.data.remote.SafeResult
import com.darklabs.data.remote.model.JokeResponse
import com.darklabs.data.remote.source.joke.RemoteJokeSource
import dagger.Module
import dagger.hilt.InstallIn
import javax.inject.Inject
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
class JokesRepositoryImpl @Inject constructor(private val remoteJokeSource: RemoteJokeSource) :
    JokeRepository {

    override suspend fun getRandomJokes(): SafeResult<JokeResponse> {
        return remoteJokeSource.getRandomJokes()
    }
}