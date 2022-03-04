public class Main
{

     public static void main(String[] args)
     {

         int fuelType = 92;
         int amount = 50;
         int maxAmount = 400;
         double price92 = 46.4;
         double price95 = 53.25;
         double fuelPrice = 0 ;

         if (  fuelType == 95 )
         {
             fuelPrice = price95;

         }
         else if (  fuelType == 92 )
         {
             fuelPrice = price92;

         }
         else
         {
             System.out.println("Указан неверный тип топлива(");
         }
         if (amount < 1)
         {
             System.out.println("Указано слишком малое количесвто топлива");
             amount = 0;
         }
         if (amount > maxAmount)
         {
             System.out.println("Указано слишком большое количесвто топлива");
             amount = 0;
         }



         System.out.println("Цена за литр : " + fuelPrice + "руб.");
         double totalPrice = amount * fuelPrice;

         System.out.println("Итоговая стоимость  : " + totalPrice + "руб.");






     }
}
