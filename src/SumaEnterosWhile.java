public class SumaEnterosWhile {

    public static void main(String[] args) {

    int suma = 0;
    int i = 1;

    while (i <= 10){
        suma += i;
        i++;
    }
    System.out.println("El resultado de la suma de los numeros enteros del uno al diez es: "+suma+
            "\nPara esto se usó el ciclo while");
    }
}