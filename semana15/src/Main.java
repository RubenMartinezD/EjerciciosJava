import java.util.Scanner;

public class Main {
    public static String Ejercicio1() {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce la primera variable para ser calculada");
        int variableA = escaner.nextInt();
        System.out.println("Introduce la segunda variable para ser calculada");
        int variableB = escaner.nextInt();
        int suma = variableA + variableB;
        int resta = variableA - variableB;
        int multiplicar = variableA * variableB;
        float division = variableA / variableB;
        System.out.println("La suma de ambos valores es " + suma + "\n La resta del primer valor con el segundo es " + resta + "\n La multiplicación de ambos valores da " + multiplicar + "\n La división del primero con el segundo da " + division);
        return ("cosas");
    }

    public static String Ejercicio2() {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce la primera variable para ser calculada");
        int variableA = escaner.nextInt();
        System.out.println("Introduce la segunda variable para ser calculada");
        int variableB = escaner.nextInt();
        if (variableA > variableB) {
            System.out.println("Parece ser que " + variableA + " es mayor que " + variableB);
        } else if (variableA < variableB) {
            System.out.println("Parece ser que " + variableB + " es mayor que " + variableA);
        } else if (variableA == variableB) {
            System.out.println("Parece ser que ambas variables son iguales");
        }
        return ("cosas");
    }

    public static String Ejercicio3() {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce las tres variables para ser ordenadas");
        int variableA = escaner.nextInt();
        int variableB = escaner.nextInt();
        int variableC = escaner.nextInt();
        if (variableA > variableB) {
            if (variableA > variableC) {
                if (variableB > variableC) {
                    System.out.println("El orden de mayor a menor de los números es " + variableA + variableB + variableC);
                } else {
                    System.out.println("El orden de mayor a menor de los números es " + variableA + variableC + variableB);
                }
            } else {
                System.out.println("El orden de mayor a menor de los números es " + variableC + variableA + variableB);
            }
        } else if (variableB > variableC) {
            if (variableA > variableC) {
                System.out.println("El orden de mayor a menor de los números es " + variableB + variableA + variableC);
            } else {
                System.out.println("El orden de mayor a menor de los números es " + variableB + variableC + variableA);
            }
        } else {
            System.out.println("El orden de mayor a menor de los números es " + variableC + variableB + variableA);
        }
        return ("cosas");
    }

    public static int Ejercicio4() {
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce las dos variables a ser sumadas");
        int acumulacion = 0;
        int variableA = escaner.nextInt();
        int variableB = escaner.nextInt();
        System.out.println("Introduce el número de veces que se sumará el segundo dígito");
        int variableC = escaner.nextInt();

        for (int i = 0; i < variableC; i++) {
            acumulacion = acumulacion + variableB;
        }
        int resultado = acumulacion + variableA;
        System.out.println("El número final que resulta de sumarle a la primera variable (" + variableA + ") el valor de " + variableB + " en un bucle " + variableC + " veces es de " + acumulacion);
        return acumulacion;
    }

    public static String Ejercicio5() {
        int indexM = 0;
        String fraseM = "";
        int indexB = 0;
        String fraseB = "";
        int indexY = 0;
        String fraseY = "";
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce tu frase y te digo el orden que encuentre su primer caracter: m, b o y");
        String frase = escaner.nextLine();
        if (frase.contains("m")){
            indexM = frase.indexOf('m');
            fraseM = "\nSe encontró una m en la posición " + indexM;
        }
        if (frase.contains("b")){
            indexB = frase.indexOf('b');
            fraseB = "\nSe encontró una b en la posición " + indexB;

        }
        if (frase.contains("y")){
            indexY = frase.indexOf('y');
            fraseY = "\nSe encontró una y en la posición " + indexY;

        }
        if (indexM < indexB) {
            if (indexM < indexY) {
                if (indexB < indexY) {
                    System.out.println( fraseM + fraseB + fraseY);
                } else {
                    System.out.println(fraseM + fraseY + fraseB);
                }
            } else {
                System.out.println(fraseY + fraseM + fraseB);
            }
        } else if (indexB < indexY) {
            if (indexM < indexY) {
                System.out.println(fraseB + fraseM + fraseY);
            } else {
                System.out.println(fraseB + fraseY + fraseM);
            }
        } else {
            System.out.println(fraseY + fraseB + fraseM);
        }
        return ("cosas");
    }
    public static void main(String[] args) {
        //   Ejercicio1();
        //   Ejercicio2();
        //   Ejercicio3();
        //   Ejercicio4();
        Ejercicio5();
    }
}

