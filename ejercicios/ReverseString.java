class Recursive{
    static void reverse(char[] str){
        rv(str, str.length - 1, 0);
    }
    private static void rv(char[] str, int length, int i){
        if(length == i){
            System.out.print(str[length]);
            return;
        }else{
            rv(str, length, i + 1);
        }
        System.out.print(str[i]);



    }
}

public class ReverseString{
    public static void main(String[] s){
        char[] str = {'n','i','c','o','l','a','s'};
        System.out.print("Normal string: ");
        for(int i = 0; i < str.length; i++) System.out.print(str[i]);
        System.out.println();
        System.out.print("Reversed string: ");
        Recursive.reverse(str);
        System.out.println();
    }
}
