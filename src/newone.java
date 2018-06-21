import java.util.*;
public class newone {
    public static void main(String[] args) {
        int n,temp=0,m=0,max=0;
        Scanner nt = new Scanner(System.in);
        n= nt.nextInt();
        if(n<3){
            System.out.println(">3 ??");
            System.exit(1);
        }
        int a[]= new int[n];
        for (int i =0;i<n;i++){
            a[i]=nt.nextInt();

        }
        Arrays.sort(a);
       /* for(int i=0 ;i < 3;i++){
            max=a[i];
            for (int j=i+1;j<n;j++){
                if(max<a[j]){
                    max=a[j];
                    m=j;
                }

            }
            a[m]=a[i];
            a[i]=max;

        }*/
        System.out.println(a[n-3]);

    }
}
