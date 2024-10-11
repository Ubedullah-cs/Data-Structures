import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NLArray {
    // ... (rest of the code remains the same)

    public static void main(String[] args) {
        String fileName = "test.txt"; // replace with your file name
        String[] words = wordTokenize(fileName);
        String[] emails = extractEmail(fileName);

        // Save tokenized words to a file
        try {
            File wordFile = new File("words.txt");
            PrintWriter wordWriter = new PrintWriter(wordFile);
            for (String word : words) {
                wordWriter.println(word);
            }
            wordWriter.close();
            System.out.println("Words saved to words.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error saving words to file");
        }

        // Save extracted emails to a file
        try {
            File emailFile = new File("emails.txt");
            PrintWriter emailWriter = new PrintWriter(emailFile);
            for (String email : emails) {
                emailWriter.println(email);
            }
            emailWriter.close();
            System.out.println("Emails saved to emails.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error saving emails to file");
        }
    }

    private static String[] extractEmail(String fileName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'extractEmail'");
    }

    private static String[] wordTokenize(String fileName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wordTokenize'");
    }
}