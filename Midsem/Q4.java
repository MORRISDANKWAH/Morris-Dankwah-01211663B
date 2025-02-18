public class Employee {
    private String empName;
    private int empId;
    private String address;
    private String mailId;
    private String mobileNo;
    protected double basicPay;

    public Employee(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.basicPay = basicPay;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpId() {
        return empId;
    }

    public String getAddress() {
        return address;
    }

    public String getMailId() {
        return mailId;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public double getBasicPay() {
        return basicPay;
    }

     
    public void setBasicPay(double basicPay) {
       this.basicPay = basicPay;
   }
   
    @Override
    public String toString() {
    return "Name: " + this.empName + "\nID: " + this.empId + "\nAddress: " + this.address +
              "\nEmail: " + this.mailId + "\nMobile: " + this.mobileNo + "\nBasic Pay: " + this.basicPay;
    }

    public double calculateGrossSalary()
    {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        return basicPay + da + hra;
    }

    public double calculateNetSalary()
    {
         double pf = 0.12 * basicPay;
         double staffClubFund = 0.001 * basicPay;
         return calculateGrossSalary() - pf - staffClubFund;
    }
    
    public String generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;

        double grossSalary = calculateGrossSalary();
        double netSalary = calculateNetSalary();
        
        String payslip = "---------- PAY SLIP ----------\n";
        payslip += this.toString() + "\n\n";
        payslip += "Basic Pay: " + String.format("%.2f", basicPay) + "\n";
        payslip += "DA: " + String.format("%.2f", da) + "\n";
        payslip += "HRA: " + String.format("%.2f", hra) + "\n";
        payslip += "PF: " + String.format("%.2f", pf) + "\n";
        payslip += "Staff Club Fund: " + String.format("%.2f", staffClubFund) + "\n";
                payslip += "-------------------------------\n";
        payslip += "Gross Salary: " + String.format("%.2f", grossSalary) + "\n";
        payslip += "Net Salary: " + String.format("%.2f", netSalary) + "\n";
        payslip += "-------------------------------\n";
        return payslip;
    }
}

class Programmer extends Employee {
    public Programmer(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssistantProfessor extends Employee {
    public AssistantProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssociateProfessor extends Employee {
    public AssociateProfessor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class Professor extends Employee {
    public Professor(String empName, int empId, String address, String mailId, String mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

public class Main {
    public static void main(String[] args) {
       
        Programmer programmer = new Programmer("John Doe", 101, "123 Main St", "john.doe@example.com", "555-1234", 60000);
        AssistantProfessor assistantProfessor = new AssistantProfessor("Jane Smith", 201, "456 Oak Ave", "jane.smith@example.com", "555-5678", 80000);
        AssociateProfessor associateProfessor = new AssociateProfessor("Peter Jones", 301, "789 Pine Ln", "peter.jones@example.com", "555-9012", 100000);
        Professor professor = new Professor("Dr. Alice Brown", 401, "101 Maple Dr", "alice.brown@example.com", "555-3456", 120000);

        
        System.out.println(programmer.generatePaySlip());
        System.out.println(assistantProfessor.generatePaySlip());
        System.out.println(associateProfessor.generatePaySlip());
        System.out.println(professor.generatePaySlip());
    }
}
