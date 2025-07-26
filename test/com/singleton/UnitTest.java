package com.singleton;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTest {

    @Test
    void testSingletonNotNull() {
        singletonClass instance = singletonClass.getInstance();
        assertNotNull(instance, "Singleton instance should not be null");
    }

    @Test
    void testSingletonSameInstance() {
        singletonClass instance1 = singletonClass.getInstance();
        singletonClass instance2 = singletonClass.getInstance();
        assertSame(instance1, instance2, "Both instances should be the same");
    }

    @Test
    void testMariamTempLogic() {
        singletonClass instance = singletonClass.getInstance();
        instance.setMariamTemp(15); // Expected output: cold weather
    }
}
