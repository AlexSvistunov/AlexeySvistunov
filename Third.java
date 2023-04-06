
import java.util.Scanner;

public class Third {

    public static String Main() {
        String str = GetString();
        str = ImproveString(str);
        String[] strArray = str.split(" ");
        double[] doubleArray = GetIntArray(strArray);
        return Calculate(doubleArray);
    }
    public static String GetString() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите координаты точек (в формате ([Xa, Ya], [Xb, Yb], [Xc, Yc]).\nПример ([4, 6], [12, 4], [10, 10]): ");
        return  in.nextLine();
    }
    public static String ImproveString(String str) {
        str = str.replace("(", "").replace("[", "").replace(",", "").replace("]", "").replace(")", "");
        return str;
    }
    public static String Calculate(double[] doubleArray) {
        double X = (doubleArray[0] + doubleArray[2] + doubleArray[4]) / 3;
        String strX = (String) String.format("%.4f", X);
        X = Double.parseDouble(strX);
        double Y = (doubleArray[1] + doubleArray[3] + doubleArray[5]) / 3;
        String strY = (String) String.format("%.4f", Y);
        Y = Double.parseDouble(strY);
        return "{" + X + ", " + Y + "}";
    }
    public static double[] GetIntArray(String[] strArray) {
        double[] doubleArray = new double[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            doubleArray[i] = Double.parseDouble(strArray[i]);
        }
        return doubleArray;
    }
}
