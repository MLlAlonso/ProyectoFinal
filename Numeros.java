import java.util.Scanner;

public class ImprimirNumeros{

    public int imprimirIntermedios(int numero01, int numero02){
        int mayor=0;
        int menor=0;

        /*Comprobación de numero mayor y menor*/
        if(numero01>numero02){
            mayor = numero01;
            menor = numero02;
        } else{
            mayor=numero02;
            menor=numero01;
        }

        /*Imprimir numeros que se encuentran dentro del rango de los 2 numeros ingresados */
        for (int i=menor+1; i<=mayor; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*Ingresar numeros*/
        System.out.println("Ingrese el primer número:");
        int numero01 = entrada.nextInt();
        System.out.println("Ingrese el segundo número:");
        int numero02 = entrada.nextInt();

        imprimirIntermedios(numero01, numero02);
    }
}


public class ImprimirNumerosTest{
    @test 
    public void obtenerNumeros(){
        int numero01=4;
        int numero02=8;

        int[] valorEsperado ={5,6,7}
        int[] valorActual = ImprimirNumeros.imprimirIntermedios(numero01, numero02);
        assertArrayEquals(valorEsperado, valorActual);
    }
}