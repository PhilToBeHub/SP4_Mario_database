import java.util.Scanner;

public class Console {
    boolean running = true;
    MenuCard menucard;
    Order order;
    ActiveOrders activeOrders = new ActiveOrders();
    OrderHistory orderHistory = new OrderHistory();
    int idCounter = 1;
    int fullPrice;
    private String Green = "\u001B[32m";
    private String Red = "\u001B[31m";
    Scanner cmd = new Scanner(System.in);

    public Console(MenuCard menucard) {
        this.menucard = menucard;
    }


    public void startConsole() {

        boolean running = true;
        int choice = 0;

        while (running) {
            System.out.println(Green + "Ciao :\n" +
                    Green + "1) Lav ny bestilling\n" +
                    Green + "2) Afslut bestilling\n" +
                    Green + "3) Vis nuværende bestillinger\n" +
                    Green + "4) Vis gamle bestillinger\n" +
                    Green + "5) Exit");

            choice = Integer.parseInt(cmd.nextLine());
            switch (choice) {
                case 1:
                    orderPizzas();
                    break;
                case 2:
                    removeActiveOrder();
                    break;
                case 3:
                    showActiveOrders();
                  //  System.out.println(order.calculateFullPrice(order.pizzas));
                    break;
                case 4:
                    showOrderHistory();
                    break;
                case 5:
                    running = false;
            }
        }
    }

    public void orderPizzas() {
        int choice = 0;
        System.out.println("Afhentning af pizza: ");
        String pickUpTime = cmd.nextLine();
        order = new Order(pickUpTime,idCounter, fullPrice);
        idCounter++;

        while(choice != -1) {
            menucard.showMenuCard();
            choice = Integer.parseInt(cmd.nextLine());
            if (choice != -1) {
                order.addPizza(menucard.getPizzas().get(choice-1));
            }
        }
        activeOrders.addOrder(order);

    }
//
    public void removeActiveOrder(){
        Order or = null;
        System.out.println("Vælg ordrenummer");
        int idInput = Integer.parseInt(cmd.nextLine());
        for (Order o : activeOrders.getActiveOrders()) {
            if (idInput == o.getId()) {
                or = o;
                orderHistory.addToOrderHistory(o);

            }
        }
        activeOrders.removeOrder(or);
    }

    public void showActiveOrders() {
        System.out.println(Red + "Nuværende bestillinger: ");
        System.out.println(Red + activeOrders);
    }

    public void showOrderHistory() {
        System.out.println(Red + "Ordre historik: ");
        System.out.println(Red + orderHistory);
    }
}

