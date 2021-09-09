public class Encadeado{

    public void encadeado(){

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
        
    }

}
