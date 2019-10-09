package calculadorabasicav2;

import java.util.Scanner;

public abstract class Operaciones {

    Scanner in = new Scanner(System.in);
    protected int c_numeros;//cantidad de numeros a operar
    protected double acumulador = 0;//guarda el resultado de las operaciones

    public void CantidadValores() {
        System.out.print("Ingrese la cantidad de numeros a operar: ");
        c_numeros = in.nextInt();
        

    }

    public abstract void Operacion();
}
