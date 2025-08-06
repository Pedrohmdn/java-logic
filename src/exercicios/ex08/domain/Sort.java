package exercicios.ex08.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    private List<Integer> nums = new ArrayList<Integer>();

    public Sort(int num1, int num2, int num3) {
        this.nums.add(num1);
        this.nums.add(num2);
        this.nums.add(num3);
    }

    @Override
    public String toString() {
        Collections.sort(nums, Collections.reverseOrder());
        return "Números ordenados: " + nums;
    }
}
