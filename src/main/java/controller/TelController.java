package controller;

import common.error.ErrorCode;
import module.result.Result;
import org.peanut.common.utils.SMSTools;
import org.peanut.common.utils.StringUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author peanut
 * @date   2018/05/23
 */
@Controller
@RequestMapping(value = "/tel",produces="text/plain;charset=UTF-8")
public class TelController {

    @RequestMapping("/code")
    public String getCode(String tel)
    {
        String error = "0";
        if (StringUtil.isTel(tel))
        {
            error = ErrorCode.REG_TEL_ILEGAL;
        }
        else
        {
            SMSTools.veriyCode(tel);
        }


        return new Result(error).toString();
    }
}
