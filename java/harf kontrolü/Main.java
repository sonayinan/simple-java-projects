//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char harf ='E';
        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
               System.out.println("kalın sesli harf");
               break;
            default:
                System.out.println("ince sesli harf");
        }
    }
}