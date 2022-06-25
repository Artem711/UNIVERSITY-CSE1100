import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoundTest {
    @Test
    void getTitle() {
        int trackNumber = 1;
        String title = "New Song";
        String duration = "4:25";
        Song newSong = new Song(trackNumber, title, duration);
        assertEquals(newSong.getTitle(), title);
    }

    @Test
    void getDuration() {
        int trackNumber = 1;
        String title = "New Song";
        String duration = "4:25";
        Song newSound = new Song(trackNumber, title, duration);
        assertEquals(newSound.getDuration(), duration);
    }

    @Test
    void testEqualsTrue() {
        Sound soundOne = new Sound( "New Song", "4:25");
        Sound soundTwo = new Sound( "New Song", "4:25");
        assertEquals(soundOne, soundTwo);
    }

    @Test
    void testEqualsFalse() {
        Sound soundOne = new Sound( "New Song", "4:25");
        Sound soundTwo = new Sound( "New Song", "4:26");
        assertNotEquals(soundOne, soundTwo);
    }

    @Test
    void testEqualsItself() {
        Sound newSound = new Sound( "New Song", "4:25");
        assertEquals(newSound, newSound);
    }
}