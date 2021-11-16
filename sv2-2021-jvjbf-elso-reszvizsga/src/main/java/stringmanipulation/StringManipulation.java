package stringmanipulation;

public class StringManipulation {


    public StringBuilder everyEvenCharacter(String s) {
        StringBuilder st = new StringBuilder();

        for (int i = 0; i < s.length(); i += 2) {
            st.append(s.charAt(i));
        }
        return st;
    }
}
