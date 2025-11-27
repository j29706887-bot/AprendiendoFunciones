package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }


    //FABRICA DE FUNCIONES 🛞


    public static int calcularFactorial(int numero) {
        if (numero < 0) {
            return -1;
        }
        int resultado = 1;
        for (int contador = 1; contador <= numero; contador++) {
            resultado = resultado * contador;
        }
        return resultado;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }
        for (int divisor = 3; divisor * divisor <= numero; divisor += 2) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    public static String invertirTexto(String texto) {
        String invertido = "";
        for (int indice = texto.length() - 1; indice >= 0; indice--) {
            invertido = invertido + texto.charAt(indice);
        }
        return invertido;
    }

    public static int obtenerSegundoMayor(int[] numeros) {
        if (numeros == null || numeros.length < 2) {
            return Integer.MIN_VALUE;
        }
        int mayor = Integer.MIN_VALUE;
        int segundoMayor = Integer.MIN_VALUE;
        for (int indice = 0; indice < numeros.length; indice++) {
            int valor = numeros[indice];
            if (valor > mayor) {
                segundoMayor = mayor;
                mayor = valor;
            } else if (valor > segundoMayor && valor != mayor) {
                segundoMayor = valor;
            }
        }
        return segundoMayor;
    }

    public static boolean validarContrasena(String contrasena) {
        if (contrasena == null) {
            return false;
        }
        if (contrasena.length() < 8) {
            return false;
        }
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;
        for (int indice = 0; indice < contrasena.length(); indice++) {
            char caracter = contrasena.charAt(indice);
            if (Character.isUpperCase(caracter)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(caracter)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(caracter)) {
                tieneDigito = true;
            }
        }
        return tieneMayuscula && tieneMinuscula && tieneDigito;
    }

    public static String formatearNombreCompleto(String nombres, String apellidos) {
        if (nombres == null) {
            nombres = "";
        }
        if (apellidos == null) {
            apellidos = "";
        }
        String nombreLimpio = nombres.trim();
        String apellidoLimpio = apellidos.trim();
        String completo = nombreLimpio + " " + apellidoLimpio;
        return completo.toUpperCase();
    }

    public static int contarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }
        String textoLimpio = texto.trim();
        String[] partes = textoLimpio.split("\\s+");
        return partes.length;
    }

    public static boolean esPalindromo(String texto) {
        if (texto == null) {
            return false;
        }
        String limpio = texto.toLowerCase().replace(" ", "");
        int izquierda = 0;
        int derecha = limpio.length() - 1;
        while (izquierda < derecha) {
            if (limpio.charAt(izquierda) != limpio.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }

    public static void ordenarBurbuja(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return;
        }
        boolean huboIntercambio = true;
        int limite = numeros.length - 1;
        while (huboIntercambio) {
            huboIntercambio = false;
            for (int indice = 0; indice < limite; indice++) {
                if (numeros[indice] > numeros[indice + 1]) {
                    int temporal = numeros[indice];
                    numeros[indice] = numeros[indice + 1];
                    numeros[indice + 1] = temporal;
                    huboIntercambio = true;
                }
            }
            limite--;
        }
    }


    // 1. Crear una función estática que reciba un arreglo de enteros llamado notas
//    y retorne un int con el promedio de las notas (promedio entero redondeado hacia abajo).

// 2. Crear una función estática que reciba un arreglo de enteros llamado numeros
//    y un int limite, y retorne cuántos elementos del arreglo son estrictamente mayores que limite.

// 3. Crear una función estática que reciba un arreglo de String llamado palabras
//    y un String palabraBuscada, y retorne true si la palabra existe en el arreglo
//    ignorando mayúsculas y minúsculas, de lo contrario retorne false.

// 4. Crear una función estática que reciba dos String: nombres y apellidos,
//    quite espacios sobrantes y retorne un String con el nombre completo donde
//    cada palabra inicia en mayúscula y el resto en minúscula.

// 5. Crear una función estática sin parámetros que imprima en consola un menú de opciones
//    con al menos tres opciones (por ejemplo: 1. Registrar, 2. Listar, 3. Salir).

// 6. Crear una función estática que reciba un String llamado texto
//    y retorne un int con la cantidad de caracteres numéricos (0–9) que aparecen en ese texto.

// 7. Crear una función estática que reciba un String llamado cedula
//    y un int longitudEsperada, y retorne true si la cédula tiene exactamente esa longitud
//    y todos sus caracteres son dígitos, de lo contrario retorne false.

// 8. Crear una función estática que reciba un arreglo de enteros llamado numeros
//    y un int objetivo, y retorne el número del arreglo cuya diferencia absoluta con
//    objetivo sea la más pequeña. Si el arreglo está vacío, retornar Integer.MIN_VALUE.

// 9. Crear una función estática que reciba un int hora (entre 0 y 23) y un String nombre,
//    y retorne un saludo dependiendo de la hora:
//    0–11: "Buenos días", 12–17: "Buenas tardes", 18–23: "Buenas noches",
//    seguido del nombre (por ejemplo: "Buenos días Juan").

// 10. Crear una función estática que reciba dos String: texto1 y texto2,
//     y retorne true si son anagramas entre sí (tienen las mismas letras con la misma cantidad),
//     ignorando espacios y mayúsculas/minúsculas; de lo contrario retorne false.


}