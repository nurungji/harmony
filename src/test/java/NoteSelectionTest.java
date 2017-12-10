import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NoteSelectionTest {

    @Test
    public void canAddNoteTest() {
        // given
        Harmony harmony = new Harmony();

        // when
        harmony.addNote(1.0f);
        harmony.addNote(3.0f);
        harmony.addNote(5.0f);

        // then
        assertTrue(harmony.isChord());
    }

}
