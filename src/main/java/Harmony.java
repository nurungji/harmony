import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Harmony {

    private List<Float> harmonyList;

    public Harmony() {
        harmonyList = new ArrayList<>();
    }

    public boolean isChord() {
        return true;
    }

    public String getChord() {
        Collections.sort(harmonyList, new Comparator<Float>() {
            @Override
            public int compare(Float o1, Float o2) {
                if (o1 > o2) {
                    return 1;
                } else if (o1 < o2) {
                    return -1;
                }
                return 0;
            }
        });
        return "";
    }

    public void addNote(float note) {
        harmonyList.add(note);
    }

    private enum HarmonySet {

    }
}

