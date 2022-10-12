import java.awt.*;

public class fraction {
        private int numerator;
        private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public fraction fraction_multipy(fraction frac){

        fraction new_frac=new fraction();
        new_frac.setNumerator(this.numerator*frac.getNumerator());
        new_frac.setDenominator(this.denominator*frac.getDenominator());

        return  new_frac;

    }

    public fraction fraction_sum(fraction frac){
        fraction new_frac=new fraction();



        new_frac.setNumerator((this.numerator * frac.getDenominator()) +
                (  this.denominator *frac.getNumerator()  ));
        new_frac.setDenominator(this.denominator * frac.getDenominator());

        return new_frac;
    }


    public  fraction fraction_simplify(){


        int biggest=1;
       fraction new_frac=new fraction();
       int i =1;
       while (i <= numerator && i <= denominator){
           if(numerator%i==0 && denominator%i==0){

               biggest= i;
           }
           i+=1;
       }
        new_frac.setNumerator(numerator/biggest);
        new_frac.setDenominator(denominator/biggest);
        return new_frac;


}








}
