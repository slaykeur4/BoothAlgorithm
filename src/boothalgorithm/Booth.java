/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package boothalgorithm;

/**
 *
 * @author imad
 */
public class Booth {

    public Booth() {
    }
    
    
    public static String verify(int a) {

        int flag=0;

        do {
        if(a < 0) {
            a = a * -1;
            flag = 1;
        }
        if(127 < a)
            return("\nINVALID NUMBER.ENTER VALUE (-127 < A, B < 128)!");

        } while(127< a);

        if(flag==1)
        a = a *-1;
        return("true");
}
    
    public static void add(int a[],int b[]) {

        int x,i,c=0;

        for(i=7;i>=0;i--) {
            
            x=a[i];
            a[i]=c^x^b[i];

        if(((c==1)&&(x==1))||((x==1)&&(b[i]==1))||((b[i]==1)&&(c==1)))

            c = 1;

        else

            c = 0;
        }
    }
    
    public static void binary(int x,int arr[]) {

        int i,p=x;
        int[]c={0,0,0,0,0,0,0,1};

        for(i=0;i< 8;i++)
            arr[i] = 0;
        if(x < 0)

            x = x *-1;
            i = 7;

        do {

            arr[i]=x%2;
            x = x/2;
            i--;

        } while(x!=0);

        if(p< 0) {

            for(i=0;i< 8;i++)

                arr[i]=1-arr[i];
                add(arr,c);
        }
    }
    
    public static void rshift(int x,int y[]) {

        int i;

        for(i=7;i>0;i--)

            y[i] = y[i-1];

        y[0] = x;
    }
    
    
    
    
    
}