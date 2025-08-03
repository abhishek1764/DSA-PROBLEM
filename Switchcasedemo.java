public class Switchcasedemo {
  
    public static void main(String[] args) {
        // int , byte , char
        // Java 7 - Switch with String
        // final int PIZZA = 1;
        // final int BURGER = 2;
        // final int DRINK =3;
        // int choice = PIZZA;

        // switch (choice) {
        // case PIZZA:
        // System.out.println("Rs 200");

        // case BURGER:
        // System.out.println("Rs 100");
        // case DRINK:
        // System.out.println("Rs 50");
        // default:
        // System.out.println("Wrong Choice...");
        // }
        // switch with expression
        String choice = "Pizza";
        int price = switch (choice) {
            case "Pizza", "Icecream" -> 200;

            case "Burger" -> {
                int x = 100;
                int y = 20;
                int z = x + y;
                yield z;
            }

            case "Drink" -> 50;
            default -> 0;

        };
        System.out.println(price + price * 0.18);
        // switch (choice) {
        // case "Pizza":
        // System.out.println("Rs 200");

        // case "Burger":
        // System.out.println("Rs 100");
        // case "Drink":
        // System.out.println("Rs 50");
        // default:
        // System.out.println("Wrong Choice...");
        // }
    }
}
    

