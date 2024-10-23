@Query("SELECT * FROM users WHERE username = :username")
fun getUser(username: String): User
