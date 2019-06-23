package pl.com.sda.rafal.zientara.javalon.week22.swing.zad2;

public class MainZad2 {

    public static void main(String[] args) {
        FirstWindow firstWindow = new FirstWindow();
        SecondWindow secondWindow = new SecondWindow();

        firstWindow.setListener(secondWindow);

        firstWindow.show();
        secondWindow.show();
    }
}
