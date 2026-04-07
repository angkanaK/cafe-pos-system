import java.util.ArrayList;
import java.util.Scanner;

public class CafeSystem {
    static ArrayList<Menu> allMenus = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static double total = 0;
    static int latteCount = 0;
    public static void main(String[] args) {
        
        int choice = 0;


        Menu m1 = new Menu("Latte", 50, "Drink" );
        allMenus.add(m1);
        Menu m2 = new Menu("Pizza", 129, "Food");
        allMenus.add(m2);
        
        allMenus.add(new Menu("Hamburger", 69, "Food"));

        System.out.println("--- Welcome to Booklyn Cafe ---");
        displayAllmenu();

        while (true) {
            System.out.println("Do you want: 1. Order| 2. Add Menu | 3. Exit");
            choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1){
                processOrder();
            }else if(choice == 2){
                addNewMenu();
            }else if(choice ==3){
                checkOut(total, latteCount);
                break;
            }
            
        
    }
        
    }
    
    public static void processOrder() {
        while (true) {
            System.out.println("พิมพ์เมนูที่ต้องการ (พิมพ์ OK เมื่อต้องการคิดเงิน)");
            String myOrder = sc.nextLine();

            if (myOrder.equalsIgnoreCase("OK")) {
                System.out.println("--- บันทึกรายการสั่งซื้อเรียบร้อย ---");
                break;
            }

            // ส่วนการค้นหาเมนู
            boolean found = false;
            for (Menu m : allMenus) {
                if (m.menu.equalsIgnoreCase(myOrder)) {
                    System.out.print("จำนวนที่ต้องการสั่ง: ");
                    int qty = sc.nextInt();
                    sc.nextLine();

                    System.out.println("เพิ่ม " + m.menu + " จำนวน: " + qty);

                    total += (m.price * qty);
                    if (m.menu.equalsIgnoreCase("Latte")) {
                        latteCount += qty;
                    }
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("❌ ไม่พบเมนูนี้ในระบบจ้ะ ลองดูเมนูอีกทีนะ");
            }
        }
    }
    public static void displayAllmenu() {
        System.out.println("\n--- รายการอาหารของทางร้าน ---");
        for(Menu m: allMenus){
            m.showInfo();
        }
    }
    public static void addNewMenu(){
        System.out.println("Add New Menu");
        System.out.println("Add Name Menu: ");
        String nameFood = sc.nextLine();
        System.out.println("Add Price Menu: ");
        int priceFood = sc.nextInt();
        sc.nextLine();
        System.out.println("Add Type Menu");
        String typeFood = sc.nextLine(); 

        allMenus.add(new Menu(nameFood, priceFood, typeFood));
        System.out.println("เพิ่มเมนู: "+nameFood+" สำเร็จ");
    }
    public static void checkOut(double total, int latteCount){
        double discount = 0;
        if(total >= 600){
            discount = total*0.10;
        }else if(total >= 300){
            discount = total*0.05;
        }
        double discountNet = total - discount ;
        if(latteCount >= 5){
            System.out.println("เนื่องจากคุณซื้อลาเต้ "+latteCount+"แก้ว เราแถมคุกกี้ 1 ชิ้น");
        }
        double vat = discountNet * 0.07;
        double netPrice = discountNet+vat;
        System.out.println("----------------------------");
        System.out.printf("Subtotal: %.2f THB%n", total);
        if (discount > 0) {
        System.out.printf("Discount: -%.2f THB%n", discount);
        }
        System.out.printf("vat: %.2f THB%n", vat);
        System.out.printf("Grand Total: %.2f THB%n", netPrice);
        System.out.println("----------------------------");}

}

