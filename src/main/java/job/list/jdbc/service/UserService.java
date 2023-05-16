package job.list.jdbc.service;

import job.list.domain.User;

import java.sql.SQLException;
import java.util.Collection;

public interface UserService {

    User createUser(String name, String lastName, String passport) throws SQLException;

    Collection<User> findUserByPassport(String passport) throws SQLException;

    Collection<User> findUserByNameAndLastName(String name, String lastName) throws SQLException;

    Collection<User> findUserByLastName(String lastName) throws SQLException;

    void deleteUserByPassport(String passport) throws SQLException;

    User updateUser(String passport, String name, String lastName) throws SQLException;

}
