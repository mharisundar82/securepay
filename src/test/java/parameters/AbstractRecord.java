package parameters;

import java.lang.reflect.Field;

public abstract class AbstractRecord {

    public String getFieldValue(String name) {
        Class<? extends Object> pClass = this.getClass();
        Field field;
        try {
            field = pClass.getDeclaredField(name);
            field.setAccessible(true);
            String value = (String) field.get(this);
            return value;
        } catch (Exception e) {

            e.printStackTrace();
        }
        return null;
    }


}
