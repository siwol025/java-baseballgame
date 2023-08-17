package baseballgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PlayerNum {
    public String inputNum() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("숫자를 입력해주세요 : ");
        String playerNum = br.readLine();
        try {
            Integer.parseInt(playerNum);
            if (playerNum.length() != 3){
                throw new IllegalArgumentException("잘못된 값을 입력했습니다.");
            }
        }catch (Exception e){
            throw new IllegalArgumentException("잘못된 값을 입력했습니다.");
        }

        return playerNum;

    }

    public List<Integer> createPlayerNum() throws IOException{
        String playerNum = inputNum();
        List<Integer> playerNums = new ArrayList<>();

        for (int i=0; i<playerNum.length(); i++){
            playerNums.add(Integer.parseInt(playerNum.charAt(i)+""));

        }

        return playerNums;
    }
}
