
package calculadora;



import javax.swing.JOptionPane;

public class Calculadora {
    
    
    
    public static void main(String[] args) {
        
       
     
        String firstNumber = JOptionPane.showInputDialog("insira um numero") ;   
        String secondNumber = JOptionPane.showInputDialog("insira 0 segundo numero");
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber );
        double  resultado= 0 ;
        
        String operacao = JOptionPane.showInputDialog(" Escolha uma das operações + - * /");
       
        
        if ( operacao.equals ("+")){ 
            
            resultado = number1 + number2 ;
        }
         if (operacao.equals("-")){
              resultado = number1 - number2 ;
         }    
         
         if  (operacao.equals("*")){
              resultado = number1 * number2 ;
               
         }
         if (operacao.equals("/")){
             
              resultado = number1 / number2 ;
             
         }
             
           
    
      JOptionPane.showMessageDialog(null,"the sum is "+resultado,"sum of two Integers",JOptionPane.PLAIN_MESSAGE);  
     
       
    }
     
}
