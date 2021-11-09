package stringmanipulation;

public class StringManipulation {
    StringBuilder st = new StringBuilder();

    public StringBuilder everyEvenCharacter(String s) {

        for (int i = 0; i < s.length(); i += 2) {
            st.append(s.charAt(i));
        }
        return st;
    }
}
