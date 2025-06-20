package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.entity.Account;

/**
 * Repository interface for Account entity operations.
 * Extends JpaRepository to provide standard data access operations.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    /**
     * Finds an Account by its username.
     * @param username The username of the Account to find. Must not be blank.
     * @return The Account with the specified username, or null if no such Account exists.
     */
    Account findByUsername(String username);

    /**
     * Finds an Account by its username and password.
     *
     * @param username The username of the Account to find. Must not be blank.
     * @param password The password of the Account to find. Must not be blank.
     * @return The Account with the specified username and password, or null if no such Account exists.
     */
    Account findByUsernameAndPassword(String username, String password);
}