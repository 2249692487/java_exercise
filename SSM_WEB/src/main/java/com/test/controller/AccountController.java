package com.test.controller;

import com.test.pojo.Account;
import com.test.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 描述：待描述
 * </p>
 *
 * @author QinLiNa
 * @data 2019/1/8
 */
@Controller
@RequestMapping("account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/transfer/{out}/{in}/{money}")
    public ModelAndView transfer(@PathVariable("out") String outName,
                                 @PathVariable("in") String inName,
                                 @PathVariable("money") double money) {
        accountService.transfer(outName, inName, money);
        ModelAndView mv = new ModelAndView("transfer");
        mv.addObject("msg", outName + "给" + inName + "转账" + money + "元 成功!");
        return mv;
    }

    @RequestMapping("findAll")
    public ModelAndView findAll() {

        List<Account> all = accountService.findAll();
        ModelAndView mv = new ModelAndView("findAll");
        mv.addObject("all", all);
        System.out.println("all================================" + all);
        return mv;
    }
}
