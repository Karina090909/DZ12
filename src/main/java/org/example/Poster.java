package org.example;

public class Poster {
    private String[] poster = new String[0];
    private int limit = 5;

    public Poster(int limit) {
        this.limit = limit;
    }

    public Poster() {
    }

    public void add(String newPoster) {
        String[] tmp = new String[poster.length + 1];
        for (int i = 0; i < poster.length; i++) {
            tmp[i] = poster[i];

        }
        tmp[tmp.length - 1] = newPoster;
        poster = tmp;
    }

    public String[] findAll() {

        return poster;
    }

    public String[] findLast() {

        int resultLength;
        if (limit < poster.length) {
            resultLength = limit;
        } else {
            resultLength = poster.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = poster[poster.length - 1 - i];
        }
        return result;
    }
}

