/**
 * Задача 51
 * Замена цифр в простом числе
 * Меняя первую цифру числа *3 (двузначного числа, заканчивающегося цифрой 3), оказывается, что шесть из девяти
 * возможных значений - 13, 23, 43, 53, 73 и 83 - являются простыми числами.
 * При замене третьей и четвертой цифры числа 56**3 одинаковыми цифрами, получаются десять чисел, из которых семь -
 * простые: 56003, 56113, 56333, 56443, 56663, 56773 и 56993. Число 56**3 является наименьшим числом, подставление
 * цифр в которое дает именно семь простых чисел. Соответственно, число 56003, будучи первым из полученных простых
 * чисел, является наименьшим простым числом, обладающим указанным свойством.
 *
 * Найдите наименьшее простое число, которое является одним из восьми простых чисел, полученных заменой части цифр
 * (не обязательно соседних) одинаковыми цифрами.
 */
public class Euler_51 {

    public static void main(String[] args){
        findAnswer();
    }

    private static void findAnswer() {

        String numberWithX = "AXXZ";
        int number;
        int count = 0;

        int firstNumber_A = 56;

        for (int a = firstNumber_A; a < 1000; a++){
            for (int z = 1; z <= 9; z++){
                if (isSimpleNuber(z)) {
                    for (int i = 0; i <= 9; i++) {
                        number = Integer.parseInt(numberWithX
                                .replace("X", String.valueOf(i))
                                .replace("A", String.valueOf(a))
                                .replace("Z", String.valueOf(z)));
                        if (isSimpleNuber(number))
                            System.out.println((++count) + ". " + number);
                    }
                    if (count > 7)
                        System.out.println("----------------------------------------------------------");
                    count = 0;
                }
            }
        }
    }

    private static boolean isSimpleNuber(int number) {
        int maxValue = number/2;
        for (int i = 2; i < maxValue; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
