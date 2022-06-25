// Sample data:
// - CD U2, Songs of Innocence, 2014
//  - SONG 1, The Miracle, 4:15
//  - SONG 2, Every Breaking Wave, 4:12
//  - SONG 3, California, 4:00
//  - SONG 4, Song for Someone, 3:47
// - CD Coldplay, Parachutes, 2000
//  - SONG 1, Don't Panic, 2:17
//  - SONG 2, Shiver, 5:00
//  - SONG 3, Spies, 5:19
//  - SONG 4, Sparks, 3:47
//  - SONG 5, Yellow, 4:27

// Fields of individual song:
// trackNumber, title, duration

public class Song extends Sound {
    final private int trackNumber;

    public Song(int trackNumber, String title, String duration) {
        super(title, duration);
        this.trackNumber = trackNumber;
    }

    /**
     * A getter for the track number
     * @return integer trackNumber
     */
    public int getTrackNumber() {
        return this.trackNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Song)) return false;
        Song song = (Song) o;
        return (this.getTrackNumber() == song.getTrackNumber()) && (super.equals(song));
    }
}
