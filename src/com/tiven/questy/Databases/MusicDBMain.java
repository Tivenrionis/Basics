package com.tiven.questy.Databases;

import com.tiven.questy.Databases.model.Artist;
import com.tiven.questy.Databases.model.Datasource;

import java.util.List;

public class MusicDBMain {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists = datasource.queryArtists();
        artists.forEach(a -> System.out.println(a.getName()));

        datasource.close();
    }
}
