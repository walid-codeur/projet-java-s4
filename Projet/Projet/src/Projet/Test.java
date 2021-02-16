package Projet;

public class Test {
  
  public static void main(String[] args){
    OrdinateursFixes of1, of2;
    OrdinateursPortables op1, op2;
    
    of1 = new OrdinateursFixes ("192.168.1.1","192.168.1.254","/24");
    of2 = new OrdinateursFixes ("192.168.1.2","192.168.1.254","/24");
    op1 = new OrdinateursPortables ("192.168.1.3","192.168.1.254","/24");
    op2 = new OrdinateursPortables ("192.168.1.4","192.168.1.254","/24");
    
    System.out.println(of1);
    System.out.println(of2);
    System.out.println(op1);
    System.out.println(op2);
    
  }
}
