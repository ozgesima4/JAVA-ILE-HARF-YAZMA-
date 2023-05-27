
package patikaa;

public class Patikaa {

    public static void main(String[] args) {
        String array [][]=new String[7][5];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                if(i==0 || j==0){
                    array[i][j]=" * ";
                }else if(i==3 || j==4 || i==6){
                    array[i][j]=" * ";
                }else{
                    array[i][j]="   ";
                }
            }
            
        }
        
        
        for (String[] strings : array) {
            
            for (String string : strings) {
                System.out.print(string);
            }
            System.out.println();
        }
        
    }
    
}
