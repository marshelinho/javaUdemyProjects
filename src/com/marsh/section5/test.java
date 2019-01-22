package com.marsh.section5;

public class test {
    public static void main(String[] args) {



    }


    public static int getDigitCount(int n) {
        if (n < 0)
            return -1;

        if (n == 0)
            return 1;

        int count = 0;
        while (n != 0) {
            ++count;
            n /= 10;
        }

        return count;
    }

    public static int reverse(int n) {
        int reverseNum = 0;

        while (n != 0) {
            int dig = n % 10;
            reverseNum = reverseNum * 10 + dig;
            n /= 10;
        }

        return reverseNum;
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int count = getDigitCount(number);
        int reverseNum = reverse(number);

        int i = 0;
        while (reverseNum != 0) {
            int dig = reverseNum % 10;

            switch (dig) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            reverseNum /= 10;
            ++i;
        }

        for (int j = 0; j < count - i; ++j) {
            System.out.println("Zero");
        }
    }


    public static boolean isPerfectNumber(int number) {
        if (number > 1) {
            int count = 1;
            int sum = 0;
            while (count <= number / 2) {
                if (number % count == 0) {
                    int divider = count;
                    sum += divider;
                }
                count++;
            }
            if (sum == number) {
                return true;
            }
        }
        return false;
    }

    public static int printFactors(int number) {
        if (number > 1) {
            int count = 1;
            while (count <= number) {
                if (number % count == 0) {
                    int divider = number / count;
                    System.out.println(divider);
                }
                count++;
            }
        }

        return number;
    }


    public static boolean hasSameLastDigit(int a, int b, int c) {
        if ((a >= 10) && (b >= 10) && (c >= 10)) {
            if ((a <= 1000) && (b <= 1000) && (c <= 1000)) {
                return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
            }
        }
        return false;
    }


    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 >= 10) && (number2 >= 10)) {
            if ((number1 <= 99) && (number2 <= 99)) {
                return (number1 / 10 == number2 / 10) || (number1 / 10 == number2 % 10) || (number1 % 10 == number2 / 10) || (number1 % 10 == number2 % 10);
            }
        }
        return false;

    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;

        int sum = 0;
        while (number > 9) {
            number /= 10;
            sum = lastDigit + number;
        }
        return sum;
    }


    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit;

            number /= 10;
        }

        return sum;

    }

    public static boolean isPalindrome(int number) {
        int reversed = 0;
        int startingNumber = number;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return (startingNumber == reversed);
    }


}