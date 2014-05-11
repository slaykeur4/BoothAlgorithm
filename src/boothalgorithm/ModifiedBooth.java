/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boothalgorithm;

/**
 *
 * @author imad
 */
public class ModifiedBooth extends Booth {
    
    public static void rshift(int x, int z, int y[]) {

        int i;

        for(i=7;i>1;i--)

            y[i] = y[i-2];

        y[0] = x;
        y[1] = z;
    }
    
    
}
