package personal_project;

import java.util.*;

public class shopComparison extends shopList {

	public List<shopDTO> chickenOrderComparsion(List<shopDTO> chickenList) {
		int[] num = { chickenList.get(0).orderCount, chickenList.get(1).orderCount, chickenList.get(2).orderCount };
		for (int i = 0; i < chickenList.size(); i++) {
			for (int j = i + 1; j < chickenList.size(); j++) {
				if (num[i] < num[j]) {
					int var = num[i];
					num[i] = num[j];
					num[j] = var;
				}
			}
			for (int k = 0; k < chickenList.size(); k++) {
				if (num[i] == chickenList.get(k).orderCount) {
					System.out.println(chickenList.get(k).shopInfo);
				}
			}
		}
		return chickenList;
	}

	public List<shopDTO> chickenStarComparsion(List<shopDTO> chickenList) {
		int[] num = { chickenList.get(0).star, chickenList.get(1).star, chickenList.get(2).star };
		for (int i = 0; i < chickenList.size(); i++) {
			for (int j = i + 1; j < chickenList.size(); j++) {
				if (num[i] < num[j]) {
					int var = num[i];
					num[i] = num[j];
					num[j] = var;
				}
			}

			for (int k = 0; k < chickenList.size(); k++) {
				if (num[i] == chickenList.get(k).star) {
					System.out.println(chickenList.get(k).shopInfo);
				}
			}
		}
		return chickenList;
	}

	public List<shopDTO> chickenLeastComparsion(List<shopDTO> chickenList) {
		int[] num = { chickenList.get(0).leastMoney, chickenList.get(1).leastMoney, chickenList.get(2).leastMoney };
		for (int i = 0; i < chickenList.size(); i++) {
			for (int j = i + 1; j < chickenList.size(); j++) {
				if (num[i] > num[j]) {
					int var = num[i];
					num[i] = num[j];
					num[j] = var;
				}
			}

			for (int k = 0; k < chickenList.size(); k++) {
				if (num[i] == chickenList.get(k).leastMoney) {
					System.out.println(chickenList.get(k).shopInfo);
				}
			}
		}
		return chickenList;
	}


	public List<shopDTO> hamburgerOrderComparsion(List<shopDTO> hamburgerList) {
		int[] num = { hamburgerList.get(0).orderCount, hamburgerList.get(1).orderCount, hamburgerList.get(2).orderCount };
		for (int i = 0; i < hamburgerList.size(); i++) {
			for (int j = i + 1; j < hamburgerList.size(); j++) {
				if (num[i] < num[j]) {
					int var = num[i];
					num[i] = num[j];
					num[j] = var;
				}
			}
			for (int k = 0; k < hamburgerList.size(); k++) {
				if (num[i] == hamburgerList.get(k).orderCount) {
					System.out.println(hamburgerList.get(k).shopInfo);
				}
			}
		}
		return hamburgerList;
	}

	public List<shopDTO> hamburgerStarComparsion(List<shopDTO> hamburgerList) {
		int[] num = { hamburgerList.get(0).star, hamburgerList.get(1).star, hamburgerList.get(2).star };
		for (int i = 0; i < hamburgerList.size(); i++) {
			for (int j = i + 1; j < hamburgerList.size(); j++) {
				if (num[i] < num[j]) {
					int var = num[i];
					num[i] = num[j];
					num[j] = var;
				}
			}

			for (int k = 0; k < hamburgerList.size(); k++) {
				if (num[i] == hamburgerList.get(k).star) {
					System.out.println(hamburgerList.get(k).shopInfo);
				}
			}
		}
		return hamburgerList;
	}

	public List<shopDTO> hamburgerLeastComparsion(List<shopDTO> hamburgerList) {
		int[] num = { hamburgerList.get(0).leastMoney, hamburgerList.get(1).leastMoney, hamburgerList.get(2).leastMoney };
		for (int i = 0; i < hamburgerList.size(); i++) {
			for (int j = i + 1; j < hamburgerList.size(); j++) {
				if (num[i] > num[j]) {
					int var = num[i];
					num[i] = num[j];
					num[j] = var;
				}
			}

			for (int k = 0; k < hamburgerList.size(); k++) {
				if (num[i] == hamburgerList.get(k).leastMoney) {
					System.out.println(hamburgerList.get(k).shopInfo);
				}
			}
		}
		return hamburgerList;
	}


	public List<shopDTO> pizzaOrderComparsion(List<shopDTO> pizzaList) {
		int[] num = { pizzaList.get(0).orderCount, pizzaList.get(1).orderCount, pizzaList.get(2).orderCount };
		for (int i = 0; i < pizzaList.size(); i++) {
			for (int j = i + 1; j < pizzaList.size(); j++) {
				if (num[i] < num[j]) {
					int var = num[i];
					num[i] = num[j];
					num[j] = var;
				}
			}
			for (int k = 0; k < pizzaList.size(); k++) {
				if (num[i] == pizzaList.get(k).orderCount) {
					System.out.println(pizzaList.get(k).shopInfo);
				}
			}
		}
		return pizzaList;
	}

	public List<shopDTO> pizzaStarComparsion(List<shopDTO> pizzaList) {
		int[] num = { pizzaList.get(0).star, pizzaList.get(1).star, pizzaList.get(2).star };
		for (int i = 0; i < pizzaList.size(); i++) {
			for (int j = i + 1; j < pizzaList.size(); j++) {
				if (num[i] < num[j]) {
					int var = num[i];
					num[i] = num[j];
					num[j] = var;
				}
			}

			for (int k = 0; k < pizzaList.size(); k++) {
				if (num[i] == pizzaList.get(k).star) {
					System.out.println( pizzaList.get(k).shopInfo);
				}
			}
		}
		return pizzaList;
	}

	public List<shopDTO> pizzaLeastComparsion(List<shopDTO> pizzaList) {
		int[] num = { pizzaList.get(0).leastMoney, pizzaList.get(1).leastMoney, pizzaList.get(2).leastMoney };
		for (int i = 0; i < pizzaList.size(); i++) {
			for (int j = i + 1; j < pizzaList.size(); j++) {
				if (num[i] > num[j]) {
					int var = num[i];
					num[i] = num[j];
					num[j] = var;
				}
			}

			for (int k = 0; k < pizzaList.size(); k++) {
				if (num[i] == pizzaList.get(k).leastMoney) {
					System.out.println(pizzaList.get(k).shopInfo);
				}
			}
		}
		return pizzaList;
	}

}
