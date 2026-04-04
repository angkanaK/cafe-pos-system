public class Menu {
    public String menu;
    public double price;
    public String type;
public Menu(String menu, double price, String type){
    this.menu = menu;
    this.price = price;
    this.type = type;
}
public void showInfo() {
        System.out.println("Menu: "+menu +" Price: "+ price+" THB");
    }    
}
