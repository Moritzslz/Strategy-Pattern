package de.tum.in.ase.eist;

import java.util.List;

public class LinearSearch implements SearchStrategy {

    public int  performSearch(List<Chapter> chapters, String name) {
        for (int i = 0; i < chapters.size(); i++) {
            if (chapters.get(i).getName().equals(name)) {
                return chapters.get(i).getPageNumber();
            }
        }
        return -1;
    }
}
