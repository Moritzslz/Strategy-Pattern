package de.tum.in.ase.eist;

import java.util.List;

public class BinarySearch {

    public int  performSearch(List<Chapter> chapters, String name) {
        int lowerBound = 0;
        int upperBound = chapters.size() - 1;
        int mid = (lowerBound + upperBound) / 2;
        int comperator = 0;

        if (chapters.get(lowerBound) == chapters.get(upperBound)) {
            return chapters.get(mid).getPageNumber();
        }

        while (lowerBound < upperBound) {
            mid = (lowerBound + upperBound) / 2;
            comperator = chapters.get(mid).getName().compareTo(name);
            if (comperator > 0) {
                lowerBound = mid + 1;
            } else if (comperator < 0) {
                upperBound = mid - 1;
            } else {
                return chapters.get(mid).getPageNumber();
            }
        }
        return -1;
    }
}
