import javax.swing.JOptionPane;

public class Heloworld{
    
    public static void main( String[] args){
        
        String Operacao =
            JOptionPane.showInputDialog("digite a operação :Somar,Mutiplicar,Dividir,Subritair");
        
        String PrimeiroN =
            JOptionPane.showInputDialog("digite o primeiro numero");
        
        String SegundoN =
            JOptionPane.showInputDialog("digite o segundo numero");
        
         
       
        int Numero1 = Integer.parseInt(PrimeiroN);
        int Numero2 = Integer.parseInt(SegundoN);
        
        int resultado = 0;
        switch (Operacao){
            case "Somar":
               int Soma = Numero1 + Numero2 ; 
               resultado = Soma;
            break;   
            
            case "Mutiplicar":
                int Mutiplicacao = Numero1 * Numero2;
                resultado = Mutiplicacao;
            break;    
            
            case "Divisao":
                int Divisao = Numero1/Numero2;
                resultado = Divisao;
            break;
            
            case "subtracao":
                int Subtracao = Numero1-Numero2;
                resultado = Subtracao;
            break; 
            
            default:
               JOptionPane.showMessageDialog(null,"Operaçao nao encontrada");
            break;
            
        }    
        
        JOptionPane.showMessageDialog(null,"O resultado é " +resultado);
       
    }                        
}
        
        
        
        
    


        
