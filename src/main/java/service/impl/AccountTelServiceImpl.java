package service.impl;

import dao.AccountTel;
import dao.AccountTelExample;
import mapper.AccountTelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import service.AccountTelService;

import java.util.List;

/**
 * @author peanut
 * @date   2018/05/29
 */
public class AccountTelServiceImpl implements AccountTelService {

    @Autowired
    private AccountTelMapper accountTelMapper;
    @Override
    public List<AccountTel> getAccountTelList(AccountTelExample accountTelExample)  {
        return accountTelMapper.selectByExample(accountTelExample);
    }

    @Override
    public boolean insertAccountTel(AccountTel tel) {
        System.out.println("insert");
        return accountTelMapper.insert(tel) == 0;
    }
}
