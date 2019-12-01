public class ss{
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("1)Print a multiplication table .");
        System.out.println("2)Print a multiplication table in a range.");
        System.out.print("Enter your choice : ");
        ch(input.nextInt());
    }
    public static void ch(int n ) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        if (n==1){
            System.out.print("Enter the factor : ");
            multiply(input.nextInt(),1,10);
        }
        if(n==2){
            System.out.print("Enter the range: ");
            int ni=input.nextInt();
            int nf = input.nextInt();
            System.out.print("Enter the factor: ");
            int f =input.nextInt();
            multiply(f, ni, nf);
        }
        if (n!=1&&n!=2) {System.out.print(" (ERROR) ");}
    }
    public static void multiply(int f,int ni,int nf ) {
        for (int i=ni;ni<=nf;ni++){
            System.out.printf("%2d%5s%5d%3s%5d\n",ni,"*",f,"=",(ni*f));
        }
    }
}