package lection2;

public class Task9 {
    public static void main(String[] args) {
        String[] str = {"Я","купил","самокат","вчера","rtyrtu"};
        for(String s: str)
            System.out.print(s + " ");
        String str1;
        int n= str.length;

        for (int i = 0; i < n/2; i++) {
            str1 = str[n-i-1];
            str[n-i-1] = str[i];
            str[i] = str1;
        }
        System.out.println();
        for(String s: str)
            System.out.print(s + " ");

    }
}