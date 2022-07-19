public class Monster {
   private String name;
   private int damage;
   private int life;

   public Monster(String cName, int cDamage, int cLife){
      this.name = cName;
      this.damage = cDamage;
      this.life = cLife;
   }

   public void attack(Monster enemy){
      enemy.setLife(enemy.getLife() - this.getDamage());

      if(enemy.getLife() > 0) {
         System.out.println(enemy.getName() + " has " +enemy.getLife()+" points remaining.");
      }
      else {
         System.out.println(enemy.getName() + " is KO !");
      }
   }
   
   public int getDamage() {
      return damage;
   }
   public void setDamage(int damage) {
      this.damage = damage;
   }
   public int getLife() {
      return life;
   }
   public void setLife(int life) {
      this.life = life;
   }
   public String getName(){
      return this.name;
   }
   public void setName(String name){
      this.name = name;
   }
   @Override
   public String toString() {
      return "Monster [damage=" + damage + ", life=" + life + ", name=" + name + "]";
   }
}