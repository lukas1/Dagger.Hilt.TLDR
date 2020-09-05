package com.example.daggerhilttldr

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface AppModule {
    @Binds fun bindsSomeInterface(impl: SomeDependency): SomeInterface
}