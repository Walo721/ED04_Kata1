/**
 * Recibe un String el cual contiene palabras divididas por "-" o "_" y devuelve un String
 * sin los símbolos mencionados.
 * En caso de que la primera letra de la primera palabra esté en minúsculas es respetado,
 * pero en las palabras consiguientes la primera letra estará en mayúsculas.
 *
 */

public class Solution {
    public static String toCamelCase(String str){
        if (str != null){
            str = str.replaceAll("-", "_");
            String[] words = str.split("_");
            String word = words[0];

            for (String palabra: words){
                if (!palabra.equals(words[0])){
                    palabra = (palabra.substring(0,1).toUpperCase() + palabra.substring(1));
                    word += palabra;
                }
            }
            return word;
        }
        else return null;
    }
}
