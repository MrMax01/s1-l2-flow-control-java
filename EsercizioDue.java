public class EsercizioDue {
    public static void main(String[] args) {
        useSwitch(2);
    }
    public static void useSwitch(int a){
        switch(a){
            case 1:
            {
                System.out.println("il numero passato è 1");
                break;
            }
            case 2:{
                System.out.println("il numero passato è 2");
                break;
            }
            default:
                System.out.println("errore");
                break;
        }
    }
}
