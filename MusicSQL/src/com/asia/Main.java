package com.asia;

import com.asia.model.Artist;
import com.asia.model.DataSource;
import com.asia.model.SongArtist;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();
        if (!dataSource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists = dataSource.queryArtists(DataSource.ORDER_BY_NONE);
        if (artists == null) {
            System.out.println("No artists!");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        List<String> albumsForArtist =
            dataSource.queryAlbumsForArtist("Carole King", DataSource.ORDER_BY_ASC);

        for (String album : albumsForArtist) {
            System.out.println(album);
        }

        List<SongArtist> songArtists = dataSource.queryArtistsForSong("Heartless", DataSource.ORDER_BY_ASC);
        if (songArtists == null) {
            System.out.println("Couldn't find the artist for the song");
            return;
        }

        for (SongArtist artist : songArtists) {
            System.out.println("Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track = " + artist.getTrack());
        }

        dataSource.querySongsMetadata();

        int count = dataSource.getCount(DataSource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);

        dataSource.createViewForSongArtists();

        dataSource.close();
    }
}
