import java.time.Instant;
import java.util.List;

import static java.time.Instant.now;

public class Main {
    public static void main(String[] args) {
//        DataRetriever dataRetriever = new DataRetriever();
//        Dish saladeVerte = dataRetriever.findDishById(1);
//        System.out.println(saladeVerte);
//
//        Dish poulet = dataRetriever.findDishById(2);
//        System.out.println(poulet);
//
//        Dish rizLegume = dataRetriever.findDishById(3);
//        rizLegume.setPrice(100.0);
//        Dish newRizLegume = dataRetriever.saveDish(rizLegume);
//        System.out.println(newRizLegume); // Should not throw exception


//        Dish rizLegumeAgain = dataRetriever.findDishById(3);
//        rizLegumeAgain.setPrice(null);
//        Dish savedNewRizLegume = dataRetriever.saveDish(rizLegume);
//        System.out.println(savedNewRizLegume); // Should throw exception

//        Ingredient laitue = dataRetriever.findIngredientById(1);
//        System.out.println(laitue);
        DataRetriever dataRetriever = new DataRetriever();
       // Order orderOne = dataRetriever.findOrderByReference("ORD00001");

      //  Order newOrder = new Order();
      //  newOrder.setId(2);
     //   newOrder.setReference("ORD00003");
//        List<DishOrder> dishOrderList = orderOne.getDishOrderList();
       // DishOrder newDishOrder = new DishOrder();
      //  newDishOrder.setDish(dataRetriever.findDishById(2));
     //   newDishOrder.setQuantity(1);
     //   dishOrderList.add(newDishOrder);
     //   newOrder.setDishOrderList(dishOrderList);
     //   newOrder.setCreationDatetime(now());
      //  Order savedOrder = dataRetriever.saveOrder(newOrder);
       // System.out.println(savedOrder);
        StockValue sv = dataRetriever.getStockValueAt(Instant.now(), 1);
        System.out.println(sv.getQuantity());
//Kdjty
        System.out.println(dataRetriever.getDishCost(1));
        System.out.println(dataRetriever.getGrossMargin(1));
        dataRetriever.getStockStatistics(
                "day",
                Instant.parse("2026-01-01T00:00:00Z"),
                Instant.parse("2026-01-05T23:59:59Z")
        );
        dataRetriever.getStockStatistics(
                "week",
                Instant.parse("2026-01-01T00:00:00Z"),
                Instant.parse("2026-01-31T23:59:59Z")
        );
        dataRetriever.getStockValueAt(
                Instant.parse("2026-01-06T12:00:00Z"),
                1
        );

        System.out.println("Quantité à l'instant : " + sv.getQuantity() + " " + sv.getUnit());
        dataRetriever.getStockStatistics(
                "month",
                Instant.parse("2026-01-01T00:00:00Z"),
                Instant.parse("2026-03-31T23:59:59Z")
        );

    }
}
