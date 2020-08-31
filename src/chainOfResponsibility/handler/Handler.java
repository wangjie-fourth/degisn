package chainOfResponsibility.handler;

import java.util.Objects;

@FunctionalInterface
public interface Handler {

    ConfigContext handle(ConfigContext context);

    default Handler andThen(Handler after) {
        Objects.requireNonNull(after);
        return (ConfigContext context) -> after.handle(context);
    }
}
