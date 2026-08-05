public class patterns {
    void pattern1(int n){
        for(int i = 1;i<=n; i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern2(int n){
        for(int i = 1;i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern3(int n){
        for(int i = 1;i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void pattern4(int n){
        for(int i = 1;i<=n; i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void pattern5(int n){
        for(int i = 1;i<=n; i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void pattern6(int n){
        for(int i = 1;i<=n; i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patterns p = new patterns();
        p.pattern6(5);
    }
}
