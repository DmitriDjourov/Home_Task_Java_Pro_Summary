package org.example;
import java.util.*;
public class ComparatorByWeightName implements Comparator<Monkey>{
		@Override
		public int compare(Monkey o1, Monkey o2) {
				int weightMankeysComparison = Double.compare(o1.getWeight(),o2.getWeight());
				if(weightMankeysComparison == 0 ){
						return o1.getName().compareTo(o2.getName());
				}
				return weightMankeysComparison;
		}
}
