package com.turing.alan.cpifp.di

import com.turing.alan.cpifp.data.InMemoryTaskRepository
import com.turing.alan.cpifp.data.TaskRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindTaskRepository(inMemoryTaskRepository: InMemoryTaskRepository):TaskRepository
}