package pooguiaej9;

import Entidad.Matematica;
import Service.MatematicaService;

/**
 *
 * @author nataliaba
 */
public class POOGuiaEj9 {

    public static void main(String[] args) {

        MatematicaService mateS = new MatematicaService();

        Matematica mate1 = mateS.crearMate();
        System.out.println(" ");
        System.out.println("-------------------- ");
        System.out.println(" ");

        System.out.println("El numero " + mateS.devolverMayor(mate1)
        + "\n es menor que el numero " + mateS.devolverMenor(mate1));
        System.out.println(" ");
        System.out.println("-------------------- ");
        System.out.println(" ");

        System.out.println("El numero mayor elevado al numero menor da: " + mateS.calcularPotencia(mate1));
        System.out.println(" ");
        System.out.println("-------------------- ");
        System.out.println(" ");
        
        System.out.println("La raíz cuadrada del numero menor da: " + mateS.calculaRaiz(mate1));
         System.out.println(" ");
        System.out.println("-------------------- ");
        System.out.println(" ");
    }

}
