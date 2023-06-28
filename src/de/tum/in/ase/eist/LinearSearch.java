package de.tum.in.ase.eist;

import java.util.List;

public class LinearSearch {

    public LinearSearch() {}

    public int  performSearch(List<Chapter> chapters, String page) {
        for (int pageNumber = 0; pageNumber < chapters.size(); pageNumber++) {
            if (chapters.get(pageNumber).getName() == page) {
                return pageNumber;
            }
        }
        return -1;
    }
}
