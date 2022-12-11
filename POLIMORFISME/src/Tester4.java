public class Tester4{
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        ow.pay(eBill);//pay for elecctricity bill
        System.out.println("-----------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp);//pay for permanent employe
        System.out.println("------------------------------------");

        
        ow.showMyEmployee(pEmp);//show permanent employee info
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        System.out.println("-------------------------------------");
        ow.showMyEmployee(iEmp);// show insternship employee info
        
    }
}