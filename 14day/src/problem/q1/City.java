package problem.q1;

// ���ø� ��Ÿ����

import java.util.*;

public class City {
	// ���� �̸�
	private String cityName;

	// ���� �α�
	private int population;

	// ������ �α� ������
	private double growthRate;

	// ���� �̸�, �α��� �α� �������� �о� ���δ�
	public void readInput() {
		Scanner keyboard = new Scanner(System.in);

		// ���� �̸��� �о� ���δ�
		System.out.print("���� �̸��� �Է��ϼ���: ");
		cityName = keyboard.next();

		// ������ �α��� �о� ���δ�
		// �α��� ������ ���� ��� �α��� �о� ���δ�
		// ���⿡ �ڵ带 �����ϼ���
		boolean run = false;
		while (!run) {
			System.out.print("���� �α��� �Է��ϼ���: ");
			population = keyboard.nextInt();
			if (population > 0) {
				run = true;
				break;
			} else {
				System.out.println("�α��� ������ �� �����ϴ�.");
				continue;
			}
		}
		// ������ �α� �������� �о� ���δ�
		// ���⿡ �ڵ带 �����ϼ���
		System.out.print("�α� ������(%)�� �Է��ϼ���: ");
		growthRate = keyboard.nextDouble();
	}

	// ���� �̸�, �α��� �α� �������� ����Ѵ�
	public void writeOutput() {
		// ���⿡ �ڵ带 �����ϼ���
		System.out.println("���� �̸� : " + cityName);
		System.out.println("�α� : " + population);
		System.out.println("�α� ������ : " + growthRate + "%");
	}

	// �־��� ���� ���� ���� �α��� ����Ѵ�
	public int computeFuturePopulation(int years) {
		// ���� �α�
		double populationAmount = population;

		// ����
		int count = years;

		// �־��� ���� ���� ���� �α��� ����Ѵ�
		// ���⿡ �ڵ带 �����ϼ���
		while ((count > 0) && (populationAmount > 0)) {
			populationAmount = (populationAmount + ((growthRate / 100) * populationAmount));
			count--;
		}
		// ���� �α��� ��ȯ�Ѵ�
		// ���⿡ �ڵ带 �����ϼ���
		if (populationAmount > 0) {
			return (int)populationAmount;
		} else {
			return 0;
		}
	}

	// ���� �̸��� �־��� ������ �����Ѵ�
	public void setName(String newName) {
		cityName = newName;
	}

	// ���� �α��� �־��� ������ �����Ѵ�
	public void setPopulation(int newPopulation) {
		// ���⿡ �ڵ带 �����ϼ���
		population = newPopulation;
	}

	// ���� �α� �������� �־��� ������ �����Ѵ�
	public void setGrowthRate(double newGrowthRate) {
		// ���⿡ �ڵ带 �����ϼ���
		growthRate = newGrowthRate;
	}

	// ���� �̸��� ��ȯ�Ѵ�
	public String getName() {
		return cityName;
	}

	// ���� �α��� ��ȯ�Ѵ�
	public int getPopulation() {
		// ���⿡ �ڵ带 �����ϼ���
		return population;
	}

	// ���� �α� �������� ��ȯ�Ѵ�
	public double getGrowthRate() {
		// ���⿡ �ڵ带 �����ϼ���
		return growthRate;
	}
}
