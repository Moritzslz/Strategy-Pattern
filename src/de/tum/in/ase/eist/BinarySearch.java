package de.tum.in.ase.eist;

import java.util.List;

public class BinarySearch {

    public int  performSearch(List<Chapter> chapters, String name) {
        int lowerBound = 0;
        int upperBound = chapters.size()- 1;
        int mid = (lowerBound + upperBound) / 2;
        int comperator = 0;

        if (chapters.get(lowerBound) == chapters.get(upperBound))
            return chapters.get(mid).getPageNumber();

        while (lowerBound < upperBound) {
            comperator = 0;
            mid = (lowerBound + upperBound) / 2;
            comperator = chapters.get(mid).getName().compareTo(name);
            if (comperator < 0)
                lowerBound = mid + 1;
            else if (comperator > 0)
                upperBound = mid - 1;
            else if (chapters.get(mid).getName().equals(name))
                return chapters.get(mid).getPageNumber();
        }
        int comperator2 = chapters.get(0).getName().compareTo(name);
        int comperator3 = chapters.get(chapters.size() - 1).getName().compareTo(name);
        if (comperator2 < 0)
            return -1;
        else if (comperator3 > 0)
            return -1;
        return -1;
    }
}
