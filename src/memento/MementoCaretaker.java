package memento;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MementoCaretaker {

    private Map<String, List<AttributeValue>> maps = new ConcurrentHashMap<>();

    public void setMemento(String key, AttributeValue value) {
        if (maps.containsKey(key)) {
            maps.get(key).add(value);
        } else {
            List<AttributeValue> values = new ArrayList<>();
            values.add(value);
            maps.put(key, values);
        }
    }

    public AttributeValue findMemento(String key, int version) throws IllegalAccessException {
        if (!maps.containsKey(key) || version >= maps.get(key).size()) {
            throw new IllegalAccessException("There is no related backup for key");
        }
        return maps.get(key).get(version);
    }
}
