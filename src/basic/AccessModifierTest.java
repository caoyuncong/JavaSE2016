package basic;

/**
 * Created by Administrator on 2016/12/12.
 */
 public class AccessModifierTest {
   public double pi = 3.1415926;

   private int x;
   private int y;
    private boolean b;
    int i;
    protected String s;
    public double d;
   private void someMethod() {
      //
   }

   public void divid() {
      System.out.println(x / y);
   }

   public int getX() {
      return  this.x;
   }
   public int getY() {
      return  this.y;
   }

   public void setX(int x) {
      this.x = x;
   }

   public void setY(int y) {
      if (y == 0) {
         System.out.println("/ by zero!");
         System.exit(0);
      }
      this.y = y;
   }

    private void m1() {

    }

    void m2() {

    }

    protected void m3() {

    }

    public void m4() {

    }


}
