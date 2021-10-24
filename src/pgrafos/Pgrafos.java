package pgrafos;
import java.util.Scanner;
public class Pgrafos {
    public static int fe(int b){
                int s,x;
                s=b*(b-1);
                return s;
            }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner teclado=new Scanner(System.in);
        System.out.print("ingrese que tipo de grafos desea encontra el polinomio, lineal, completo, arbol? ");
        String t=sc.nextLine();
        int fac;
        int nu;
        if (t.equals("lineal")||t.equals("arbol")){
            System.out.print("ingrese el numero de nodos ");
            int n=teclado.nextInt();
            System.out.print("ingrese el numero de colores que va a utilizar ");
            int c=teclado.nextInt();
            int r=n-1;
            int i=c-1;
            double s=Math.pow(i, r);
            double re=c*s;
            if(re!=0){
                System.out.print("el polinomio es ");
                System.out.print(+c);
                System.out.print("("+c);
                System.out.print("-1)");
                System.out.print("^");
                System.out.print(+r);
                System.out.println(" y el numero cromatico es 2");
                System.out.print("el numero de posiblidades es de "+re);
            }
            else{
                System.out.print("polinomio no encontrado ");
            }
        }
        if (t.equals("completo")){
            System.out.print("ingrese el numero de nodos ");
            int j=teclado.nextInt();
            System.out.print("ingrese el numero de colores que va a utilizar ");
            int p=teclado.nextInt();
            int u=j-1;
            int z=p*(p-u);
            int fa=0;    

            if(z<=0){
                System.out.print("polinomio no encontrado ");
            }else{
                System.out.print("el polinomio es "+p);
                System.out.print("(");
                System.out.println(p+"-"+u+")");
                System.out.println("el numero cromatico es de "+j);
                if(p-u>4){
                for(fac=u;fac<=p;fac++){
                System.out.println("las posibilidades de colorear son "+fac);     
                        }
                
            
            }
        }
           
        }
    }
}     
    

    
    


