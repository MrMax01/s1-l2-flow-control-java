public class EsercizioUno {
    public static void main(String[] args) {
        System.out.println(stringaPariDispari("ciao"));
        System.out.println(annoBisestile(2005));

    }

    public static boolean stringaPariDispari(String args){

        return args.length()%2==0;
    }
    public static  boolean annoBisestile(int year){
        return year%4==0 || (year%100==0 && year%400==0);
    }
}
