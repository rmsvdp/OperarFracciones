package Basics;
/**
 * Clase para maneja fracciones.
 * @author RMS
 *
 */
public class Fraccion {

    private int num;	// Atributo para el numerador
    private int den;	// Atributo para el denominador
 
    
    /**
     * Constructor por defecto, que inicializa el objeto con el
     * valor 1
     */
    public Fraccion() {
    num=0;
    den=1;
 }
 
    /**
     * Constructor para instanciar una fracción a partir de dos valores
     * @param x Numerador de la fracción
     * @param y Denominador de la fracción
     */
    public Fraccion(int x, int y) {
    num=x;
    den=y;
 }
 /**
  * Función para sumar dos fracción
  * @param a Primera fracción
  * @param b Segunda fracción
  * @return Fracción resultado de la operación
  */
    public static Fraccion sumar(Fraccion a, Fraccion b){
    Fraccion c=new Fraccion();
    c.num=a.num*b.den+b.num*a.den;
    c.den=a.den*b.den;
    return c;
 }
    /**
     * Función para restar dos fracciones
     * @param a Primera fracción
     * @param b Segunda fracción
     * @return Fracción resultado de la operación
     */
    
    public static Fraccion restar(Fraccion a, Fraccion b){
    Fraccion c=new Fraccion();
    c.num=a.num*b.den-b.num*a.den;
    c.den=a.den*b.den;
    return c;
 }


    public static Fraccion multiplicar(Fraccion a, Fraccion b){
    return new Fraccion(a.num*b.num, a.den*b.den);
 }
 
    public static Fraccion inversa(Fraccion a){
    return new Fraccion(a.den, a.num);
 }
 
    public static Fraccion dividir(Fraccion a, Fraccion b){
    return multiplicar(a, inversa(b));
 }

 
    private int mcd(){
    int u=Math.abs(num);
    int v=Math.abs(den);
    if(v==0){
         return u;
    }
    int r;
    while(v!=0){
         r=u%v;
         u=v;
         v=r;
    }
    return u;
 }

 
    public Fraccion simplificar(){
    int dividir=mcd();
    num/=dividir;
    den/=dividir;
    return this;
 }

 /**
  * Método que sobrecarga toString para poder imprimir mediante
  * println un objeto de tipo String
  */
    public String toString(){
    String texto=num+" / "+den;
    return texto;
 }
	
	
	
	
}
