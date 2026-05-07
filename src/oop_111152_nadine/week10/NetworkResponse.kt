package oop_111152_nadine.week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)