import java.net.Socket;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Dziessń dobry");
        int i=12;
        System.out.println(i);
//		{
        int w=10;
//		}
        System.out.println(w);

        int[] tab=new int[3];
        tab[0]=1;
        tab[1]=12;
        tab[2]=223;

        for(int j=0;j<tab.length;j++)
            System.out.println(tab[j]);

        int[] tab1= {1,2,3,4,5,6,7,89,9,9,8};
        for(int k: tab1)
            System.out.println(k);

        int liczba=1;

        Integer liczba1=Integer.valueOf(liczba);
        System.out.println(liczba1.toString());
    }

}