public class patter3 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
       
 for(int i=0;i<=n;i++){
 
for(int j=1;j<=n-i;j++){
    System.out.print("*");
}
System.out.println();
}
    }
}
