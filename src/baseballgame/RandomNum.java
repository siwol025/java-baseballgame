package baseballgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNum {
    public int generateRandomNum(){
        Random random = new Random();
        return  random.nextInt(9) + 1;
    }

    public List<Integer> create(){
        List<Integer> computerNums = new ArrayList<>();

        while (computerNums.size()<3){
            int randomNum = generateRandomNum();

            if (computerNums.contains(randomNum)){
                continue;
            }
            computerNums.add(randomNum);

        }
        return computerNums;
    }

}
