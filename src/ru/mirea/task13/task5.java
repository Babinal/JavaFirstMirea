package ru.mirea.task13;
import java.util.*;

class PhoneNumberFormat {
    String telephone;

    public PhoneNumberFormat(String telephone) {
        this.telephone = telephone;
    }

    public String getFormat() {
        if (!telephone.isEmpty()) {
            String TenNumber = telephone.substring(telephone.length()-10);
            String code;
            if (telephone.charAt(0) == '+') {
                code = (String)telephone.substring(1, telephone.length()-10);
            } else if (telephone.charAt(0) == '8') {
                code = "7";
            } else {
                return "Ошибка! Неизвестный код страны!";
            }
            String FirstThreeNumbers = TenNumber.substring(0,3);
            String SecondThreeNumbers = TenNumber.substring(3,6);
            String FourNumbers = TenNumber.substring(6, 10);
            return String.format("+%s %s-%s-%s",
                    code, FirstThreeNumbers, SecondThreeNumbers, FourNumbers);
        } else {
            return "Не введёт номер телефона";
        }
    }
}

public class task5 {
    public static void main(String[] args) {
        System.out.print("Введите номер телефона для форматизации: ");
        Scanner src = new Scanner(System.in);
        PhoneNumberFormat telephone = new PhoneNumberFormat(src.next());
        System.out.println("Отформатированный номер: " + telephone.getFormat());
    }
}
