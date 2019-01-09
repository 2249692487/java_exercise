package com.test.mapper;

import com.test.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 描述：待描述
 * </p>
 *
 * @author QinLiNa
 * @data 2019/1/8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/applicationContext_dao.xml")
public class AccountMapperTest {
    @Autowired
    private AccountMapper accountMapper;

    @Test
    public void out() {
        accountMapper.out("aaa", 100);
    }

    @Test
    public void in() {
        accountMapper.in("bbb", 100);
    }

    @Test
    public void findAll() {
        List<Account> all = accountMapper.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}