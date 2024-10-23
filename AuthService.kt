val authService = AuthorizationService(context)
val authRequest = AuthorizationRequest.Builder(
    serviceConfig,
    clientId,
    ResponseTypeValues.CODE,
    Uri.parse(redirectUri)
).build()
