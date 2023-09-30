package org.example;

public class Monkey implements Comparable<Monkey>{
		private String name;
		private int age;
		private String color;
		private boolean isHungry;
		private double weight;

		public Monkey(String name, int age, String color, boolean isHungry, double weight) {
				this.name = name;
				this.age = age;
				this.color = color;
				this.isHungry = isHungry;
				this.weight = weight;
		}

		public String getName() {
				return name;
		}

		public void setName(String name) {
				this.name = name;
		}

		public int getAge() {
				return age;
		}

		public void setAge(int age) {
				this.age = age;
		}

		public String getColor() {
				return color;
		}

		public void setColor(String color) {
				this.color = color;
		}

		public boolean isHungry() {
				return isHungry;
		}

		public void setHungry(boolean hungry) {
				isHungry = hungry;
		}

		public double getWeight() {
				return weight;
		}

		public void setWeight(double weight) {
				this.weight = weight;
		}

		@Override
		public String toString() {
				return "Monkey{" +
						       "name='" + name + '\'' +
						       ", age=" + age +
						       ", color='" + color + '\'' +
						       ", isHungry=" + isHungry +
						       ", weight=" + weight +
						       '}';
		}

		@Override
		public int compareTo(Monkey another) {
				int result = this.name.compareTo(another.name); // name
				if (result != 0) return result;

				result = this.age - another.age; // age
				if (result != 0) return result;

				result = this.color.compareTo(another.color); // colour
				if (result != 0) return result;

				result = (this.isHungry ? 1 : 0) - (another.isHungry ? 1 : 0); // isHungry
				return result;

		}
}


