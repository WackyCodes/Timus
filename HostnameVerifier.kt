val hostnameVerifier = HostnameVerifier { hostname, session -> 
    // Custom logic to validate the server’s certificate
    hostname == "your.server.com"
}
