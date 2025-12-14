public class notvowels {
    public static void main(String[] args) {
    String name = "Sai dhatha";
    StringBuilder sb = new StringBuilder();
for (int i = 0; i < name.length(); i++) {
char ch = name.charAt(i);
if ("AEIOUaeiou ".indexOf(ch)!=-1) {
continue;
}
sb.append(ch);
}
String alphabets = sb.toString().toLowerCase();
System.out.println("Original Name: " + name);
System.out.println("Non vowels are : " + alphabets);
    }
}
