package main.java.com.stackroute.pe2;

import java.math.BigDecimal;

public class IntegerFactorial {
    BigDecimal ob = new BigDecimal("234567890000000987654321234567");
    BigDecimal ob2 = new BigDecimal("123456789009876543232456");
   /*
   list all the factorial that can be expressed as a long (64-bit signed integer).
    */
    public String longFactorial() {
        String outp = "";
        BigDecimal ob1 = new BigDecimal(1);
        System.out.println("List of factorials under long value is");
        for (int i = 1; ; i++) {
            if (ob1.compareTo(new BigDecimal(Long.MAX_VALUE)) < 0 && ob1.multiply(new BigDecimal(i + 1)).compareTo(new BigDecimal(Long.MAX_VALUE)) < 0) {
                ob1 = ob1.multiply(new BigDecimal(i));
                System.out.println(i);
                outp = outp + i;
                outp = outp + "\n";

            } else {
                break;
            }
        }
        return outp;
    }
    /*
    list all the factorials, that can be expressed as an int (i.e., 32-bit signed integer)

     */
    public String intFactorial(){
        String outp = "";
        BigDecimal ob1 = new BigDecimal(1);
        BigDecimal ob2;
        int j=1;
        System.out.println("List of factorials under int value is");
        for (int i = 1; ; ) {
            if (ob1.compareTo(new BigDecimal(Integer.MAX_VALUE)) < 0&&ob1.multiply(new BigDecimal(i+1)).compareTo(new BigDecimal(Integer.MAX_VALUE))<0){
                ob2=ob1;

                ob1 = ob1.multiply(new BigDecimal(i));
                System.out.println(i);
                outp = outp + i;
                outp=outp+"\n";

            }
            else{
                break;
            }
            i++;
        }

        return outp;



    }

}
