package com.danny.demogoogle.callback

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class CallbackService(
    private val restTemplate: RestTemplate,
    @Value("\${line.access-token.uri.scheme}")
    private val lineAccessTokenUriScheme: String,
    @Value("\${line.access-token.uri.host}")
    private val lineAccessTokenUriHost: String,
    @Value("\${line.access-token.uri.port}")
    private val lineAccessTokenUriPort: String,
    @Value("\${line.access-token.uri.path}")
    private val lineAccessTokenUriPath: String,
    @Value("\${line.id-token.issuer}")
    private val lineIDTokenIssuer: String,
    @Value("\${line.authorization.redirect}")
    private val lineRedirect: String,
    @Value("\${line.authorization.grant-type}")
    private val lineGrantType: String,
    @Value("\${line.client_id}")
    private val lineClientId: String,
    @Value("\${line.client_secret}")
    private val lineClientSecret: String){

}