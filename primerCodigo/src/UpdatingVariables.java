public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono $200
        salary += 200;
        System.out.println(salary);

        salary = salary +(30*2) -45;
        System.out.println(salary);

        //acualizamos cadenas de texto
        String employeeName = "Carlos Riojas";
        employeeName = employeeName + "de los Santos";
        System.out.println(employeeName);

    }
}
