package web.exception

class BadRequestException(override var message: String) : RuntimeException(message)