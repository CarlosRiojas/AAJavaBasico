public class Arrays {
    public static void main(String[] args) {
        String[] androidVer = new String[17];//se tiene que definir la amplitud del arreglo
        String days[]= new String[7];

        String cities[][] = new String[4][2];

        int[][][] numbers =  new int[2][2][2];
        int[][][][] numbers4 =  new int [2][2][2][2];

        androidVer[0]  = "Apple pie";
        androidVer[1] = "Banana bread";
        androidVer[2]= "Cupcake";
        androidVer[3]= "Donut";

        System.out.println(androidVer[0]);
        System.out.println(androidVer[1]);
        System.out.println(androidVer[2]);
        System.out.println(androidVer[3]);

        System.out.println();

        cities[0][0]="colombia";
        cities[0][1]="Medellin";
        cities[1][0]="Colombia";
        cities[1][1]="CDMX";

                String[][][][] animals= new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i < cities.length ; i++) { //ARRAY DE 2 DIMENSIONES
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);

            }
        }
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0 ; j++) {
                for (int k = 0; k <= 0 ; k++) {
                    for (int l = 0; l <= 1 ; l++) {
                        System.out.println(animals[i][j][k][l]);
                    }

                }

            }

        }


        for (String androidVersion:androidVer){
            System.out.println(androidVersion);
        }

        for(String[] pair: cities){
            for(String name:pair){

            }

        }
    }
}
