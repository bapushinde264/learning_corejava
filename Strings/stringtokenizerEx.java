package Strings;

import java.util.StringTokenizer;

public class stringtokenizerEx {
    public static void main(String[] args) {

        String str = "JAVA DOTNET C C#";

        StringTokenizer st = new StringTokenizer(str, "|");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
