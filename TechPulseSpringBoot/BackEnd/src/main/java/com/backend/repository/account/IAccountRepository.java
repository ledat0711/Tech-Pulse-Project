package com.backend.repository.account;

import com.backend.model.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IAccountRepository extends JpaRepository<Account, Integer> {
    @Query(value =
            "select * " +
            "from account " +
            "where username = :username", nativeQuery = true)
    Account findByUsername(@Param("username") String username);
}
