// QUE SI SE HACEN LOS CAMBIOS
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author redes
 */
public class Factorial {

    private static int fact(int x) {
        return (x == 0) ? 1 : x * fact(x - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean sabeProgramar = false;
        if (!sabeProgramar) {
            System.out.println("Josemi no sabe programar");
        }
    }

}
