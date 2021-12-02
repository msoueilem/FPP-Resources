import java.time.LocalDate;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        double s = 0;
        Professor p1 = new Professor("jim",2000, LocalDate.of(1995,12,12),10);
        Professor p2 = new Professor("anne",5000, LocalDate.of(2000,11,02),10);
        Professor p3 = new Professor("marie",12000, LocalDate.of(2012,01,05),10);
        Secretary s1 = new Secretary("walter",8000, LocalDate.of(1990,03,04),200);
        Secretary s2 = new Secretary("albert",23000, LocalDate.of(2009,05,02),200);

        DeptEmployee[] department = new DeptEmployee[5];
        department[0] = p1;
        department[1] = p2;
        department[2] = p3;
        department[3] = s1;
        department[4] = s2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Do you wish to see the sum of salary (y/n): ");
        String answer = sc.nextLine();
        if (answer.equals("y")){

                for (DeptEmployee d :
                        department) {
                    s +=d.computeSalary();
                }
        }
        System.out.print("The sum of salary : "+s);
    }
}
