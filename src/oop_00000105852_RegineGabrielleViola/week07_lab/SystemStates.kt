package oop_00000105852_RegineGabrielleViola.week07_lab

enum class AppState {
    STARTING, RUNNING, STOPPED
}

sealed class ApiResponse {
    data class Success(val data: String): ApiResponse()
    data class Error(val message: String): ApiResponse()
    object Loading: ApiResponse()
}