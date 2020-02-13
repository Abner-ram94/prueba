public class PilaChar{
    private char pila [];
    private int tope;

    public PilaChar (int capacidad){ //Constructor
        pila = new char [capacidad];
        tope = -1;
    }

    public void push (char i){ //Ingresar Elementos

        if (tope +1 < pila.length){
            pila [++ tope] = i;

        }
    }

    public char pop (){ //Retirar elementos
        if (tope == -1) {
            return 0;
        }
        return pila [tope--];
    }

    public boolean isEmpty (){ //Sirve para conocer si la pila esta vacia
        if (tope== -1){
            return true;
        }
        return false;
    }


}