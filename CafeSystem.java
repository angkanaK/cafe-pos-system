import java.util.ArrayList;
import java.util.Scanner;

public class CafeSystem {
    public static void main(String[] args) {
        ArrayList<Menu> allMenus = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        double total = 0;
        int latteCount = 0;

        Menu m1 = new Menu("Latte", 50, "Drink" );
        allMenus.add(m1);
        Menu m2 = new Menu("Pizza", 129, "Food");
        allMenus.add(m2);
        
        allMenus.add(new Menu("Hamburger", 69, "Food"));

        System.out.println("--- Welcome to Booklyn Cafe ---");
        System.out.println("รายการอาหารของทางร้าน");

        for (Menu m : allMenus) {
            m.showInfo();
        }
        while (true) {
            System.out.println("พิมพ์เมนูที่ต้องการ (พิมพ์ OK เมื่อต้องการคิดเงิน)");
            String myOrder = sc.nextLine();
            if (myOrder.equalsIgnoreCase("OK")) {
                break;
            }else{
                for (Menu m : allMenus) {
                    if (m.menu.equalsIgnoreCase(myOrder)) {
                        System.out.println("จำนวนที่ต้องการสั่ง: ");

                        int qty = sc.nextInt();
                        sc.nextLine();

                        System.out.println("เพิ่ม "+m.menu+("จำนวน: "+qty));
                        total += (m.price*qty);
                        if (myOrder.equalsIgnoreCase("Latte")) {
                            latteCount += qty;
                        }
                    }
                }
            }
        
    }
        double discount = 0;
         if(total >= 600 ){
            discount = total*0.10;
         }else if(total >= 300){
            discount = total*0.05;
         }

         double discountNet = total-discount;

        if(latteCount >= 5){
            System.out.println("คุณสั่ง Latte จำนวน "+latteCount+" ชิ้น ได้รับคุ้กกี้ฟรี 1 ชิ้น");
        }
        
        System.out.println(total);
        double vat =  discountNet * 0.07;
            double netPrice = discountNet + vat;
            System.out.println("----------------------------");
            System.out.printf("Subtotal: %.2f THB%n", total);
            if(discount > 0){
                System.out.printf("Discount: -%.2f THB%n", discount);
            }
            System.out.printf("vat: %.2f THB%n", vat);
            System.out.printf("Grand Total: %.2f THB%n", netPrice);
            System.out.println("----------------------------");
        
    }

}
