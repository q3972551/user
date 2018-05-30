package module.result;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author peanut
 * @date   2018/05/22
 */
public class Result {

    private String error = "0";
    public Result(String error)
    {
        this.error = error;
    }

    @Override
    public String toString()
    {
        ObjectMapper mapper = new ObjectMapper();
        mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        try {
            String result = mapper.writeValueAsString(this);
            return result;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }
}
