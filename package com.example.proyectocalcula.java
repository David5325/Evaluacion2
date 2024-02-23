package com.example.proyectocalculadora;public class recursivo {
    
    import java.util.Scanner;

    public class DivisorRecursivo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

       
            System.out.print("Ingrese un número para dividir: ");
            int numero = scanner.nextInt();


            if (numero <= 0) {
                System.out.println("Ingrese un número mayor que 0.");
            } else {
   
                dividirNumeroRecursivo(numero);
            }

            scanner.close();
        }

    
        private static void dividirNumeroRecursivo(int numero) {
            if (numero > 1) {
                System.out.println(numero);
                dividirNumeroRecursivo(numero / 2);
            } else {
                System.out.println("Llegó a 1.");
            }
        }
    }

}


