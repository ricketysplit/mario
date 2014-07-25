package com.ricketysplit.mario;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author r.harkins
 */
public class Pyramid {
    private int size;

    public Pyramid() {

    }

    public Pyramid(int size) {
        this.size = size;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            int count = 0;
            while (count++ < i) {
                builder.append("#");
            }
            builder.append("\n");
        }
        return builder.toString();
    }

}
