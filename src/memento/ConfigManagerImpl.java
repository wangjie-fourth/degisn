package memento;

import chainOfResponsibility.handler.Handler;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConfigManagerImpl implements ConfigManager{

    // 增加中间层，因为map很难做到rollback指定版本
    private MementoCaretaker mementoCaretaker;

    private Map<String, AttributeValue> maps = new ConcurrentHashMap();

    public ConfigManagerImpl(MementoCaretaker mementoCaretaker) {
        this.mementoCaretaker = mementoCaretaker;
    }

    @Override
    public void setConfigValue(String key, AttributeValue value) {
        maps.put(key, value);
        mementoCaretaker.setMemento(key, value);
    }

    @Override
    public void rollback(String key, int version) throws IllegalAccessException {
        AttributeValue value = mementoCaretaker.findMemento(key, version);
        maps.put(key, value);
    }

    @Override
    public AttributeValue getConfigValue(String key) {
        if (!maps.containsKey(key)) {
            throw  new IllegalArgumentException("There is no such value");
        }
        return maps.get(key);
    }
}
