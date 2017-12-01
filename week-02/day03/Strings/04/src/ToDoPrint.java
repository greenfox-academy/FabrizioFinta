public class ToDoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        String temp = todoText.substring(0);
        todoText.concat("My todo\n" + temp + "Download Games \n\tDiablo");
        System.out.println(todoText);
    }
}
