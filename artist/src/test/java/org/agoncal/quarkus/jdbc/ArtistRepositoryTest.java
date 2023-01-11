package org.agoncal.quarkus.jdbc;

import io.quarkus.test.junit.QuarkusTest;

import javax.inject.Inject;

@QuarkusTest
public class ArtistRepositoryTest {

    @Inject
    ArtistRepository repository;
}
