package day06_Shorthnd_Logicaloperators;

public class ifStatementsPractice {
    public static void main(String[] args) {
        int a = 300;
        int b = 200;
      if(a>b){
          System.out.println(a+" is greater than "+b);
      }
      if(b>a){
          System.out.println(b+" is greater than " +a);
      }
      if (a==b){
          System.out.println(a + " is equal to "+b);
      }



      int x = 3000 ;
      int y = 3000;
      boolean xGreater = x > y;
      boolean yGreater = y > x;

      if(xGreater){
          System.out.println(x+ " is greater than "+y);
      }
      if(yGreater){
          System.out.println(y+ " is greater than "+x);
      }
      if( xGreater ==false && yGreater ==false){
          System.out.println(x+ " is equal to  "+ y);
      }
    }
}