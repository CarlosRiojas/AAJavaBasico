public class Funciones {
    public static void main(String[] args) {

        double y = 3;

        double area = circleArea(y);
        System.out.println(area);

        System.out.println(4 * Math.PI * Math.pow(y,2));

        System.out.println((4/3)* Math.PI * Math.pow(y,3));

        System.out.println("Pesos a dolar" + converToDolar(200,"MXN"));


    }

    /*
        Creamos funciones
     */
    /**
     * Descripcion: convierte dos monedas a dolares.
     * @param r inserta el valor del area del ciruculo.

     * @return quantity Devuelve la cantidad actalizada en dolares
     */
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }

    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    public static double sphereVolume(double r){
        return (4/3)* Math.PI * Math.pow(r,3);
    }

    /**
     * Descripcion: convierte dos monedas a dolares.
     * @param quantity Cantidad de dinero
     * @param currency Tipo de monedo: solo esta validado para pesos mexicanos o pesos colombianos
     * @return quantity Devuelve la cantidad actalizada en dolares
     */

    public static double converToDolar(double quantity, String currency){
        //MXN
        switch(currency){
            case "MXN":
                quantity = quantity *0.052;
                break;
            case "COP":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }


}
