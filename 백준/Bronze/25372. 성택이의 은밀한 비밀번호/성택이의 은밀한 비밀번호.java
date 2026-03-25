import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); 
        
        for(int i = 0; i < N; i++){ 
            String password = br.readLine();
            int len = password.length(); 
            
            if((len >= 6) && (len <= 9)){ 
                sb.append("yes").append("\n");
            }
            else{ 
                sb.append("no").append("\n");
            }
        }
        
        System.out.println(sb.toString());

    }

}