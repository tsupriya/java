public class a3 {

    public static void moMethod() {
        //int d;
        System.out.println("inside method");
        for(int b=1; b<=6; b++) {
            System.out.println("");
            /* code to include space before printing
            d=b;
            while(d!=0)
            {
                System.out.print("  ");
                d--;
            }*/

            for (int c = b; c<=6; c++) {
                System.out.print(c + " ");
                //k++;
            }
            //System.out.println("outside method");
        }
    }

    public static void main(String[] args) {
        int k = 0;
        int i=1;
        int j;
        System.out.print("Fibonacci Series is " + k +" "+ i + " ");
        for(int a=1;a<=20;a++){
            j=i+k;
            System.out.print(j+ " ");
            k=i;i=j;
        }

        moMethod();
    }



}


