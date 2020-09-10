package memento;

public interface ConfigManager {

    /**
     * Set Configuration value
     *
     * @param key
     * @param value
     */
    void setConfigValue(String key, AttributeValue value);

    /**
     * Rollback the configuration to assigned version
     *
     * @param key
     * @param version
     */
    void rollback(String key, int version) throws IllegalAccessException;

    /**
     * Get configuration value for special key
     *
     * @param key
     * @return
     */
    AttributeValue getConfigValue(String key);

}
