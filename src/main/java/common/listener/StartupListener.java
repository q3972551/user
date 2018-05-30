package common.listener;

import common.config.Config;
import common.module.ModuleManager;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 启动监听类
 * @author peanut
 * @date   2018/05/24
 */


public class StartupListener implements ApplicationContextAware{

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        this.init();
        System.out.println("Application start!" + Config.getId());
    }

    /**
     * 初始化
     */
    private void init()
    {
        Config.init();
        ModuleManager.getInstance().init();
    }
}
