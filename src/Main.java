public class Main {
    public static void main(String[] args) {
        //домашнее задание "1.7 Строки"
        //Задание 1
        String firstName = "";
        String middleName = "";
        String lastName = "";
        String fullName = "Ivanov Ivan Ivanovich";
        int sch = 0;
        for (int i = 0; fullName.length() > i; i++) {
            if (sch == 2) {
                lastName = lastName + fullName.charAt(i);
            }
            if (sch == 1) {
                if (fullName.charAt(i) == ' ') {
                    sch = 2;
                } else {
                    middleName = middleName + fullName.charAt(i);
                }
            }
            if (sch == 0) {
                if (fullName.charAt(i) == ' ') {
                    sch = 1;
                } else {
                    firstName = firstName + fullName.charAt(i);
                }
            }
        }
        //Быстрее и короче было бы с методом split() но в данном решении использовался только пройденный материал курса
        System.out.println("ФИО сотрудника - " + firstName + " " + middleName + " " + lastName);

        //Задание 2
        System.out.println("");
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + upperCaseFullName);

        //задание 3
        System.out.println("");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace('ё','е');
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}