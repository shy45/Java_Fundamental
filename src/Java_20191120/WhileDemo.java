package Java_20191120;

public class WhileDemo {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;// 초기값
		while (i <= 100) {
			sum += i;
			i++;// 증감
		}
		System.out.printf("1부터 100까지 합은 %d 입니다.", sum);

		int first = 2;
		while (first <= 9) {

			int second = 1;
			while (second <= 9) {

				System.out.printf("%d * %d = %d%n", first, second, first * second);

				second++;
			}

			first++;
		}
	}
}
