import java.util.Scanner;

public class Alphabet_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter the string for pattern");
        Scanner sc=new Scanner(System.in);
        String w=sc.nextLine();
        System.out.println("Pattern is:");
        for(int i=0;i<w.length()-1;i++)
        {
            System.out.println(w.substring(0,w.length()-i));
        }
        for(int j=0;j<=w.length()-1;j++)
        {
            System.out.println(w.substring(0,j+1));
        }

    }
}
output:
Enter the string for pattern
Github
Pattern is:
Github
Githu
Gith
Git
Gi
G
Gi
Git
Gith
Githu
Github
