package com.company;

import java.util.ArrayList;

public class IdenticalCharactersSeparated {
    public static String separationOfText(String userInput) {
        ArrayList<String> userInputToArray = new ArrayList<String>(100);

        for (int i = 0; i < userInput.length(); i++) {
            userInputToArray.add(Character.toString(userInput.charAt(i)));
        }

        int j = 1;
        int a = userInputToArray.size();
        for (int i = 0; i < a - 1; i++) {
            if (userInput.charAt(i) == userInput.charAt(i + 1)) {
                userInputToArray.add(i + j, "*");
                j++;
            }

        }
        String afterRemovingSpaces = "";
        afterRemovingSpaces = userInputToArray.toString().replaceAll("\\s+", "");
        return afterRemovingSpaces;
    }
    public static void main (String[] args) {
        System.out.println(separationOfText("aaaaa"));
    }
}
