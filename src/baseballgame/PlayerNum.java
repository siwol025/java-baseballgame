package baseballgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PlayerNum {
    public String inputNum() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String playerNum = br.readLine();
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
