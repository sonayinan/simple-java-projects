//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int number=27;
    int toplam=0;
    for (int i=1; i<number; i++){
        if(number % i==0){
            toplam=toplam+i;
        }
    }
    if(toplam==number){
        System.out.println("mükemmel sayı");
    }else{
        System.out.println("mükemmel sayı değildir");
    }
        }
    }
