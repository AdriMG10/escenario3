public class practica2 {
    
    /**
     * <p>Esta clase dado un número entero aleatorio entre 1 y 100 muestra por pantalla si el número es primo o no.</p>
     * 
     * @author Adri
     * @version 1.0 
     * @param args main  
     * 
     */
    public static void main(String[] args) {
    
    final int MAX = 100;                                                    //Declaro constante entera para almacenar el valor máximo aleatorio que quiero
    final int MIN = 1;                                                      //Declaro constante entera para almacenar el valor mínimo aleatorio que quiero
    boolean esprimo = true;                                                 //Declaro un booleano con valor igual a verdadero

    int randomNumber = (int)(Math.random()*(MAX - MIN + 1) + MIN);          //Genero un número entero random entre 1 y 100

    if (randomNumber == 1)                                                  //Si el número random es 1 el booleano (esprimo) es falso
        esprimo = false;

    for (int x = 2; x < randomNumber/2; x++) {                              //Bucle for desde el 2 hasta la mitad del número random
        if (randomNumber % x == 0) {                                        //Comprueba si número random es divisible entre los parámetros del bucle for
            esprimo = false;                                                //Si el número random es divisible, el booleano (esprimo) es falso
            break;                                                          //Y sale del bucle
        }
    }

    if (esprimo == false)                                                   //Si esprimo es falso:
        System.out.println(randomNumber + " no es un número primo");        //Imprime por pantalla que el número random no es primo
    else                                                                    //Si no:
        System.out.println(randomNumber + " es un número primo");           //Imprime por pantalla que el número random es primo
    }       
}
