import java.util.Scanner;
/**
 *
 * @author ThePoisoned1
 */
public class E611_ConanDoyleSeanConnery {
    Scanner sc;

    public static void main(String[] args) {
        new E611_ConanDoyleSeanConnery().run();
    }

    private void run() {
        sc = new Scanner(System.in);
        while (caso())
            ;
    }

    private boolean caso() {
        if (!sc.hasNext()) {
            return false;
        }
        int caballero = Integer.parseInt(sc.nextLine().split(" ")[0]);
        int libros = Integer.parseInt(sc.nextLine());
        int publicacion;
        String linea;
        int primero=Integer.MAX_VALUE;
        String titulo="";
        boolean todas = true;
        for (int i = 0; i < libros; i++) {
            linea = sc.nextLine();
            publicacion= Integer.parseInt(linea.split(" ",2)[0]);
            if(publicacion>=caballero && publicacion<primero){
                primero=publicacion;
                titulo=linea.split(" ",2)[1];
            }else if (publicacion<caballero){
                todas=false;
            }
            
        }
        if(todas){
            System.out.println("TODAS");
        }else if(primero==Integer.MAX_VALUE){
            System.out.println("NINGUNA");
        }else{
            System.out.println(titulo);
        }
        return true;
    }
}
