package com.danny.demogoogle.auth.service

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import java.util.UUID

class AuthServiceTest{

    companion object{
        private const val GOOGLE_AUTHORIZATION_HOST = "accounts.google.com"
        private const val GOOGLE_AUTHORIZATION_PATH = "/o/oauth2/v2/auth"
        private const val GOOGLE_AUTHORIZATION_PORT = "443"
        private const val GOOGLE_AUTHORIZATION_SCHEME = "https"
        private const val GOOGLE_AUTHORIZATION_REDIRECT_URL = "http://localhost:8080/v1/callback"
        private const val GOOGLE_AUTHORIZATION_RESPONSE_TYPE = "code"
        private const val GOOGLE_AUTHORIZATION_SCOPE = "https://www.googleapis.com/auth/drive.metadata.readonly"
        private const val GOOGLE_AUTHORIZATION_ACCESS_TYPE = "offline"
        private const val GOOGLE_CLIENT_ID = "YOUR_GOOGLE_CLIENT_ID"
    }

    private lateinit var authService: AuthService

    @Before
    fun init(){
        authService = AuthService(
            AuthServiceTest.GOOGLE_AUTHORIZATION_SCHEME, AuthServiceTest.GOOGLE_AUTHORIZATION_HOST,
            AuthServiceTest.GOOGLE_AUTHORIZATION_PORT, AuthServiceTest.GOOGLE_AUTHORIZATION_PATH,
            AuthServiceTest.GOOGLE_AUTHORIZATION_REDIRECT_URL, AuthServiceTest.GOOGLE_AUTHORIZATION_RESPONSE_TYPE,
            AuthServiceTest.GOOGLE_AUTHORIZATION_SCOPE, AuthServiceTest.GOOGLE_AUTHORIZATION_ACCESS_TYPE,
            AuthServiceTest.GOOGLE_CLIENT_ID)
    }

    @Test
    fun getGoogleAuthorizationUri_provideState_ReturnGoogleUrl(){
        val state = UUID.randomUUID().toString()

        val googleUrl = authService.getGoogleAuthorizationUri(state)

        Assert.assertNotNull(googleUrl)
        Assert.assertTrue(googleUrl.contains("state"))
    }

}