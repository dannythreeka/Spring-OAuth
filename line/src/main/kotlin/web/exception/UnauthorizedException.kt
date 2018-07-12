package web.exception

class UnauthorizedException(override var message: String) : RuntimeException(message)