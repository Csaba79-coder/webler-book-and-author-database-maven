package hu.webler.repository;

import java.sql.Connection;

public class DatabaseRepository {

    private static Connection connection;
    private static final String JDBC_URL = "jdbc:mysql://localhost:" + System.getenv("DB_PORT") + "/" + System.getenv("DB_URL") + "?createDatabaseIfNotExist=true&useSSL=true&sessionVariables=sql_mode='NO_ENGINE_SUBSTITUTION'&jdbcCompliantTruncation=false";
    private static final String DB_USER = System.getenv("DB_USER");
    private static final String DB_PASSWORD = System.getenv("DB_PASSWORD");
}
