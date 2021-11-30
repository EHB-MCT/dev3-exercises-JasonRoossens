import java.sql.*
import java.util.*

fun main() {
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    val credentials = Credentials()

    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePass


    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                credentials.databaseName +
                ":" + "3306" + "/" + credentials.databaseUser, connectionProps)

    val statement = connection.prepareStatement("SELECT * FROM trains WHERE name = ?")
// The result of your query will be a type ResultSet
// This is a bit similar to collections in Kotlin
// But since the library is based on Java, we get a type from Java
    statement.setString(1, search)
    val result = statement.executeQuery()
    while(resultSet.next()) {
        result.getString("column_name")
    }
    println(result.toString())
}