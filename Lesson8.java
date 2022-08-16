package classwork;

import java.util.Random;
import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        /*
        System.out.print("Enter size array: ");
        int size = in.nextInt();
        int[] array = new int[size];
        Random gen = new Random();              //еще один способ генерации случайных чисел
        for (int i = 0;i<array.length;i++) {
            array[i] = gen.nextInt(20);
            System.out.println(array[i]);
        }
        */
        /*
----------------------------------------------------------------------------------------------------
         */
        //Array28. Дан массив A размера N.
        //Найти минимальный элемент из его элементов с четными номерами: A2, A4, A6, . . . .
        /*
        System.out.print("Enter size array: ");
        int size = in.nextInt();
        int[] a = new int[size];
        for (int i = 0;i<a.length;i++) {
            a[i] = gen.nextInt(10);
            System.out.println(a[i]);
        }
        int min = a[0];
        for (int i = 0;i<a.length;i+=2){
            if (min>a[i]){
                min=a[i];
            }
        }
        System.out.println("\n"+min);
        */
        /*
----------------------------------------------------------------------------------------------------
         */
        //Array51. Даны массивы A и B одинакового размера N. Поменять местами их
        //содержимое и вывести вначале элементы преобразованного массива A, а
        //затем — элементы преобразованного массива B.
        /*
        System.out.print("Enter size array: ");
        int size = in.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(10);
            b[i] = gen.nextInt(21) - 10;
        }
        System.out.println();
        System.out.print("Array A: ");
        for (int i = 0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Array B: ");
        for (int i = 0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        for (int i = 0;i< a.length;i++){
            int reserv = a[i];
            a[i]=b[i];
            b[i]=reserv;
        }
        System.out.println();
        System.out.println();
        System.out.print("Array A: ");
        for (int i = 0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Array B: ");
        for (int i = 0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        */
        /*
----------------------------------------------------------------------------------------------------
         */
        //Array52. Дан массив A размера N. Сформировать новый массив B того же
        //размера, элементы которого определяются следующим образом:
        //BK = 2·AK, если AK < 5,
        //AK/2 в противном случае.
        /*
        System.out.print("Enter size array: ");
        int size = in.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];

        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(10);
        }

        System.out.print("Array A: ");
        for (int i = 0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();

        for (int i = 0;i<a.length;i++){
            if (a[i]<5) {
                b[i] = a[i] * 2;
            }
            else {
                b[i] = a[i]/2;
            }
        }
        System.out.println("\n");
        System.out.print("Array B: ");
        for (int i = 0;i< a.length;i++){
            System.out.print(b[i]+" ");
        }
        */
        /*
------------------------------------------------------------------------------------------------------
         */
        //Array53. Даны два массива A и B одинакового размера N. Сформировать новый
        //массив C того же размера, каждый элемент которого равен максимальному
        //из элементов массивов A и B с тем же индексом
        /*
        System.out.print("Enter size array: ");
        int size = in.nextInt();
        int[] a = new int[size];
        int[] b = new int[size];
        int[] c = new int[size];
        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(10);
            b[i] = gen.nextInt(21) - 10;
        }

        System.out.println();
        System.out.print("Array A: ");
        for (int i = 0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
        System.out.print("Array B: ");
        for (int i = 0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.print("\nArray C: ");
        for (int i = 0;i< a.length;i++){
            if (a[i]>=b[i])c[i]=a[i];
            else if (a[i]<b[i])c[i]=b[i];
            System.out.print(c[i]+" ");
        }
        */
        /*
----------------------------------------------------------------------------------------------
         */
        //Array54. Дан целочисленный массив A размера N.
        //Переписать в новый целочисленный массив B все четные числа из исходного массива (в том же
        //порядке) и вывести размер полученного массива B и его содержимое.
        /*
        System.out.print("Enter size array: ");
        int size = in.nextInt();
        int[] a = new int[size];
        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(50);
        }
        System.out.print("Array A: ");
        for (int i = 0;i<a.length;i++) System.out.print(a[i]+" ");
        int count = 0;
        for (int i = 0;i<a.length;i++){
            if(a[i]%2==0)count++;
        }
        if (count==0) System.out.println("In array A not even numbers");
        else {
            int[] b = new int[count];
            for (int i = 0, j = 0; i < a.length; i++) {
                if (a[i] % 2 == 0) {
                    b[j] = a[i];
                    j++;
                }
            }
            System.out.print("\nArray B: ");
            for (int i = 0; i < b.length; i++) System.out.print(b[i] + " ");
        }
         */
        /*
-----------------------------------------------------------------------------------------------------
         */
        //Array55. Дан целочисленный массив A размера N (≤ 15). Переписать в новый
        //целочисленный массив B все элементы с нечетными порядковыми номерами (1, 3, . . .)
        //и вывести размер полученного массива B и его содержимое.
        //Условный оператор не использовать.
        /*
        System.out.print("Enter size array: ");
        int size = in.nextInt();
        int[] a = new int[size];
        int[] b = new int[size/2];
        for (int i = 0;i<a.length;i++)a[i] = gen.nextInt(50);
        System.out.print("Array A: ");
        for (int i = 0;i<a.length;i++) System.out.print(a[i]+" ");
        for (int i = 1, j=0;i<a.length;i+=2,j++)b[j]=a[i];
        System.out.print("\nArray B: ");
        for (int i = 0;i<b.length;i++) System.out.print(b[i]+" ");
         */
        /*
------------------------------------------------------------------------------------------------------
         */
        //Array65. Дан массив A размера N и целое число K (1 ≤ K ≤ N). Преобразовать
        //массив, увеличив каждый его элемент на исходное значение элемента AK.
        /*
        System.out.print("Enter size array: ");
        int size = in.nextInt();
        int[] a = new int[size];
        System.out.print("Enter number K: ");
        int k = in.nextInt();
        for (int i = 0;i<a.length;i++)a[i] = gen.nextInt(50);
        System.out.print("\nArray A: ");
        for (int i = 0;i< a.length;i++) System.out.print(a[i]+" ");
        for (int i = 0;i<a.length;i++){
            if (i!=k)a[i]+=a[k];
        }
        a[k]+=a[k];
        System.out.print("\nArray A: ");
        for (int i = 0;i<a.length;i++) System.out.print(a[i]+" ");
        */
        /*
-----------------------------------------------------------------------------------------------------
         */
        //Array68. Дан массив размера N.
        //Поменять местами его минимальный и максимальный элементы.
        System.out.print("Enter size array: ");
        int size = in.nextInt();
        int[] a = new int[size];
        for (int i = 0;i<a.length;i++)a[i] = gen.nextInt(50);
        System.out.print("\nArray: ");
        for (int i = 0;i< a.length;i++) System.out.print(a[i]+" ");
        int min = a[0];
        int minIndex = 0;
        int max = a[0];
        int maxIndex = 0;
        for (int i = 0;i<a.length;i++){
            if(min>a[i]) {
                min = a[i];
                minIndex++;
            }
            if(max<a[i]){
                max=a[i];
                maxIndex++;
            }
        }
        a[minIndex]=max;
        a[maxIndex]=min;
        System.out.println("\na["+minIndex+"]="+a[minIndex]+"\na["+maxIndex+"]="+a[maxIndex]);
    }
}
