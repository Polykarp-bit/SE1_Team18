import java.util.*;

public class TopSortIterator implements Iterator<String> {

    private String[] list;
    int pointer;

    public TopSortIterator(String[][] order) {
        List<String> elemente = new ArrayList<String>();

        //Erstellung der Liste der in den Regeln vorhandenen Elemente
        for (int i = 0; i < order.length; i++) {
            if (!elemente.contains(order[i][0])) {
                elemente.add(order[i][0]);
            }
            if (!elemente.contains(order[i][1])) {
                elemente.add(order[i][1]);
            }
        }

        //Ab hier wird Brute-Force verwendet.
        Abhaengigkeit ab = new Abhaengigkeit(order);
        while (!ab.isWellSorted(elemente.toArray(new String[0]))) {
            Collections.shuffle(elemente);
        }
        list = elemente.toArray(new String[0]);
        pointer = 0;
    }

    @Override
    public boolean hasNext() {
        return (pointer < list.length);
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return list[pointer++];
        }
        throw new NoSuchElementException();
    }
}
