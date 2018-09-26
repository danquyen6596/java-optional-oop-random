package vn.codegym.QuyenLeSy;

import java.util.Random;

public class RandomTest {
    Random rd = new Random();
    private int var = rd.nextInt(100);
    public RandomTest(){

    }

    public int getRandom(){
        return this.var;
    }
}
