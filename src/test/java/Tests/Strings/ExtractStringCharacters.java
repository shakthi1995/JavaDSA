package Tests.Strings;

import org.example.DTO.SegregatedBuilderClass;
import org.testng.annotations.Test;

public class ExtractStringCharacters {

    public SegregatedBuilderClass segregateStringDigits(String str) {
        StringBuilder num = new StringBuilder();
        StringBuilder alpha = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.charAt(i) != ' '){
                if (Character.isDigit(ch)) {
                    num.append(ch);
                } else if (Character.isLetter(ch)) {
                    alpha.append(ch);
                } else {
                    special.append(ch);
                }
            }
        }

        return new SegregatedBuilderClass(num, alpha, special);

    }

    @Test
    public void PrintSegregatedString(){
        String str = "135373#$%&* SGJKL fehdjf";
        SegregatedBuilderClass output = segregateStringDigits(str);
        System.out.println(output.num);
        System.out.println(output.alpha);
        System.out.println(output.special);
    }
}
