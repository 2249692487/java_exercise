package com.test.service.impl;

import com.test.mapper.AccountMapper;
import com.test.pojo.Account;
import com.test.service.AccountService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
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
    public void transfer(String outName, String inName, double money) {
        accountMapper.out(outName, money);
        accountMapper.in(inName, money);
    }

    @Override
    public List<Account> findAll() {
        return accountMapper.findAll();
    }
}
