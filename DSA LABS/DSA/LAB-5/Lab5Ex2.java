class Lab5Ex2 {
     public static char firstSingleLetter(char text[], int n) {
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (text[i] == text[j]) {
                    count++;
                    break; // No need to check further if we found a duplicate
                } 
            }
            // If count is still 1, then the character is unique
            if (count == 1) {
                return text[i];
            }
        }
        // If no unique character is found, return '/'
        return '/';
    }
     public static void main(String[] args) {
        String s = "UBEDUB"; // You can test with any string, like "algorithm"
        char[] text = new char[s.length()];
         for (int i = 0; i < s.length(); i++) {
             text[i] = s.charAt(i);
            }
         // Correct the printing statement
         System.out.println(firstSingleLetter(text, text.length));
     }
 }