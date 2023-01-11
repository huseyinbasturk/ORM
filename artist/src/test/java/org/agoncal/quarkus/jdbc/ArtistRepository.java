package org.agoncal.quarkus.jdbc;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@ApplicationScoped
public class ArtistRepository {

    @Inject
    DataSource dataSource;

    public void persist(Artist artist) throws SQLException{
        Connection conn = dataSource.getConnection();
        String sql = "ÏNSERT INTO t_artists";
    }

    public Artist findById(Long id) throws SQLException{
        Connection conn = dataSource.getConnection();

        Artist artist = new Artist();
        return artist;
    }
}
