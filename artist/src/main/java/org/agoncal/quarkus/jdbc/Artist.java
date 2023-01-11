package org.agoncal.quarkus.jdbc;

import java.time.Instant;

public class Artist {

    private Long id;
    private String name;
    private String bio;
    private Instant createdDate = Instant.now();
}
