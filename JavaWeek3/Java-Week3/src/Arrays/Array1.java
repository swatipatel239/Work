package Arrays;

import java.lang.reflect.Array;

/**
 * Created by student on 03-May-16.
 */
public class Array1 {
    public static void main(String[] args)
    {
        int[] numbers = {1,2,3,4,5,6};
        int[][] TwoArray = {{4,2,3},{1,5,4}};

        Reminder();
        Bigdiff();
        System.out.println(CheckArrayLengh(numbers));
        System.out.println(FirstLast6(numbers));
        System.out.println(CoomonEnd(TwoArray));
        SetValue();
    }

    static boolean FirstLast6(int[] Num)
    {
        return (Num[0] == 6 || Num[Num.length - 1] == 6 );
    }
    static boolean SameFirstLast(int[] Num)
    {
        return ((Num.length >= 1) && (Num[0] == Num[Num.length - 1]));
    }
    static boolean CoomonEnd(int[][] TwoArray)
    {
        return (TwoArray[0][0] == TwoArray[1][0] || TwoArray[TwoArray.length - 1][TwoArray.length - 1] ==  TwoArray[0][TwoArray.length - 1]);
    }
    static void SetValue()
    {
        int[] SetValue = {1,4,3};
        int maxValue = 0;
        for(int i=0 ; i<= SetValue.length - 2 ; i++)
        {
                if (SetValue[i] > SetValue[i + 1]) {
                    maxValue = SetValue[i];
                } else {
                    maxValue = SetValue[i + 1];
                }
        }
        SetValue[0] = maxValue;
        SetValue[1] = maxValue;
        SetValue[2] = maxValue;
        for(int i = 0 ; i< SetValue.length; i++)
        {
            System.out.println(SetValue[i]);
        }

    }

    static boolean CheckArrayLengh(int[] Num)
    {
        for(int i=0;i<= Num.length ; i++)
        {
            if ((Num[i] == 2) || (Num[i] == 3))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
    static void Reminder()
    {
        int[] Num = {6,4,8};
        int j = 0,k = 0;
        for(int i=0;i<= Num.length - 1 ; i++)
        {
            j = (Num[i] % 2);
           {
              if(j == 0)
              {
                  k++;
              }
           }
        }
        System.out.println(k);
    }

    static void Bigdiff()
    {
        int[] SetValue = {10,3,5,6};
        int minValue = 0,maxValue = 0;
        for(int i=0 ; i<= SetValue.length - 2 ; i++)
        {
            if (SetValue[i] > SetValue[i + 1]) {
                maxValue = SetValue[i];
            } else {
                 minValue = SetValue[i];
            }
        }
        System.out.println(maxValue  + minValue);
    }

}
