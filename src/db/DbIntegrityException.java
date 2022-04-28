package db;

import java.sql.SQLException;

public class DbIntegrityException extends RuntimeException {

    public DbIntegrityException(String message) {
        super(message);
    }

}
