
package calculadorabasicav2;


public class Restar extends Operaciones{
    @Override
    public void Operacion(){
        CantidadValores();
        int Vec[] = new int[c_numeros];
        for (int i = 0; i < c_numeros; i++) {
            System.out.print(""+(i+1)+". Ingrese un numero: ");
            Vec[i] = in.nextInt();
            acumulador = acumulador - Vec[i];
        }
        System.out.println("El resultado de la resta es: " + acumulador);
        System.out.println("-------------------------------------------");
    }
    
}
