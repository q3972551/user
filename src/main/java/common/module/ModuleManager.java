package common.module;

import common.worker.UuidWorker;
import java.util.ArrayList;
import java.util.List;

/**
 * @author peanut
 * @date   2018/05/24
 */
public class ModuleManager {
    private List<IModule> moduleList = new ArrayList<IModule>();
    private static ModuleManager instance = null;

    private ModuleManager(){}

    public static ModuleManager getInstance()
    {
        if(instance == null)
        {
            instance = new ModuleManager();
        }

        return instance;
    }

    private void regModule(IModule module)
    {
        this.moduleList.add(module);
    }

    private void initModule()
    {
        for (int i = 0 ; i < moduleList.size() ; i ++)
        {
            IModule iModule = moduleList.get(i);
            iModule.init();
        }
    }

    public void init()
    {
        this.registerModules();
        this.initModule();
    }

    private void registerModules()
    {
        this.regModule(UuidWorker.getInstance());
    }
}
