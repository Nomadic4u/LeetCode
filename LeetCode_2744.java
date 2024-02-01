public class LeetCode_2744 {

        public static int maximumNumberOfStringPairs(String[] words) {
            boolean[] str = new boolean[words.length];
            int num = 0;
            for (int i = 0; i < words.length - 1; i++) {
                if(str[i]) {
                    continue;
                }
//                System.out.println(i);
                for (int j = i + 1; j < words.length; j++) {
                    if(str[j]) {
                        continue;
                    }
                    if(words[i].charAt(0) == words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
//                        System.out.println("www");
                        num ++;
                        str[i] = true;
                        str[j] = true;
                        break;
                    }
                }
            }
            return num;

    }

    public static void main(String[] args) {
        String[] s = new String[5];
        s[0] = "cd";
        s[1] = "ac";
        s[2] = "dc";
        s[3] = "ca";
        s[4] = "zz";
        System.out.println(maximumNumberOfStringPairs(s));
    }
}
