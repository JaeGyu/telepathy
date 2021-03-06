package chapter3.insertsort;
import chapter3.*;
/**
 * @author miracle
 */
public class JungWooInsertSort implements Sort{
    @Override
    public void sort(int[] input) {
        for (int i=1; i<input.length; i++) {
            int j = i-1;
            int key = input[j+1];
            // i 부터 0까지 j+1보다 j가 크면 스왑. j+1은 i이고,
            // 비교할 대상은 고정 따라서 while문이 돌기전의 input[j+1]의 값으로 교체 가능
            while (j >= 0 && key < input[j]) {
                int tmp = input[j];
                input[j] = input[j +1];
                input[j+1] = tmp;
                j--;
            }

        }
    }
}
