public class NumberSystem {

    // number should follow the conveting base property if we want to convert binary
    // to decimal number should be 1 and 0
    int number;

    NumberSystem(int n) {

        this.number = n;
    }

    public int decimalToBase(int base) {
        int p = 1;
        int sum = 0;
        int n = number;

        while (n > 0) {
            int rem = n % base;
            n /= base;
            sum += (rem * p);
            p *= 10;

        }
        return sum;
    }

    public int baseToDecimal(int base) {
        int p = 1;
        int sum = 0;
        int n = number;
        while (n > 0) {
            int rem = n % 10;
            n /= 10;
            sum += (rem * p);
            p *= base;

        }
        return sum;
    }

    public void baseToBase(int from, int to) {
        int temp = this.number;
        this.number = baseToDecimal(from);
        this.number = decimalToBase(to);
        System.out.println(number);
        this.number = temp;
    }

    public void add(int n1, int n2, int base) {
        int p = 1;
        int sum = 0, carry = 0;

        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = 0, d2 = 0, d = 0;
            if (n1 > 0) {
                d1 = n1 % 10;
                n1 /= 10;
            }
            if (n2 > 0) {
                d2 = n2 % 10;
                n2 /= 10;
            }

            d = (d1 + d2 + carry);
            carry = d / base;
            d %= base;
            sum += (d * p);
            p *= 10;

        }
        System.out.println(sum);
    }

    public void substract(int n1, int n2, int base) {
        int p = 1;
        int sum = 0, carry = 0;

        while (n1 > 0) {
            int d1 = 0, d2 = 0, d = 0;

            d1 = n1 % 10;
            n1 /= 10;
            d2 = n2 % 10;
            n2 /= 10;
            d1+=carry;
            if (d1 >= d2) {
                carry = 0;
                d = d1 - d2;
            } else {
                carry = -1;
                d = d1 + base - d2;
            }
            sum += (d * p);
            // System.out.println(sum);

            p *= 10;

        }
        System.out.println(sum);
    }
    public void multiply(int n1, int n2, int base) {
        int p = 1;
        int sum = 0, carry = 0;

        while (n1 > 0 || n2 > 0 || carry > 0) {
            int d1 = 0, d2 = 0, d = 0;
            if (n1 > 0) {
                d1 = n1 % 10;
                n1 /= 10;
            }
            if (n2 > 0) {
                d2 = n2 % 10;
                n2 /= 10;
            }

            d = (d1 * d2 + carry);
            carry = d / base;
            d %= base;
            sum += (d * p);
            p *= 10;

        }
        System.out.println(sum);
    }


}
