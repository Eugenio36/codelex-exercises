package io.codelex.myExercises;


public class UpperLowerCaseReverseInString {
    public static void main(String[] args) {
        String str ="Hello World";
        StringBuffer newStr = new StringBuffer(str);

        for(int i = 0; i < str.length(); i++) {

            //Checks for lower case character
            if(Character.isLowerCase(str.charAt(i))) {
                //Convert it into upper case using toUpperCase() function
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            //Checks for upper case character
            else if(Character.isUpperCase(str.charAt(i))) {
                //Convert it into upper case using toLowerCase() function
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println("String after case conversion : " + newStr);
    }

}
