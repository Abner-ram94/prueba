public class Ordenar{

    //Atributos:

    private PilaChar pila1;
    private PilaChar pila2;
    private PilaChar pila3;

    private String elementos;
    private String elemento1;
    private String elemento2;

    public Ordenar () { //Constructor

        pila1 = new PilaChar();
        pila2 = new PilaChar();
        pila3 = new PilaChar();

    }

    //Metodos:
    public void ordenarElementos (){
        do{
            elemento1 = pila1.pop();
            pila2.push (elemento1);

            while (!pila1.isEmpty()){

                elemento2 = pila1.pop();

                if (elemento2 < elemento1){

                    pila2.pop ();
                    pila3.push (elemento1);
                    pila2.push (elemento2);
                    elemento1 = elemento2;
                }
                else{
                    pila3.push(elemento2);
                }
            }

            while (!pila3.isEmpty()){

                elemento1 = pila3.pop ();
                pila2.push (elemento1);

                while (!pila3.isEmpty()){
                    elemento2 =pila3.pop();

                    if (elemento2 < elemento1){
                        pila2.pop();
                        pila1.push (elemento1);
                        pila2.push (elemento2);
                        elemento1 = elemento2;

                    }
                    else{
                        pila1.push (elemento2);
                    }
                }
            }
        }while (!pila1.isEmpty() || !pila3.isEmpty());
    } 

    public void setElementos(String elementos){
        this.elementos = elementos;
    }
    public void llenarPila1(){

        pila1.push (elementos);

    }
    public void vaciarPila2 (){

        int contador = 10;

        System.out.println("ELEMENTOS ORDENADOS DE LA PILA 2: ");
        while (!pila2.isEmpty()){

            System.out.println("Posicion "+ contador +"= " +pila2.pop());
            contador--;
        }
    }
}