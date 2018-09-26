package vn.codegym.QuyenLeSy;

public class RandomMain {
    public static void main(String[] args) {
        System.out.println("50 integer number: ");
        for(int i = 0; i < 50; i++){
            RandomTest randomTest = new RandomTest();
            System.out.println(randomTest.getRandom());
        }
    }
}
