package com.example.mvvmsampleapp.util

import java.io.IOException

class ApiExcecption(message: String): IOException(message)
class NoInternetExcecption(message: String): IOException(message)