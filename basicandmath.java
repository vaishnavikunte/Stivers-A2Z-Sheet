
import java.util.ArrayList;
import java.util.List;

//count number of digits

class basicandmath{
    int count=0;
    void count1(int n){ // time complexity O(log n)
        while(n>0){
            count++;
            n=n/10;
        }
        System.out.println("Number of digits: "+count);
    }

    void count2(int n){ // tc- O(1)
        System.out.println("Number of digits: "+((int)Math.log10(n)+1));
    }

    void reverse(int n){
        int rev=0,rem;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println("Reversed number: "+rev);
    }

    public void palindrome(int n){//tc- O(log n) , sc- O(1)
        int rev=0,rem=0,temp=n;
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("Palindrome");}
        else{
            System.out.println("Not Palindrome");
        }

    }
    public void gcd(int n1,int n2){ // tc - 0(min(n1,n2)), sc- O(1)
        int i=1, gcd=1;
        while(i<=n1 && i<=n2){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
            i++;
        }
        System.out.println("gcd is: "+gcd);
    }

    public void gcd2(int n1,int n2){ // better approach , tc- O(min(n1,n2)), sc- O(1)
        int gcd=1;
        for(int i=Math.min(n1,n2);i>=1;i--){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println("gcd is: "+gcd);
    }

    //euclidean algorithm
    public void gcd3(int n1,int n2){ // tc- O(log min(n1,n2)), sc- O(1)
        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
        if(n1==0){
            System.out.println("gcd is: "+n2);
        }
        else{
            System.out.println("gcd is: "+n1);
        }
    }

    public void arm(int n){
        int k = String.valueOf(n).length(); // Get number of digits
        int sum = 0;
        int temp = n;

        while (n > 0) {
            int ld = n % 10;             // Last digit
            sum += Math.pow(ld, k);      // Add ld^k
            n /= 10;                     // Remove digit
        }

        if(sum == temp){
            System.out.println(temp + " is an Armstrong number");
        }
        else{
            System.out.println(temp + " is not an Armstrong number");
        }
        
    }

    public void div(int n){ // tc- O(n), sc- O(1)
            
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    System.out.print(i+" ");
                }
            }
    }

    public List<Integer> getDiv(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
                if(n%i==0){
                    list.add(i);
                }
            }
        return list;
    }


    public List<Integer> getDiv2(int n){ // tc- 0(sqrt(n)) , sc - O(2*sqrt(N))(for storing divisors)
        List<Integer> list = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
                if(n%i==0){
                    list.add(i);
                }
                if(i!=n/i){ // to add pair 
                    list.add(n/i);
                }
            }
        return list;
    }

    public void prime(int n){ //tc- 0(sqrt(n)), sc-0(1)
        int c=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                c++;
                if(n%i!=i){
                    c++;
                }
            }            
        }
        if(c==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }

    public static void main(String[] args) {
        basicandmath obj = new basicandmath();
        obj.prime(5);
        //obj.gcd3(12,18);

       /*  List<Integer> res = obj.getDiv2(12);
        System.out.println(res);*/

        
    }
}