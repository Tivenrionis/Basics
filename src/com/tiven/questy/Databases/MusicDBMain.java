package com.tiven.questy.Databases;

import com.tiven.questy.Databases.model.Artist;
import com.tiven.questy.Databases.model.Datasource;
import com.tiven.questy.Databases.model.SongArtist;

import java.util.List;
import java.util.Scanner;

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

        List<String> artist_albums = datasource.queryAlbumsForArtist("Carole King", Datasource.ORDER_BY_DESC);
        if (artist_albums != null) {
            artist_albums.forEach(System.out::println);
        }

        List<SongArtist> songArtists = datasource.queryArtistsForSongs("Go Your Own Way", Datasource.ORDER_BY_ASC);
        if (songArtists == null) {
            System.out.println("Couldn't find the artists");
            return;
        }

        songArtists.forEach(s -> {
            System.out.println("Artist name = " + s.getArtistName() + " Album name = " + s.getAlbumName() + " track = " + s.getTrack());
        });

        datasource.querySongsMetaData();

        System.out.println(datasource.getCount(Datasource.TABLE_SONGS));
        datasource.createViewForArtistAndSongs();

        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER NAME OF A SONG ");
        String title = scanner.nextLine();

        songArtists = datasource.querySongInfoView(title);
        if (songArtists.isEmpty()) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for (SongArtist artist : songArtists) {
            System.out.println("FROM VIEW - Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track number = " + artist.getTrack());
        }

        datasource.close();
    }
}
