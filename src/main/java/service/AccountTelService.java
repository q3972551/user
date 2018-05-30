package service;

import dao.AccountTel;
import dao.AccountTelExample;

import java.util.List;

/**
 * @author peanut
 * @date   2018/05/29
 */
public interface AccountTelService {

    /**
     * 获取所有电话账号
     * @param accountTelExample
     * @return
     */
    public List<AccountTel> getAccountTelList(AccountTelExample accountTelExample) ;

    /**
     * 插入电话账号
     * @param tel
     * @return
     */
    public boolean insertAccountTel(AccountTel tel);
}
