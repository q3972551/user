package common.worker;

import common.config.Config;
import common.module.IModule;
import org.peanut.common.worker.IdWorker;
import org.peanut.common.worker.WorkLeader;

import java.util.ResourceBundle;

/**
 * @author peanut
 * @date   2018/05/26
 */
public class UuidWorker implements IModule {

    private static UuidWorker instance = null;

    private IdWorker idWorker = null;

    private UuidWorker()
    {

    }

    public static UuidWorker getInstance()
    {
        if (instance == null)
        {
            instance = new UuidWorker();
        }

        return instance;
    }

    @Override
    public void init() {
        this.idWorker = new IdWorker(WorkLeader.REG_USER,Config.getId());
    }

    public long getUuidForUser()
    {
        return this.idWorker.nextId();
    }
}
