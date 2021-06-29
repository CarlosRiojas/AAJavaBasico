public class WhileLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {

        turnOnOffLight();
        int i = 1;

       while(isTurnOnLight && 1<=10){
           printSOS();
           i++;
       }




    }//aqui se acaba main


    public static void printSOS(){
        System.out.println("...___...");
    }

    public static boolean turnOnOffLight(){

        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
