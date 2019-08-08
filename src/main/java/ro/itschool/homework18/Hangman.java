package ro.itschool.homework18;

import java.util.Objects;

public class Hangman {
    private String word;
    String found;

    public Hangman(String word, String found) {
        this.word = word;
        this.found =replace();
    }
    public String replace() {
        for (int i = 0; i < this.word.length(); i++) {
            found=found+"_";
        }
        return found;
    }

    public String getWord() {
        return word;
    }

    public String getFound() {
        return found;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hangman hangman = (Hangman) o;
        return word.equals(hangman.word) &&
                found.equals(hangman.found);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, found);
    }


}



