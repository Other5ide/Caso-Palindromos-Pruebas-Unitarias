# Caso-Palindromos-Pruebas-Unitarias

## **Paso 1**
```
function esPalindromo(cadena) {

let resultado = "";

resultado = cadena.split('').reverse().join('');

return cadena === resultado;

}
```
El metodo recibe de entrada una cadena "string", la divide en caracteres independientes, la reversa y la vuelce a unir. Luego compara esta cadena invertida con la original y devuelve un booleano. Basicamente identifica si un string es un palindromo.
Para usar esta funcion simplemente hay que ingresar en su entrada un argumento de tipo string. Ej: esPalindromo("radar") -> retorna true

## **Paso 2**

La función recibe un parámetro cadena, crea una variable vacía para almacenar la versión invertida de la cadena, convierte la cadena en un arreglo de caracteres individuales, invierte el orden del arreglo, une los caracteres invertidos en una nueva cadena,compara la cadena original con la invertida y finalmente retorna True si son iguales o de lo contrario retorna False.

Versión Java:

    public boolean isPalindrome(String cadena) {
        String cadenaInvertida = "";

        char[] caracteres = cadena.toCharArray();

        for (int i = caracteres.length - 1; i >= 0; i--) {
            cadenaInvertida += caracteres[i];
        }

        return cadena.equals(cadenaInvertida);
    }

## **Paso 3**

Para poder probar la correcta funcionalidad del código, habría que ingresar distintas cadenas, ya sean palabras normales, palabras palíndromas, números, frases, símbolos, etc. Por lo cual, usando jUnit se pueden aplicar 5 pruebas unitarias para comprobar como funciona el código. En este caso las pruebas son:

1. "hola mundo!" -> False
2. "123454321" -> True
3. "         " -> True
4. "Pan . am **aN !a...p" -> False
5. "&%%&%%$%%&%&%" -> False

Para los casos propuestos ocurre lo siguiente:

1. "aca" -> True
2. "acas" -> False
3. "h" -> True

## **Paso 4**

Según los resultados de las pruebas unitarias anterories, concluimos que el método actual si detecta cadenas palíndromas, pero, las cadenas al tener espacios, símbolos, tildes, entardas numéricas, entre otras cosas, ya no las detecta como palíndromas.

Por lo tanto, las mejoras serían que dentro de las cadenas, se pudiesen eliminar los espacios y los símbolos para que el método solo analice los caracteres númericos y alfabéticos.
