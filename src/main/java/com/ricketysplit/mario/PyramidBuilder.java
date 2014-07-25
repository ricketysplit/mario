package com.ricketysplit.mario;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PyramidBuilder {

    private PyramidBuilder() {
    }

    private static PyramidBuilder pBuilder;

    public static PyramidBuilder getInstance() {
        if (pBuilder == null) {
            pBuilder = new PyramidBuilder();
        }
        return pBuilder;
    }

    public Pyramid pyramid() {
        int n = 0;
        int size = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            do {
                System.out.println("How tall do you want your pyramid?");
                size = Integer.parseInt(br.readLine());
            } while (!isValid(size));
        } catch (Exception e){
            System.out.println("Not a valid number.");
        }
        return new Pyramid(size);
    }

    private static boolean isValid(int n) {
        if (n < 1 || n > 23) {
            System.out.println("Not a valid number");
            return false;
        } else {
            return true;
        }
    }
}
