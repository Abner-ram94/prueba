import java.util.Scanner;

public class Principal{
    public static void main (String []args){

        //Objetos
        Scanner scanner = new Scanner (System.in);
        Ordenar ordenar = new Ordenar ();

        //Variables
        char elementos;
        char inElements[] = new char [10];


        System.out.println("Ingrese elementos: ");
        for (int i=0; i <10; i++){

            elementos = scanner.next().charAt(0);
            ordenar.setElementos (elementos);
            ordenar.llenarPila1();
            inElements[i] = elementos; 
        }

        printInElements (inElements);

        ordenar.ordenarElementos();
        ordenar.vaciarPila2();

    }

    public static void printInElements(char inElements[]){

        System.out.println("ELEMENTOS DE LA PILA 1: ");
        for (int i =0; i< 10; i++){
            System.out.println ("Posicion" + (i+1) + "="+ inElements[i]);
        }

    }
}