public class lionSheep {
        public static void main(String[] args) {
        int sheep = 1;
        int lion = 97;
        if (lion % 2 == 1){   
            lion = lion - 1; 
            System.out.println("A lion ate the sheep");    
        }
        System.out.println("Number of Lions = " + lion);
        System.out.println("Number of Sheep = " + sheep);
        }
}
