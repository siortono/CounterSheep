/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countersheep;

/**
 *
 * @author Mattia
 */
public class CounterSheep {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) {
     
    Boolean[] arraySheeps = { true, true, false, false, true, true, false, false, true, true, true, false};
    int sheep = 0;
    
    for(int i = 0; i < arraySheeps.length; i++){
      
      if(arraySheeps[i] != null && arraySheeps[i] == true)
        sheep++;
     
      }
   
    return sheep;
  }
  }

