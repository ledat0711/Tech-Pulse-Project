package com.backend.service.account.impl;

import com.backend.model.account.Account;
import com.backend.repository.account.IAccountRepository;
import com.backend.service.account.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements IAccountService {
    @Autowired
    private IAccountRepository accountRepository;

    @Override
    public Account findAccountByUserName(String username) {
        return accountRepository.findByUsername(username);
    }
}
