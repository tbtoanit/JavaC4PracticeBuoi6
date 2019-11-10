package DateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int i = 0;
        try{
            xuLyDate();
        } catch (Exception e){
            System.out.println("Sai pattern");
        }finally {
            System.out.println(i);
        }
    }

    public static void xuLyDate() throws Exception{
        System.out.println("Vui long nhap ngay thang nam theo dinh dang yyyy-mm-dd: ");
        Scanner sc = new Scanner(System.in);
        String dateInput = sc.nextLine();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyr-MM-dd");
        Date d = sdf.parse(dateInput);

        Date d1 = new Date(d.getTime()+ (1*24*60*60*1000));
        System.out.println(d1);
    }
}
