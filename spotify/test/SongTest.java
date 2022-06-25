import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SongTest {
    @Test
    void getTrackNumber() {
        int trackNumber = 1;
        String title = "New Song";
        String duration = "4:25";
        Song newSong = new Song(trackNumber, title, duration);
        assertEquals(newSong.getTrackNumber(), trackNumber);
    }

    @Test
    void testEqualsTrue() {
        Song songOne = new Song(1, "New Song", "4:25");
        Song songTwo = new Song(1, "New Song", "4:25");
        assertEquals(songOne, songTwo);
    }

    @Test
    void testEqualsFalse() {
        Song songOne = new Song(1, "New Song", "4:25");
        Song songTwo = new Song(1, "New Song aa", "4:25");
        assertNotEquals(songOne, songTwo);
    }

    @Test
    void testEqualsItself() {
        Song newSong = new Song(1, "New Song", "4:25");
        assertEquals(newSong, newSong);
    }
}