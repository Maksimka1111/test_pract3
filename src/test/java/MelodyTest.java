import org.example.Melody;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MelodyTest {
    Melody melody = new Melody();

    @Test
    public void AddFileToFinalMelody(){
        assertTrue(melody.addFile("C:/Users/makst/Downloads/audio.wav", 0, 3));

    }
    @Test
    public void AddFilesToFinalMelody(){
        String[] paths = {"C:/Users/makst/Downloads/audio.wav", "C:/Users/makst/Downloads/audio2.wav"};
        long[] start = {0, 0};
        long[] end = {3, 3};

        assertTrue(melody.addFiles(paths, start, end));
    }
}
