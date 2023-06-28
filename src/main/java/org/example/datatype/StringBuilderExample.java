package org.example.datatype;

public class StringBuilderExample {
    public static void main(String[] args) {
        var sb = new StringBuilder();
        sb.append("red");
        sb.deleteCharAt(0);
         sb.delete(1, 2);
         System.out.println(sb);
    }

    private void classChaining(){
//        var sb = new StringBuilder("radical").insert(sb.length(), "robots"); doesn't compile
        var sb = new StringBuilder("radical").append(1);

        System.out.println(sb);
        sb.insert(sb.length(),"robots");
    }
}
