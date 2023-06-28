package de.tum.in.ase.eist;

import java.util.List;

public class Context {

    private List<Chapter> book;
    private SearchStrategy searchAlgorithm;

    public boolean isChaptersSortedByName() {
        for (int i = 1; i < book.size(); i++) {
            if (book.get(i - 1).getName().compareTo(book.get(i).getName()) > 0) {
                return false;
            }
        }
        return true;
    }

    public int search(String name) {
        return searchAlgorithm.performSearch(book, name);
    }

    public List<Chapter> getBook() {
        return book;
    }

    public SearchStrategy getSearchAlgorithm() {
        return searchAlgorithm;
    }

    public void setBook(List<Chapter> book) {
        this.book = book;
    }

    public void setSearchAlgorithm(SearchStrategy searchAlgorithm) {
        this.searchAlgorithm = searchAlgorithm;
    }
}
