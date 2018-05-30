package common.config;


import java.util.ResourceBundle;

/**
 * @author peanut
 * @date   2018/05/26
 */
public class Config {

    private static int s_id = 0;

    public static void init()  {
        ResourceBundle resource = ResourceBundle.getBundle("properties/config");
        String value = resource.getString("id");

        if (value == null)
        {
            throw new IllegalArgumentException("id not exit!");
        }

        s_id = Integer.valueOf(value);
    }

    public static int getId()
    {
        return s_id;
    }
}
