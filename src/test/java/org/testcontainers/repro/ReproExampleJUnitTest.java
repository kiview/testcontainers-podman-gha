package org.testcontainers.repro;

import org.junit.Rule;
import org.junit.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

public class ReproExampleJUnitTest {

    @Rule
    public GenericContainer<?> container = new GenericContainer<>(DockerImageName.parse("redis:6.0.5"))
                    .withExposedPorts(6379);

    @Test
    public void demonstration() {
        assert true;
    }
}
