public class TempConverter {

    public static float kelvinToCel(float kel){
        return (float) (kel - 273.15);
    }

    public static float fahrToCel(float fahr){
        return (fahr - 32) * 5 / 9;
    }

    public static  double kelvinToFah(double kel) {
        return Math.round((kel-273.15)* ((double) 9/5) + 32);
    }

}
