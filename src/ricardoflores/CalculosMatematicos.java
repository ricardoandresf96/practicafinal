package ricardoflores;

import java.util.ArrayList;

public class CalculosMatematicos {

    public CalculosMatematicos() {
    }

    public void calculosRefactorizados(int numero) {
        ArrayList<Integer> factorialesPrimos = obtenerFactorialesPrimos(numero);
        System.out.println("Los factoriales primos del número introducido son: " + factorialesPrimos);

        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " SI es primo");
        } else {
            System.out.println("El número " + numero + " NO es primo");
        }
    }

    private ArrayList<Integer> obtenerFactorialesPrimos(int numero) {
        ArrayList<Integer> miArray = new ArrayList();
        miArray.add(1);

        for (int i = 2; i < numero; i++) {
            if (esPrimo(i) && numero % i == 0) {
                miArray.add(i);
            }
        }
        return miArray;
    }

    private boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
