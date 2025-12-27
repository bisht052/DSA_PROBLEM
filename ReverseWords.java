class ReverseWords {
    public static void main(String[] args) {

        String str = "the sky is blue";
		// output is : blue is sky the
        String result = "";
        String word = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word = ch + word;
            } else {
                result = result + word + " ";
                word = "";
            }
        }
        result = result + word; // last word

        System.out.println(result);
    }
}
