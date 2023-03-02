package com.backend.service.account;

import com.backend.model.account.Account;

public interface IAccountService {
    Account findAccountByUserName(String username);
}
