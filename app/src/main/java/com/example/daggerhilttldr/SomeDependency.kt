package com.example.daggerhilttldr

import javax.inject.Inject

class SomeDependency @Inject constructor() {
    val value = "I come from injected dependency"
}