public class ifStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnabled = true;
        int fileSended= 3;

        if (isBluetoothEnabled){
            fileSended++;
            System.out.println("Archivo Enviado");
            int i = 0;
            i++;
        }else{
            System.out.println("Porfavor enciende tu bluetooth para iniciar la transferencia");
        }



        System.out.println(isBluetoothEnabled);
        System.out.println(fileSended);

    }
}
