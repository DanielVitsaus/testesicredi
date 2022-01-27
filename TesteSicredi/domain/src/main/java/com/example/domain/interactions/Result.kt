package com.example.domain.interactions

sealed class Result<T> {
    data class Success<T>(val result: T) : Result<T>()
    data class Failure<T>(val throwable: Throwable) : Result<T>()
}