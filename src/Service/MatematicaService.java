package Service;

import Entidad.Matematica;

public class MatematicaService {

    // Creo un objeto 
    public Matematica crearMate() {

        Matematica mate1 = new Matematica();

        // Lleno los atributos:
        mate1.setNum1(Math.random() * 10);
        mate1.setNum2(Math.random() * 20);

        System.out.println("Numero 1: " + mate1.getNum1());
        System.out.println("Numero 2: " + mate1.getNum2());

        return mate1;

    }

    // metodos
    public double devolverMayor(Matematica mate1) {

        if (mate1.getNum1() > mate1.getNum2()) {
//            System.out.println("El numero " + mate1.getNum1() + " es mayor que el numero " + mate1.getNum2());
            return mate1.getNum1();
        } else {
//            System.out.println("El numero " + mate1.getNum2() + " es mayor que el numero " + mate1.getNum1());
            return mate1.getNum2();
        }

    }

    public double devolverMenor(Matematica mate1) {

        if (mate1.getNum1() < mate1.getNum2()) {
//            System.out.println("El numero " + mate1.getNum1() + " es menor que el numero " + mate1.getNum2());
            return mate1.getNum2();
        } else {
//            System.out.println("El numero " + mate1.getNum2() + " es menor que el numero " + mate1.getNum1());
            return mate1.getNum1();
        }

    }

    public double calcularPotencia(Matematica mate1) {

        int mayor = (int) Math.round(devolverMayor(mate1));
        int menor = (int) Math.round(devolverMenor(mate1));

        return (double) Math.pow(Math.round(mayor), Math.round(menor));

    }

    public int calculaRaiz(Matematica mate1) {

        // obtener valor absoluto
        
        int absoluto = (int) Math.abs(devolverMenor(mate1));
        
        return (int) Math.sqrt(absoluto);
    }

}

//Deberá además implementar los siguientes métodos:
//a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
//b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores.
//c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
