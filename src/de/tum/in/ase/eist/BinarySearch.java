package de.tum.in.ase.eist;

import java.util.List;

public class BinarySearch implements SearchStrategy {

    public int  performSearch(List<Chapter> chapters, String name) {
        int lowerBound = 0;
        int upperBound = chapters.size() - 1;
        int mid = (lowerBound + upperBound) / 2;
        int comperator;

        if (chapters.get(lowerBound) == chapters.get(upperBound)) {
            return chapters.get(mid).getPageNumber();
        }

        while (lowerBound < upperBound) {
            mid = (lowerBound + upperBound) / 2;
            comperator = chapters.get(mid).getName().compareTo(name);
            if (comperator < 0) {
                lowerBound = mid + 1;
            } else if (comperator > 0) {
                upperBound = mid - 1;
            } else {
                return chapters.get(mid).getPageNumber();
            }
        }

        if (lowerBound == upperBound && chapters.get(lowerBound).getName().equals(name)) {
            return chapters.get(lowerBound).getPageNumber();
        }

        return -1;
    }
}
