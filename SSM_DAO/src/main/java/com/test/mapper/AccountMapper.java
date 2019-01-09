package com.test.mapper;

import com.test.pojo.Account;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 描述：待描述
 * </p>
 *
 * @author QinLiNa
 * @data 2019/1/8
 */
public interface AccountMapper {
    // 出账
    public void out(@Param("name") String outAccount, @Param("money") double money);

    // 入账
    public void in(@Param("name") String inAccount, @Param("money") double money);

    // 查询所有账户
    public List<Account> findAll();
}
