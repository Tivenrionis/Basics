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

        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_NONE);
        if (artists != null) {
            System.out.println(artists.size());
            artists.forEach(a -> {
                System.out.println("ID " + a.getId() + " NAME " + a.getName());
            });
        } else {
            System.out.println("NO Artists");
            return;
        }

        List<String> artist_albums = datasource.queryAlbumsForArtist("Aerosmith", Datasource.ORDER_BY_ASC);
        if (artist_albums != null) {
            artist_albums.forEach(System.out::println);
        }


        datasource.close();
    }
}
