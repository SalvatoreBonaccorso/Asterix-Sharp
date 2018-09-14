import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String asterix="";
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci quanti * e # vuoi visualizzare : ");
        n=scanner.nextInt();
        for(int i=0;i<n;i++){
            asterix=asterix+"*";
        }
        for(int j=0;j<n;j++){
            System.out.println(asterix.substring(j));   // (asterix.substring(0, asterix.length() - 1));
        }
        String sharp="";
        for(int k=0;k<n;k++){
            sharp=sharp+"#";
            System.out.println(sharp);
        }
    }
}
