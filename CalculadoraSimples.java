import java.util.Scanner;
public class CalculadoraSimples {
    public static void main (String[] args) {
        double n1, n2;
        double soma, subtracao, multiplicacao, divisao;
        int opcao;
        Scanner entrada  = new Scanner(System.in);
        
        System.out.println("Informa o primeiro valor");
        n1 = entrada.nextDouble();
        System.out.println("Informa o segundo valor");
        n2 = entrada.nextDouble();
    
        System.out.println("######SELECIONE UMA OPERAÇÃO######");
        System.out.println("[1]- SOMA");
        System.out.println("[2]- SUBTRAI");
        System.out.println("[3]- MULTIPLICA");
        System.out.println("[4]- DIVIDI");
        System.out.println(">>>>>Digite sua opção: ");
        opcao = entrada.nextInt(); 
        
        switch(opcao){
            case 1: 
                soma= n1+n2;
                System.out.println("A soma é: "+soma);
                break;
            
            case 2: 
                subtracao= n1-n2;
                System.out.println("A subtracao é: "+subtracao);
                break;
                
            case 3: 
                multiplicacao= n1*n2;
                System.out.println("A multiplicacao é: "+multiplicacao);
                break;
           
            case 4: 
                if(n1>n2){
                    System.out.println("Impossivel realizar o calculo");
                }
                else{
                    divisao= n1/n2;
                    System.out.println("A divisao é: "+divisao);
                }
                break;
                
            default:
                System.out.println("OPERAÇÃO INVÁLIDA");
        }
    }
}