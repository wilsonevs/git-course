
public class Main {
    public static void main(String[] args) {
        
        String nombre=  "Wilson Valencia";
        System.out.printf("Hclsola %s%n",nombre);

        suma(5,5);

    }

    public static void suma(Integer numUno, Integer numDos){
        System.out.printf("%s + %s = %s%n", numUno, numDos, (numUno+numDos));
    }
}