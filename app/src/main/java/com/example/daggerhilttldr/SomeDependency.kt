package com.example.daggerhilttldr

import javax.inject.Inject

interface SomeInterface {
    val value: String
}

class SomeDependency @Inject constructor() : SomeInterface {
    override val value = "I come from injected dependency"
}