package web.exception

class ForbiddenException(override var message: String) : RuntimeException(message)