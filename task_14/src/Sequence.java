/**
 * Created by president on 3/9/14.
 */
public class Sequence
{
    public static void main(String args[])
    {
        int maxCount = 1000000;
        long currentValue;
        int sequence = 1;
        int maxSequence = 0;
        int maxElement = 0;

        for (int i = 2; i < maxCount; i++)
        {
            currentValue = i;
           // System.out.print(i + " -> ");

            while (currentValue != 1)
            {
                sequence++;
                if (currentValue % 2 == 0)
                {
                    currentValue = currentValue / 2;
                } else if (currentValue % 2 != 0)
                {
                    currentValue = (3 * currentValue) + 1;
                }

//                if (currentValue == 1)
//                {
//                    if (maxSequence <sequence)
//                    {
//                        maxSequence = sequence;
//                        maxElement = i;
//                    }
                   // System.out.print(currentValue + " (" + sequence + ")(max elem: " + maxElement + ", max seq: " + maxSequence + ")");
//                }
//                else
                  //  System.out.print(currentValue + " -> ");

            }
            if (maxSequence < sequence)
            {
                maxSequence = sequence;
                maxElement = i;
                System.out.println(maxElement + " : " + maxSequence);
            }

            sequence = 1;
           // System.out.println("");
        }

        System.out.println("------");
        System.out.println("Самая длинная последовательность в промежутку от 2 до " + maxCount + " у числа - "
                + maxElement + ", она составляет: " + maxSequence);



    }
}
