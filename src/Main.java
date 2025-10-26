import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Bu kod ali yazdıracak
    System.out.println("ali");
    // bu mesaj bana yazdığım iki verinin birleştirlmilş halini verecek
    String message = "hello" + "&";
//Alttaki kod mesajı yazdıracak
    System.out.println(message);
    //bu kod sayesinde x ve y yi değişken şeklinde vericek
    byte x = 1;
    byte y = x;
    x = 4;
        System.out.println(x);
        // bu kod bize x yada y verisini değişebilir bi şekilde verecek
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);



    }
}
