/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interprete;

/**
 *
 * @author Sanch
 */
public enum Tipo_Token {
    // Crear un tipoToken por palabra reservada
    // Crear un tipoToken: identificador, una cadena y numero
    // Crear un tipoToken por cada "Signo del lenguaje" (ver clase Scanner)


    // Palabras clave:

   Y, 
   CLASE, 
   ADEMAS,
   PARA, 
   FUNCION,
   SI, 
   NULO,
   IMPRIMIR,
   DEVOLVER,
   SUPER,
   ESTE,
   VERDADERO,
   FALSO, 
   MIENTRAS,
   VARIABLE,
   O,  
   
   NO,
   IGUAL,
   DIFERENTE_DE,
   ASIGNAR,
   MENOR,
   MENOR_IGUAL, 
   MAYOR,
   MAYOR_IGUAL, 
   NUMERO, 
   CADENA,
   LOGICO,
   IDENTIFICADOR,
   
   
   SUMA,
   RESTA,
   MULTIPLICACION,
   DIVISION,
   MAS_IGUAL,
   MENOS_IGUAL,
   POR_IGUAL,
   DIV_IGUAL,
  
   PARENTESIS_IZQ,
   PARENTESIS_DER,
   CORCHETE_IZQ, 
   CORCHETE_DER, 
   COMA, 
   PUNTO,
   PUNTO_Y_COMA,
   LLAVE_DER,
   LLAVE_IZQ,
    // Final de cadena
    EOF
}
