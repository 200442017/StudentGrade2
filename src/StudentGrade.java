import java.io.*;
class StudentGrade {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double arr[] = new double[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter grade 1:");
            arr[i] = Double.parseDouble(br.readLine());
            if (arr[i] > 100 || arr[i] < 0) {
                System.out.println("The grade must be in the range 0-100");
                i--;

            }
        }
        for (int i = 0; i < 6; i++) {
            if (i == 0)
                System.out.print("The mark for the 1st course is" + arr[i] + "% which is");
            else if (i == 1)
                System.out.print("The mark for the 2nd course is" + arr[i] + "% which is");
            else if (i == 2)
                System.out.print("The mark for the 3rd course is" + arr[i] + "%which is");
            else
                System.out.print("The mark for the" + (i + 1) + "th course is" + arr[i] + "% which is");
            grd(arr[i]);
        }
        double average = avg(arr);
        System.out.println("The average grade is" + average + "%, which is" + " grd(average)");
    }

    private static void grd(double x) {
        if (x >= 90 && x <= 100)
            System.out.println("an A+");
        else if (x >= 80 && x <= 89)
            System.out.println("an A");
        else if (x >= 75 && x <= 79)
            System.out.println("a B+");
        else if (x >= 70 && x <= 74)
            System.out.println("a B");
        else if (x >= 65 && x <= 69)
            System.out.println("a C+");
        else if (x >= 60 && x <= 64)
            System.out.println("a C");
        else if (x >= 55 && x <= 59)
            System.out.println("a D+");
        else if (x >= 50 && x <= 54)
            System.out.println("a D");
        else
            System.out.println("an E");
    }
    private static double avg(double x[])
    {

       double sum = 0;
       for(int i = 0; i<6;i++)
       sum+=x[i];
       return(sum/6.0);
   }
}


