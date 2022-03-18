package com.company;

public class Main {

    public static void main(String[] args) {
        String phrase = "a ligeira raposa marrom saltou sobre o cachorro cansado";
        System.out.println(cryptography(phrase));
    }

    static String cryptography(String phrase) {
        String newPhrase = "";
        for(Integer i = 0; i < phrase.length(); i += 1) {
            if(phrase.charAt(i) == " ") {
                newPhrase += " ";
            }else{
                newPhrase += (char)(phrase.charAt(i)+3);
            }
        }

        return newPhrase;
    }
}
