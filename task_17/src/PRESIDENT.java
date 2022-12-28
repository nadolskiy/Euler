/**
 * Created by president on 3/12/14.
 */
public class PRESIDENT
{
    public static void main(String args[])
    {
        String[] nameZeroNine = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine",};
        String[] nameElevenNineteen = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] nameTenNinety = {"ten" , "twenty" , "thirty" , "forty" , "fifty" , "sixty" , "seventy" , "eighty" , "ninety" };
        String nameHundred = "hundred";
        String nameThousand = "thousand";
        String nameAnd = "and";


        String num;
        String[] a;
        int length = 0;


        for (int i = 1; i <= 1000; i++)
        {
            num = "" + i;
            a = num.split("");

            switch (num.length())
            {
                case 1:
                    length += nameZeroNine[(i-1)].toString().length();
                    System.out.println(i+ " = " + nameZeroNine[(i-1)].toString()
                            + " (" + nameZeroNine[(i-1)].toString().length()
                            + " симв.);");
                    break;
                case 2:
                    if (a[2].equals("0"))
                    {
                        System.out.println("--(" + length + " симв.)--\n");
                        length += nameTenNinety[((i / 10) - 1)].toString().length();
                        System.out.println(i + " = " + nameTenNinety[((i / 10) - 1)].toString()
                                + " (" + nameTenNinety[((i / 10) - 1)].toString().length()
                                + " симв.);");
                    }
                    else
                    {
                        if (a[1].equals("1"))
                        {
                            length += nameElevenNineteen[(i-11)].toString().length();
                            System.out.println(i+ " = " + nameElevenNineteen[(i-11)].toString()
                                    + " (" + nameElevenNineteen[(i-11)].toString().length()
                                    + " симв.);");
                        }
                        else
                        {
                            int j = Integer.parseInt(a[1]) -1;
                            int k = Integer.parseInt(a[2]) -1;
                            length += nameTenNinety[j].toString().length();
                            length += nameZeroNine[k].length();

                            int n = nameTenNinety[j].toString().length();
                            int b = nameZeroNine[k].length();
                            int s = n + b;
                            System.out.println(i+ " = " + nameTenNinety[j].toString() + " " + nameZeroNine[k]
                                    + " (" + s
                                    + " симв.);");
                        }
                    }
                    break;
                case 3:
                    if (a[2].equals("0") && a[3].equals("0"))
                    {
                        System.out.println("---(" + length + " симв.)---\n");
                        length += nameZeroNine[((i/100)-1)].toString().length();
                        length += nameHundred.length();

                        int n = nameZeroNine[((i/100)-1)].toString().length();
                        int b = nameHundred.length();
                        int s = n + b;

                        System.out.println(i + " = " + nameZeroNine[((i/100)-1)].toString() + " " + nameHundred
                                + " (" + s
                                + " симв.);");
                    }
                    else
                    {
                        if (a[2].equals("0"))
                        {
                            length += nameZeroNine[((i/100)-1)].toString().length();
                            length += nameHundred.length();
                            length += nameAnd.length();
                            length += nameZeroNine[Integer.parseInt(a[3])-1].toString().length();

                            int q = nameZeroNine[((i/100)-1)].toString().length();
                            int w = nameHundred.length();
                            int e = nameAnd.length();
                            int r = nameZeroNine[Integer.parseInt(a[3])-1].toString().length();

                            int s = q + w + e + r;

                            System.out.println(i + " = "
                                    + nameZeroNine[((i/100)-1)].toString()
                                    + " "
                                    + nameHundred
                                    + " "
                                    + nameAnd
                                    + " "
                                    + nameZeroNine[Integer.parseInt(a[3])-1].toString()
                                    + " (" + s
                                    + " симв.);"
                            );
                        }
                        if (a[3].equals("0"))
                        {
                            System.out.println("---(" + length + " симв.)---\n");

                            length += nameZeroNine[((i/100)-1)].toString().length();
                            length += nameHundred.length();
                            length += nameAnd.length();
                            length += nameTenNinety[Integer.parseInt(a[2])-1].toString().length();

                            int q = nameZeroNine[((i/100)-1)].toString().length();
                            int w = nameHundred.length();
                            int e = nameAnd.length();
                            int r = nameTenNinety[Integer.parseInt(a[2])-1].toString().length();

                            int s = q + w + e + r;

                            System.out.println(i + " = "
                                    + nameZeroNine[((i/100)-1)].toString()
                                    + " "
                                    + nameHundred
                                    + " "
                                    + nameAnd
                                    + " "
                                    + nameTenNinety[Integer.parseInt(a[2])-1].toString()
                                    + " (" + s
                                    + " симв.);"
                            );
                        }
                        if (a[2].equals("1") && !a[3].equals("0"))
                        {
                            length += nameZeroNine[((i/100)-1)].toString().length();
                            length += nameHundred.length();
                            length += nameAnd.length();
                            length += nameElevenNineteen[Integer.parseInt(a[3])-1].toString().length();

                            int q = nameZeroNine[((i/100)-1)].toString().length();
                            int w = nameHundred.length();
                            int e = nameAnd.length();
                            int r = nameElevenNineteen[Integer.parseInt(a[3])-1].toString().length();

                            int s = q + w + e + r;

                            System.out.println(i + " = "
                                    + nameZeroNine[((i/100)-1)].toString()
                                    + " "
                                    + nameHundred
                                    + " "
                                    + nameAnd
                                    + " "
                                    + nameElevenNineteen[Integer.parseInt(a[3])-1].toString()
                                    + " (" + s
                                    + " симв.);"
                            );
                        }

                        if(!(a[2].equals("0")) && !(a[2].equals("1")) && !(a[3].equals("0")))
                        {
                            length += nameZeroNine[((i/100)-1)].toString().length();
                            length += nameHundred.length();
                            length += nameAnd.length();
                            length += nameTenNinety[Integer.parseInt(a[2])-1].toString().length();
                            length += nameZeroNine[Integer.parseInt(a[3])-1].toString().length();

                            int q = nameZeroNine[((i/100)-1)].toString().length();
                            int w = nameHundred.length();
                            int e = nameAnd.length();
                            int r = nameTenNinety[Integer.parseInt(a[2])-1].toString().length();
                            int t = nameZeroNine[Integer.parseInt(a[3])-1].toString().length();

                            int s = q + w + e + r + t;

                            System.out.println(i + " = "
                                + nameZeroNine[((i/100)-1)].toString()
                                + " "
                                + nameHundred
                                + " "
                                + nameAnd
                                + " "
                                + nameTenNinety[Integer.parseInt(a[2])-1].toString()
                                + "-"
                                + nameZeroNine[Integer.parseInt(a[3])-1].toString()
                                + " (" + s
                                + " симв.);"
                        );
                        }
                    }
                    break;
                case 4:
                    if (a[2].equals("0") && a[3].equals("0") && a[4].equals("0"))
                    {
                        System.out.println("---(" + length + " симв.)---\n");
                        length += nameZeroNine[((i/1000)-1)].toString().length();
                        length += nameThousand.length();

                        int q = nameZeroNine[((i/1000)-1)].toString().length();
                        int w = nameThousand.length();

                        int s = q + w;

                        System.out.println(i + " = " + nameZeroNine[((i/1000)-1)].toString()
                                + " "
                                + nameThousand
                                + " (" + s
                                + " симв.);"
                        );
                    }
                    break;
            }
        }

        System.out.println(" * * * * * * * * * * * * * * * * * * * * ");
        System.out.println("Для написания всех чисел от 1 до 1000 включительно, нужно " + length + " букв");
    }
}
