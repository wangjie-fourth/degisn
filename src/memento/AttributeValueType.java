package memento;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

public enum AttributeValueType {
    INTEGER(Integer.class),
    LONG(Long.class),
    DOUBLE(Double.class),
    BIG_INTEGER(BigInteger.class),
    BIG_DECIMAL(BigDecimal.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_BUFFER(ByteBuffer.class),
    LIST(List.class),
    MAP(Map.class),
    OBJECT(Object.class);

    private Class<?> type;

    AttributeValueType(Class<?> type) {
        this.type = type;
    }

    public Class<?> getType() {
        return type;
    }
}
