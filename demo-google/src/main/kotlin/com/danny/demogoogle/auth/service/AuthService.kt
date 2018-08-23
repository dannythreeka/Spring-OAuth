package com.danny.demogoogle.auth.service

import org.springframework.stereotype.Service
import org.springframework.beans.factory.annotation.Value
import org.springframework.util.LinkedMultiValueMap
import org.springframework.web.util.UriComponentsBuilder

@Service
class AuthService(
    @Value("\${google.authorization.uri.scheme}")
    private val googleAuthorizationUriScheme: String,
    @Value("\${google.authorization.uri.host}")
    private val googleAuthorizationUriHost: String,
    @Value("\${google.authorization.uri.port}")
    private val googleAuthorizationUriPort: String,
    @Value("\${google.authorization.uri.path}")
    private val googleAuthorizationUriPath: String,
    @Value("\${google.authorization.redirect}")
    private val googleRedirect: String,
    @Value("\${google.authorization.response-type}")
    private val googleResponseType: String,
    @Value("\${google.authorization.scope}")
    private val googleScope: String,
    @Value("\${google.authorization.access-type}")
    private val googleAccessType: String,
    @Value("\${google.client_id}")
    private val googleClientId: String){

    fun getGoogleAuthorizationUri(state: String): String {

        val params = LinkedMultiValueMap<String, String>()
        params.add("client_id", googleClientId)
        params.add("redirect_uri", googleRedirect)
        params.add("scope", googleScope)
        params.add("access_type", googleAccessType)
        params.add("state", state)
        params.add("response_type", googleResponseType)


        val uriComponents = UriComponentsBuilder.newInstance()
            .scheme(googleAuthorizationUriScheme).host(googleAuthorizationUriHost)
            .port(googleAuthorizationUriPort).path(googleAuthorizationUriPath).queryParams(params)
            .build()

        return uriComponents.toUriString()
    }
}