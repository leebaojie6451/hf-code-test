public class Stage1 {

    public static void main(String[] args) {
        String str = "aabcccbbad";
        System.out.println("remove(str) = " + remove(str));

        String str2 = "abcccbad";
        System.out.println("replace(str2) = " + replace(str2));
    }

    public static String remove(String str) {
        while (true) {
            boolean found = false;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); ) {
                int j = i + 1;
                while (j < str.length() && str.charAt(j) == str.charAt(i)) {
                    j++;
                }

                if (j - i >= 3) {
                    found = true;
                    i = j;
                } else {
                    sb.append(str, i, j);
                    i = j;
                }
            }

            str = sb.toString();

            if (!found) {
                break;
            }
        }

        return str;
    }

    public static String replace(String str) {
        while (true) {
            boolean found = false;
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); ) {
                int j = i + 1;
                while (j < str.length() && str.charAt(j) == str.charAt(i)) {
                    j++;
                }

                if (j - i >= 3) {
                    found = true;

                    if (str.charAt(i) == 'c') {
                        sb.append('b');
                    } else if (str.charAt(i) == 'b') {
                        sb.append('a');
                    } else if (str.charAt(i) == 'a') {

                    }
                    i = j;
                } else {
                    sb.append(str, i, j);
                    i = j;
                }
            }

            str = sb.toString();

            if (!found) {
                break;
            }
        }

        return str;
    }
}
