package problem.q1;

// 도시를 나타낸다

import java.util.*;

public class City {
	// 도시 이름
	private String cityName;

	// 도시 인구
	private int population;

	// 도시의 인구 증가율
	private double growthRate;

	// 도시 이름, 인구와 인구 증가율을 읽어 들인다
	public void readInput() {
		Scanner keyboard = new Scanner(System.in);

		// 도시 이름을 읽어 들인다
		System.out.print("도시 이름을 입력하세요: ");
		cityName = keyboard.next();

		// 도시의 인구를 읽어 들인다
		// 인구가 음수인 동안 계속 인구를 읽어 들인다
		// 여기에 코드를 삽입하세요
		boolean run = false;
		while (!run) {
			System.out.print("도시 인구를 입력하세요: ");
			population = keyboard.nextInt();
			if (population > 0) {
				run = true;
				break;
			} else {
				System.out.println("인구는 음수일 수 없습니다.");
				continue;
			}
		}
		// 도시의 인구 증가율을 읽어 들인다
		// 여기에 코드를 삽입하세요
		System.out.print("인구 증가율(%)을 입력하세요: ");
		growthRate = keyboard.nextDouble();
	}

	// 도시 이름, 인구와 인구 증가율을 출력한다
	public void writeOutput() {
		// 여기에 코드를 삽입하세요
		System.out.println("도시 이름 : " + cityName);
		System.out.println("인구 : " + population);
		System.out.println("인구 증가율 : " + growthRate + "%");
	}

	// 주어진 연도 후의 예상 인구를 계산한다
	public int computeFuturePopulation(int years) {
		// 예상 인구
		double populationAmount = population;

		// 연도
		int count = years;

		// 주어진 연도 후의 예상 인구를 계산한다
		// 여기에 코드를 삽입하세요
		while ((count > 0) && (populationAmount > 0)) {
			populationAmount = (populationAmount + ((growthRate / 100) * populationAmount));
			count--;
		}
		// 예상 인구를 반환한다
		// 여기에 코드를 삽입하세요
		if (populationAmount > 0) {
			return (int)populationAmount;
		} else {
			return 0;
		}
	}

	// 도시 이름을 주어진 값으로 변경한다
	public void setName(String newName) {
		cityName = newName;
	}

	// 도시 인구를 주어진 값으로 변경한다
	public void setPopulation(int newPopulation) {
		// 여기에 코드를 삽입하세요
		population = newPopulation;
	}

	// 도시 인구 증가율을 주어진 값으로 변경한다
	public void setGrowthRate(double newGrowthRate) {
		// 여기에 코드를 삽입하세요
		growthRate = newGrowthRate;
	}

	// 도시 이름을 반환한다
	public String getName() {
		return cityName;
	}

	// 도시 인구를 반환한다
	public int getPopulation() {
		// 여기에 코드를 삽입하세요
		return population;
	}

	// 도시 인구 증가율을 반환한다
	public double getGrowthRate() {
		// 여기에 코드를 삽입하세요
		return growthRate;
	}
}
