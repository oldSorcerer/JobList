package job.list.jdbc;

import job.list.jdbc.service.impl.UserJdbcServise;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

class UserJdbcServiseTest {

    @Test
    void createUser() throws SQLException {
        UserJdbcServise servise = new UserJdbcServise();

        for (int i = 0; i < 10; i++) {
            servise.createUser("Iervattn" + i, "Ivawodretv " + i + 25, "025 0585000 458 " + i + 50);
        }
        System.out.println();

    }

    @Test
    void findByPassport() {
    }

    @Test
    void findByNameAndLastName() {
    }

    @Test
    void findByLastName() {
    }

    @Test
    void deleteUserByPassport() {
    }

    @Test
    void updateUser() {
    }
}