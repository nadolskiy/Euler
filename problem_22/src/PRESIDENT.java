import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class PRESIDENT
{
    public static void main(String args[])
    {
        String pathFile = "names.txt";

        String names = "";

        BufferedReader br = null;
        {
            try
            {
                br = new BufferedReader(new FileReader(pathFile));

                String sCurrentLine;
                int i = 0;

                while ((sCurrentLine = br.readLine())!=null)
                {
                    names = sCurrentLine.toString();

                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //System.out.println(names.toString());


        String nam = names.replace("\"", "");

        String[] aNames = nam.split(",");

        Arrays.sort(aNames);

        int k = 0;
        int nNumb = 0;
        BigInteger res = BigInteger.valueOf(0);

        for (int i = 0; i < aNames.length; i++)
        {
            System.out.println((i+1) + " - " + aNames[i]);

            String[] name = aNames[i].split("");


            for (int j = 1; j < name.length; j++)
            {
                String s = name[j].toLowerCase();
                if (s.equals("a")) {  nNumb = 1;
                } else if (s.equals("b")) { nNumb = 2;
                } else if (s.equals("c")) { nNumb = 3;
                } else if (s.equals("d")) { nNumb = 4;
                } else if (s.equals("e")) { nNumb = 5;
                } else if (s.equals("f")) { nNumb = 6;
                } else if (s.equals("g")) { nNumb = 7;
                } else if (s.equals("h")) { nNumb = 8;
                } else if (s.equals("i")) { nNumb = 9;
                } else if (s.equals("j")) { nNumb = 10;
                } else if (s.equals("k")) { nNumb = 11;
                } else if (s.equals("l")) { nNumb = 12;
                } else if (s.equals("m")) { nNumb = 13;
                } else if (s.equals("n")) { nNumb = 14;
                } else if (s.equals("o")) { nNumb = 15;
                } else if (s.equals("p")) { nNumb = 16;
                } else if (s.equals("q")) { nNumb = 17;
                } else if (s.equals("r")) { nNumb = 18;
                } else if (s.equals("s")) { nNumb = 19;
                } else if (s.equals("t")) { nNumb = 20;
                } else if (s.equals("u")) { nNumb = 21;
                } else if (s.equals("v")) { nNumb = 22;
                } else if (s.equals("w")) { nNumb = 23;
                } else if (s.equals("x")) { nNumb = 24;
                } else if (s.equals("y")) { nNumb = 25;
                } else if (s.equals("z")) { nNumb = 26;
                }

                k += nNumb;

                System.out.println(j + " - " + name[j] + " : " + nNumb);
            }



            res = res.add(BigInteger.valueOf(k * (i+1)));
            k = 0;
            System.out.println(res);

        }



       // System.out.println(Arrays.toString(aNames));

       // System.out.println(aNames.length);
    }
}
