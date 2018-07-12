package web

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class LineApplication

fun main(args: Array<String>) {
    SpringApplication.run(LineApplication::class.java, *args)
}