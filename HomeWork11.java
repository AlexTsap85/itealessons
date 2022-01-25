package lection2;

public class HomeWork11 {
    public static void main(String[] args){
        String[] a = { " a "," b "," c ", " d "};
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        int n = a.length;
        String change;
        for (int i = 0; i < n/2; i++) {
            change = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = change;
        }
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}