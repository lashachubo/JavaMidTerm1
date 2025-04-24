package t2.rice.sub;

import t2.rice.A21;
import t2.ingredient.props.A22;

public class R21 {
    public static void main(String[] args) {
        A21 a21 = new A21();
        A22 a22 = new A22();

        int area = a21.getWidth() * a21.getHeight();
        System.out.println("Area: " + area);

        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"};

        int month = a22.getMonth();
        if (month >= 1 && month <= 12) {
            System.out.println("month: " + months[month - 1]);
        } else {
            System.out.println("error: " + month);
        }
    }
}
