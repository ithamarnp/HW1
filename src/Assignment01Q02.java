public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int starterNum =1;
        double multi=4;
        int input = Integer.parseInt(args[0]);
        for (int i=0;(i/2)<input;i=i+2){
            multi= multi*(1/(starterNum+i));
        }
        approxPi=multi;
        System.out.println(approxPi + " " + actualPi);
    }
}
