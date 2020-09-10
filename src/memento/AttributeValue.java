package memento;

import java.nio.ByteBuffer;
import java.util.*;

public class AttributeValue {

    private AttributeValueType type = AttributeValueType.OBJECT;

    private String s;

    private Number n;

    private ByteBuffer b;

    private Boolean bool;

    private boolean nULL;

    private List<AttributeValue> l;

    private Map<AttributeValue, AttributeValue> m;

    private Object o;

    public static class Builder {
        private AttributeValue type;
        private String s;
        private Number n;
        private ByteBuffer b;
        private Boolean bOOL;
        private boolean nULL;
        private List<AttributeValue> l;
        private Map<AttributeValue, AttributeValue> m;
        private Object o;

        public Builder withType(AttributeValue type){
            this.type = type;
            return this;
        }

        public Builder withS(String s) {
            this.s = s;
            return this;
        }

        public Builder withN(Number n) {
            this.n = n;
            return this;
        }

        public Builder withB (ByteBuffer b) {
            this.b = b;
            return this;
        }

        public Builder withBool(Boolean bOOL) {
            this.bOOL = bOOL;
            return this;
        }

        public Builder withNull (Boolean nULL) {
            this.nULL = nULL;
            return this;
        }

        public Builder withList(List<AttributeValue> l){
            this.l = l;
            return this;
        }

        public Builder withMap(Map<AttributeValue, AttributeValue> m){
            this.m = m;
            return this;
        }

        public Builder withObject(Object o){
            this.o = o;
            return this;
        }
        private Builder(Builder builder) {
            this.type = builder.type;
            this.s = builder.s;
            this.n = builder.n;
            this.b = builder.b;
            this.bOOL = builder.bOOL;
            this.nULL = builder.nULL;
            this.l = builder.l;
            this.m = builder.m;
            this.o = builder.o;
        }

//        public Object toValue() {
//            switch (type) {
//
//            }
//        }
    }
}
