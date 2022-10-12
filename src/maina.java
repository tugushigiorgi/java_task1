


public class maina {
    public static void main(String[] args) {

        fraction fr=new fraction();

        fr.setNumerator(40);
        fr.setDenominator(160);
        System.out.println(fr.fraction_simplify().getNumerator());
        System.out.println(fr.fraction_simplify().getDenominator());


    }


        public static  double diskriminanti(int a, int b, int c){

           return Math.pow(b,2)-4*a*c;

        }
        public static String smalles_string_in_the_array(String[] data){
                int temporary=data[0].length();
                int index=0;
                for (int i = 0; i <data.length ; i++) {
                    if(data[i].length()<temporary){
                        temporary=data[i].length();
                        index=i;



                    }
            }
                    return data[index];


        }



}
