import java.io.*;

public class FileRead {
    public static void main(String[] args) throws IOException {
        BufferedReader br;
        FileReader fr;
        String fn,a;
        br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter file name");
        fn=br.readLine();
        try
        {
            fr=new FileReader(fn);
            br=new BufferedReader(fr);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("file not found");;
            return;
        }
        while ((a=br.readLine())!=null)
        {
            System.out.println(a);
        }
        fr.close();

    }
}
