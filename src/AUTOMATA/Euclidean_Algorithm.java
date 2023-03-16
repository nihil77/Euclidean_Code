package AUTOMATA;

import javax.swing.JOptionPane;

public class Euclidean_Algorithm{
        
    static String computation ="";
        
        public static void main(String args[]){
            
              JOptionPane.showMessageDialog(null,"Give me two numbers to find the Greatest Common divisor and Least common multiple\r\n"
                  + " of those two numbers.");
             
              String input = JOptionPane.showInputDialog("First Number : ");
             
              int Number1 = Integer.parseInt(input);
              
              String input2 = JOptionPane.showInputDialog("Second Number : ");
              
              int Number2 = Integer.parseInt(input2);
              

          
            String test = computation + "\n"+"The gcd of " + Number1 + " and " + Number2 + " is "+ solutionGCD(Number1, Number2);
            
            String messageGCD1 = computation + "\n"+"The gcd of " + Number1 + " and " + Number2 + " is "+ solutionGCD(Number1, Number2);
            String messageLCM= "The LCM of ("+Number1+", "+ Number2 +") = "+ Number1 + "*" + Number2 + "/" +  solutionGCD(Number1, Number2) + " = " + solutionLCM(Number1, Number2, solutionGCD(Number1, Number2));
            JOptionPane.showMessageDialog(null, messageGCD1);
            JOptionPane.showMessageDialog(null, messageLCM);
                
            }
              
            
        // For the GCD
        	//two integer arguments
        static int solutionGCD(int Number1, int Number2) {
                        
            int rem = 1;
            do {
                int quotient = Number1 / Number2;
                rem = Number1 % Number2;
                
                // computation string is the current step of the algorithm in a human-readable format.
                computation += Number1 + " = " + Number2 + " (" + quotient + ") + " + rem +"\n";
                
                //if the remainder is 0, the loop exits
                if(rem!=0) {
                    Number1 = Number2;
                    Number2 = rem;
                }else {
                    break;
                }
                
            }while (rem != 0);
            
        	// loop exits and the value of Number 2, which is the GCD, is returned
            return Number2;
        }
        
     // For the LCM
        // three integer arguments
        static int solutionLCM(int firstNUM, int secondNUM, int gcd) {
           
        	// multiplying the two input integers, then dividing
        	int lcm = (firstNUM * secondNUM) / gcd;
            return lcm;
        }
        
        
}