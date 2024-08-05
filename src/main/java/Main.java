import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
  
    System.out.println("coloque sua senha ");

    int senha = sc.nextInt();
  
    while(senha!= 2022) {
     
      System.out.println("senha incorreta");
      System.out.println("digite novamente");

      senha = sc.nextInt();
    }
    if (senha == 2022) {

       System.out.println("Senha correta. bem-vindo(a)");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    sc.close();

  }
}