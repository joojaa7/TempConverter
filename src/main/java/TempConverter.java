public class TempConverter {

    public static float kelvinToCel(float kel){
        return (float) (kel - 273.15);
    }

    public static float fahrToCel(float fahr){
        return (fahr - 32) * 5 / 9;
    }

}
