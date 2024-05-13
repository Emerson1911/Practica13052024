import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) throws Exception {
       Scanner teclado = new Scanner(System.in);
       short num ;
       short par = 0;
       short impar = 0;

       for (int i = 0; i < 6; i++){

        System.out.print("Ingresa el numero");
        num = teclado.nextShort();

        if (num%2 == 0){
            System.out.print("El numero es par " + num + " ");
            i++;
            par++;
        }
    }

}
}
