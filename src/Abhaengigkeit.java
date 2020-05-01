import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Abhaengigkeit implements AbhaengigkeitIF {

    public String[][] abhaengigkeit;

    public Abhaengigkeit(String[][] s1) {
        abhaengigkeit = s1;

    }

    public boolean isWellSorted(String[] sequence) {

        HashSet<String> set = new HashSet<String>();

        for (int x = 0; x < sequence.length; x++) {
            set.add(sequence[x]);
        }

        if (set.size() != sequence.length) {
            return false;
        }


        for (int a = 0; a < abhaengigkeit.length; a++) {
            boolean is_in = false;
            for (int b = 0; b < sequence.length; b++) {
                if (abhaengigkeit[a][1].equals(sequence[b])) {
                    is_in = true;
                }
            }
            if (is_in) {
                for (int c = 0; c < sequence.length; c++) {
                    if ((sequence[c].equals(abhaengigkeit[a][0]))) {
                        break;
                    } else if (c == sequence.length - 1 && !(sequence[c].equals(abhaengigkeit[a][0]))) {
                        return false;
                    }

                }
            }

        }


        for (int i = 0; i < sequence.length; i++) {
            String aktuell = sequence[i];
            for (int j = 0; j < abhaengigkeit.length; j++) {
                if (aktuell.equals(abhaengigkeit[j][1])) {
                    for (int k = i + 1; k < sequence.length; k++) {
                        if (sequence[k].equals(abhaengigkeit[j][0])) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;

    }

}