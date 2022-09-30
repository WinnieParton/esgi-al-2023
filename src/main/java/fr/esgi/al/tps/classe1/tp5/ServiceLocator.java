package fr.esgi.al.tps.classe1.tp5;

import java.util.Map;

public final class ServiceLocator {

    private ServiceLocator() {
        throw new AssertionError();
    }

    private static final Map<String, Object> _registry = Map.of(
            "service1", new MyService1(),
            "service2", new MyService2()
    );

    public static <T> T get(String identifier) {
        return (T)_registry.get(identifier);
    }
}
