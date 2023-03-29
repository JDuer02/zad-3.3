import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  int[][] tablica= new int[9][9];
  Scanner scanner = new Scanner(System.in);
  for (int i=0; i<=10; i++)
    {
      for(int j=0; j<=10; j++)
        tablica[i][j]=scanner.nextInt();
      
    }

  for(int i=0; i<=10; i++)
    {
      for(int j=0;j<=10;j++)
        System.out.println(tablica[i][j]);
    }
  }
}