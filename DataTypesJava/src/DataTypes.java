public class DataTypes {
    public static void main(String[] args) {
        int n = 1234567801;
        long nL = 12345678941254L;

        double nD = 123.465;
        float nF = 123.456F;//se ocupa esto

        var salary = 1000; //int
        //pension 3%
        var pension = salary * 0.03; //double
        var totalSalary = salary - pension;


        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Carlos Riojas";
        System.out.println("Employee:" + employeeName+ "SALARY: " + totalSalary);


    }
}
