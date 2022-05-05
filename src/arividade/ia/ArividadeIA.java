/*
Amigdalite / dor de garganta/ febre/ dor de cabeça
Pneumonia /febre, dificuldade para respirar, dor nas costas ,tosse
Gripe / tosse, calafrios, dor no corpo, febre, mal estar, perda de apetite
Dengue /dor dos musculos, dor no abdomen, mal estar, suor, tremor, perda de apetite
Faringite / dor de garganta, febre, dor de cabeça, ronquidão
Covid-19 / febre, tosse seca, cansaço, dor de cabeça, perda de paladar, dor de garganta

  
        System.out.print("Os sintomas desda doença são : ");
    
            for ( int i=0; i<n; i++) {
                System.out.printf("%do. Dengue = %szn", (i+1), Dengue[i]);
            }
        

*/

package arividade.ia;

import java.util.Scanner;

/**
 *
 * @author FATEC
 */
public class ArividadeIA {

 
    public static void main(String[] args) {
        
    String Dengue[] = {"dor dos musculos", "dor no abdomen", "mal estar", "suor", "tremor", "perda de apetite"};
    String Amigdalite [] = {"dor de garganta", "febre", "dor de cabeça"};
    String Pneumonia [] = {"febre", "dificuldade para respirar", "dor nas costas" ,"tosse"};
    String Gripe [] = {"tosse", "calafrios", "dor no corpo", "febre", "mal estar", "perda de apetite"};
    String Faringite [] = {"dor de garganta", "febre, dor de cabeça", "ronquidão"};
    String Covid [] = {"febre", "tosse seca", "cansaço", "dor de cabeça", "perda depaladar", "dor de garganta"};
    int n;  
    
   Scanner entrada = new Scanner(System.in);

  
  System.out.println("Doenças\n"
          + "1 - amigdalite\n"
          + "2 - pneumonia\n"
          + "3 - gripe\n"
          + "4 - dengue\n"
          + "5 - faringite\n"
          + "6 - covid\n");
  
  System.out.println("Escolha o Numero da doença");
  int numero = entrada.nextInt();
  
   switch (numero) {
     case 1:
       System.out.println("A doença escolhida foi amigdalite, os sintomas são:\n");
       n = Amigdalite.length; 
       
       for ( int i=0; i<n; i++) {
                System.out.printf("\n%do. - %szn", (i+1), Amigdalite[i]);
            }      
       
       break;
     case 2:
       System.out.println("A doença escolhida foi pneumonia, os sintomas são:\n");
       n = Pneumonia.length; 
       
       for ( int i=0; i<n; i++) {
                System.out.printf("\n%do. - %szn", (i+1), Pneumonia[i]);
            }
       break;
     case 3:
       System.out.println("A doença escolhida foi gripe, os sintomas são:\n");
       n = Gripe.length; 
       
       for ( int i=0; i<n; i++) {
                System.out.printf("\n%do. - %szn", (i+1), Gripe[i]);
            }
       
       break;
     case 4:
       System.out.println("A doença escolhida foi amigdalite, os sintomas são:\n");
       n = Dengue.length; 
       
       for ( int i=0; i<n; i++) {
                System.out.printf("\n%do. - %szn", (i+1), Dengue[i]);
            }
       break;
     case 5:
       System.out.println("A doença escolhida foi faringite, os sintomas são:\n");
       n = Faringite.length; 
       
       for ( int i=0; i<n; i++) {
                System.out.printf("\n%do. - %szn", (i+1), Faringite[i]);
            }
       
       break;
     case 6:
       System.out.println("A doença escolhida foi covid, os sintomas são:\n");
       n = Covid.length; 
       
       for ( int i=0; i<n; i++) {
                System.out.printf("\n%do. - %szn", (i+1), Covid[i]);
            }
       break;     
     default:
       System.out.println("O número escolhido é inválido!");
   }
 }
}

    
    
    
    
    
    
    
    
   
    
    

