/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
    
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }


    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
    public static int Calcular_saldo (int base, int totalrecaudos, int totalretiros ){

        try {
            if (base != 2000000){
                return -1;
            }

            int saldotaquilla = base + totalrecaudos - totalretiros;

            return saldotaquilla;
        
        } catch (Exception e) {
        }
        return -1;


     }


    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
    public static String Calcular_tip (float consumo){

        try {
            if (consumo <= 0){
                return "Error calculando consumo";
            }

            float propina = consumo * 0.10f;
            float impuesto = consumo * 0.08f;
            final float valortotal = consumo + propina + impuesto;


            String resultado = String.format(
            "valor comida: $%.2f - valor propina $%.2f - valor impoconsumo $%.2f - total a pagar $%.2f", 
            consumo, propina, impuesto, valortotal);

            return resultado;


            
            
        } catch (Exception e) {
        }
        return "Error en la función Calcular_tip";

        
    }


    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */

    public static int Obtener_puntos(int Pganados, int Pperdidos, int Pempatados){
        try {

            if (Pganados <= 0 || Pperdidos <= 0 || Pempatados <= 0){
                return -1;
            }

            int Puntos_totales = Pganados * 3 + Pempatados * 1  +  Pperdidos * 0;

            return Puntos_totales;
            
        } catch (Exception e) {
        }
        return -1;
     }



    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */

         public static float Calcular_definitiva (float nota1, float nota2, float nota3, float nota4, float nota5,
     float porcentaje1, float porcentaje2, float porcentaje3, float porcentaje4, float porcentaje5){

        try {
            final byte  min = 0, max = 5;
            final float sumatotal = 1.0f;

            float Suma_porcentajes = porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5;
            float Definitiva = (nota1*porcentaje1) + (nota2*porcentaje2) + (nota3*porcentaje3) + (nota4*porcentaje4) + ( nota5*porcentaje5);

            if (Suma_porcentajes != sumatotal){
                throw new Exception();
            }

            if (nota1 <= min || nota1 >= max || nota2 <= min || nota2 >=max || nota3 <= min || nota3 >=max || nota4 <=min || nota4 >=max || nota5 <=min || nota5 >=5){
                throw new Exception();
            }

            return Definitiva;
        
            
        } catch (Exception e) {
        return -1;
        }
     }


    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
    

    
    


    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */


    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
     public static float Calcular_area_triangulo (float base, float altura){

        try {
            if (base <0 || altura <0 ){
                return -1;
            }

            float area = 0.5f * base *altura;
            return area;

            
        } catch (Exception e) {
        }
        return altura;
     }


    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_perimetro_cuadrado (float ladocadrado){

        try {
            if(ladocadrado <= 0 ){
                return -1;
            }
            float perimetro = ladocadrado*4;

            return perimetro;
           

            
        } catch (Exception e) {
            return -1;
        }
     }
    


    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
     public static float Calcular_volumen_cilindro(float Radiobase, float Alturacilindro){

        try {
            if (Radiobase <=0 || Alturacilindro <=0){
                return -1;
            }
            float pi = (float) 3.1415927;

            float volumen = (float) (pi* (Math.pow(Radiobase,2))* Alturacilindro);
            return volumen;

        } catch (Exception e) {
            return -1;
        }
     }


    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */

    public static float Calcular_area_circulo(float Radiocirculo){

        try {
            if(Radiocirculo <= 0 ){
                return -1;
            }

            float Pi= (float)3.1415927;
            float area = (float) (Pi*(Math.pow(Radiocirculo,2)));
            return area;
            
        } catch (Exception e) {
            return -1;
        }
     }




}
