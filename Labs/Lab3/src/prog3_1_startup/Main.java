package prog3_1_startup;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Soueilem","Mohamed Lemine",300,1995,12,12);
        Account account = new Account(employee,AccountType.CHECKING);
        account.setBalance(300);
        System.out.println(employee);
        System.out.println(account);
        employee.raiseSalary(200);
        System.out.println(employee);
        account.makeDeposit(1000);
        account.setAcctType(AccountType.SAVINGS);
        System.out.println(account);
        account.makeWithdrawal(200);
        account.setAcctType(AccountType.RETIREMENT);
        System.out.println(account);
    }
}