package com.test.service;


import com.test.pojo.Account;

import java.util.List;

/**
 * 描述：待描述
 * </p>
 *
 * @author QinLiNa
 * @data 2019/1/8
 */
public interface AccountService {
    // 转账
    public void transfer(String outname, String inName, double money);

    // 查询所有
    public List<Account> findAll();
}
