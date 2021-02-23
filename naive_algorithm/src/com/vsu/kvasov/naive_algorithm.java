package com.vsu.kvasov;
import java.util.ArrayList;


public class naive_algorithm {

    public static void main(String[] args) {

        String text = "aabaaaaabaaaabbaaab"; //строка
        String sample = "ab"; //образец

        System.out.println(searchNaive(text, sample));
    }

    static ArrayList<Integer> searchNaive(String text, String sample) {
        ArrayList<Integer> foundPositions = new ArrayList<>();
        //по всем символам текста
        for (int i = 0; i < text.length(); i++) {
            int j = 0; //переменная для указания позиции образца
            while (j < sample.length() && i + j < text.length() && sample.charAt(j) == text.charAt(i + j)) {
                j++;
            }
            if (j == sample.length()) {
                foundPositions.add(i);
            }
        }
        return foundPositions;
    }
}
