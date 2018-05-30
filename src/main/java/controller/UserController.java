package controller;

import dao.AccountTel;
import module.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AccountTelService;

import javax.servlet.http.HttpServletRequest;

/**
 * @author peanut
 * @date   2018/05/16
 *
 * 用户操作类 ， 注册，修改用户信息
 */

@Controller
@RequestMapping(produces="text/plain;charset=UTF-8")
public class UserController {

    @Autowired
    private AccountTelService accountTelService;

    @RequestMapping("/login/tel")
    public @ResponseBody String loginForTel(HttpServletRequest request)
    {
        String tel    = request.getParameter("tel");
        String passwd = request.getParameter("passwd");
        return new Result("0").toString();
    }

    @RequestMapping("/register/tel")
    public @ResponseBody String registerForTel(HttpServletRequest request)
    {
        String error = "0";
        return new Result(error).toString();
    }

    @RequestMapping("/login/wx")
    public @ResponseBody String LoginForTel(HttpServletRequest request)
    {

        return new Result("0").toString();
    }

    @RequestMapping("/register/wx")
    public @ResponseBody String registerForWx(HttpServletRequest request)
    {

        return new Result("0").toString();
    }
}
