
public class PothagrienThriple {

	public PothagrienThriple() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a^2+b^2=c^2
		int m = 1, n = 0, a = 0, b = 0, c = 0, sum = 0;
        int product = 0;

        for (m = 2; m < 100; m++) {
            for (n = 1; n < 100; n++) {

                while (m > n) {

                    a = (m * m) - (n * n);
                    b = (2 * m) * n;
                    c = (m * m) + (n * n);

                    sum = a + b + c;


                    if (sum == 1000) {
                        product = a * b * c;

                        System.out.print("a :" + a + "b :" + b + "c : " + c);
                        System.out.println("Product is" + product);
                        break;
                    }
                    break;
                }
            }
        }

	}

}
