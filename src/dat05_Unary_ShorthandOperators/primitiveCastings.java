package dat05_Unary_ShorthandOperators;

public class primitiveCastings {
    public static void main(String[] args) {

      // implicit casting
        int a = 10;
        long b =a; //implicit casting is done automatically
        // be = 10L
       // int c = b; // b is still long datatype
        System.out.println(b);

        int a1 =100;
        long b1 =(long)a1; //manually doing the implicit casting

        //explicit casting

        int Inum =100;
        byte Bnum =(byte)Inum;

        short Snum = (byte)Inum;

        double Dnum =5.5;
        float Fnum = (int)Dnum;
        System.out.println(Fnum+1);

        double D1 =10.5;
        System.out.println(D1);
        // long l1 =(long) ((float) D1)

        long L1 =(int) D1;
        System.out.println(L1);

        float F1 = 60.5f;
        int I1 = (int)F1;
        System.out.println(I1);

        long largeNum = 99999999999L;
        int intNum = (int) largeNum;
        System.out.println(intNum);

        char ch1 = 'a';
        short sh1 =(short)ch1;
        System.out.println(sh1);

        char ch2 = 23456;
        double dbl1 = ch2;
        System.out.println(dbl1);



    }

}
