package com.danny.demogoogle.auth.controller

import com.danny.demogoogle.auth.service.AuthService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import java.util.UUID
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpSession

@Controller
@RequestMapping("/v1")
class AuthController(private val authService: AuthService){

    @GetMapping("login")
    fun goToLoginPage(request: HttpServletRequest): String = "login"

    @PostMapping("auth")
    fun goToAuthPage(request: HttpServletRequest): String{
        val state = UUID.randomUUID().toString()
        val httpSession = issuedSessionIfExist(request)

        httpSession.setAttribute("state", state)

        return "redirect:" + authService.getGoogleAuthorizationUri(state);
    }

    private fun issuedSessionIfExist(request: HttpServletRequest): HttpSession {
        val session = request.getSession(false)
        session?.invalidate()
        return request.getSession(true)
    }
}