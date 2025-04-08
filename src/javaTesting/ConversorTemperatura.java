package javaTesting;

public class ConversorTemperatura {
    public static void main(String[] args) {
        // Declarar la variable para la temperatura en Celsius
        double celsius = 25.0;

        // Convertir de Celsius a Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Imprimir el valor convertido
        System.out.println("La temperatura en Fahrenheit es: " + fahrenheit);

        // Crear una variable entera para la temperatura en Fahrenheit sin decimales
        int fahrenheitEntero = (int) fahrenheit;

        // Imprimir el valor entero
        System.out.println("La temperatura en Fahrenheit sin decimales es: " + fahrenheitEntero);
    }
}