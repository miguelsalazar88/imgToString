package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class App {
    public static void main(String[] args) {

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File ("src/images/claveDeFa.png");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            String linea;
            while((linea=br.readLine())!=null){
                byte[] bytes = linea.getBytes();
                System.out.print(new String(bytes));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }

    }
}
