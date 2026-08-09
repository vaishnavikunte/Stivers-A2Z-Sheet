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

    void pattern7(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }  
            System.out.println();      
        }
        
    }

    void pattern8(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }  
            System.out.println();      
        }
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print("*");
            }
            System.out.println();      
        }
        
    }

    void pattern9(int n){
        for(int i=1;i<=n*2-1;i++){
            int stars = i;
            if(stars>n){
                stars = 2*n-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void pattern10(int n){
        for(int i=1;i<=n;i++){
            int start=1;
            if(i%2==0){
                start=0;
            }
            for(int j=1;j<=i;j++){
                System.out.println(start);
            }
        }
    }

    public static void main(String[] args) {
        patterns p = new patterns();
        p.pattern10(5);
    }
}
