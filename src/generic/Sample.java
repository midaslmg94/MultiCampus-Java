package generic;

public class Sample {
    public static void main(String[] args) {
        int key =123;
        int value = 456;
        Entry<Integer,Integer> e = new Entry<>(key,value); // 객체가 생성되는 과정에서 데이터 타입을 정함
        int key2 = e.getKey();
        int value2 = e.getValue();
        System.out.println(key2 +","+value2);

    }
}
