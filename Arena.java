public class Arena {
   
   public static void main(String[] args){
      Monster thanos = new Monster("Thanos", 14, 100);
      Monster hulk = new Monster("Hulk", 10, 80);

      /*while(hulk.getLife() > 0 && thanos.getLife() > 0){
         hulk.attack(thanos);

         if(thanos.getLife() > 0) {
            thanos.attack(hulk);
         }
      }*/

      do {
         thanos.attack(hulk);

         if(hulk.getLife()> 0){
            hulk.attack(thanos);
         }

      } while (thanos.getLife() > 0 && hulk.getLife() > 0);
   }
}
