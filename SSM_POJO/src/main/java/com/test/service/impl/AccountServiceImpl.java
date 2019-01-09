package com.test.service.impl;

import com.test.mapper.AccountMapper;
import com.test.pojo.Account;
import com.test.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 描述：待描述
 * </p>
 *
 * @author QinLiNa
 * @data 2019/1/8
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;

    @Transactional
    public void transfer(String outname, String inName, double money) {
        accountMapper.out(outname, money);
//        int i = 1 / 0;
        accountMapper.in(inName, money);
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
