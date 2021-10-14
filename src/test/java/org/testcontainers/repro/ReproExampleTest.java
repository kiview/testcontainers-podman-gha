package org.testcontainers.repro;

import org.junit.Test;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

public class ReproExampleTest {

    @Test
    public void firstContainer() {
        try (
            GenericContainer<?> container = new GenericContainer<>(DockerImageName.parse("redis:6.0.5"))
                    .withExposedPorts(6379)
        ) {
            container.start();
        }
    }

    @Test
    public void secondContainer() {
        try (
            // customize the creation of a container as required
            GenericContainer<?> container = new GenericContainer<>(DockerImageName.parse("redis:6.0.5"))
                    .withExposedPorts(6379)
        ) {
            container.start();
        }
    }
}
