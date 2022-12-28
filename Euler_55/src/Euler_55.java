import java.math.BigInteger;

/**
 * Задача №55:
 *
 * Если взять число 47, перевернуть его и прибавить к исходному, т.е. найти 47 + 74 = 121, получится палиндром.
 *
 * Не из всех чисел таким образом сразу получается палиндром. К примеру,
 *
 * 349 + 943 = 1292
 * 1292 + 2921 = 4213
 * 4213 + 3124 = 7337
 *
 * Т.е., понадобилось 3 итерации для того, чтобы превратить число 349 в палиндром.
 *
 * Хотя никто еще этого не доказал, считается, что из некоторых чисел, таких как 196, невозможно получить палиндром.
 * Такое число, которое не образует палиндром путем переворачивания и сложения с самим собой, называется числом Личрэла.
 * Ввиду теоретической природы таких чисел, а также цели этой задачи, мы будем считать, что число является числом
 * Личрэла до тех пор, пока не будет доказано обратное. Помимо этого дано, что любое число меньше десяти тысяч либо
 * (1) станет палиндромом меньше, чем за 50 итераций, либо
 * (2) никто, с какой бы-то ни было вычислительной мощностью, не смог получить из него палиндром. Между прочим,
 * 10677 является первым числом, для которого необходимо более 50 итераций, чтобы получить палиндром:
 * 4668731596684224866951378664 (53 итерации, 28-значное число).
 *
 * На удивление, есть такие палиндромы, которые одновременно являются и числами Личрэла; первое такое число - 4994.
 *
 * Сколько существует чисел Личрэла меньше десяти тысяч?
 *
 * ПРИМЕЧАНИЕ: Формулировка задачи была немного изменена 24 апреля 2007 года, чтобы подчеркнуть теоретическую природу
 * чисел Личрэла.
 *
 */

public class Euler_55 {
    public static void main(String[] args){

        int maxNumber = 9_999;
        int LichrielNumber = 0;
        BigInteger newNum;

        // Перебор цифр от 1 до 9 999
        for (int number = 10; number <= maxNumber; number++) {
            // Перебор комбинаций
            newNum = BigInteger.valueOf(number);
            for (int i = 1; i <= 50; i++) {
                newNum = getNewNumber(newNum);
                if (isPolindrom(newNum)){
                    System.out.println(number + " -> " + newNum + " - полиндром в " + i + "-ой итерации;" );
                    i = 51;
                } else {
                    if (i == 49) {
                        LichrielNumber++;
                        System.out.println("*" + number + " - " + LichrielNumber + "-ое число Личрэла;");
                    }
                }
            }

        }

    }

    public static BigInteger getNewNumber(BigInteger number) {
        BigInteger newNumber;

        String[] value = String.valueOf(number).split("");
        String reverseNumber = "";
        for (int i = value.length-1; i >= 0; i--)
            reverseNumber += value[i];

        newNumber =  number.add(new BigInteger(reverseNumber));

        return newNumber;
    }

    public static boolean isPolindrom(BigInteger number){
        return String.valueOf(number).equals(new StringBuffer().append(String.valueOf(number)).reverse().toString());
    }
}
