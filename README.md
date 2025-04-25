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


