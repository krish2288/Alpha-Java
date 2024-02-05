public class CharacterPattern {
    public static void main(String[] args) {
        int character=4;
        char ch='A';
        for(int l=1;l<=character;l++){
            for(int n=1;n<=l;n++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
