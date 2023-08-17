package baseballgame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) throws IOException {

        RandomNum randomNum = new RandomNum();
        PlayerNum playerNum = new PlayerNum();
        List<Integer> computerNums = randomNum.create();
        Scanner scanner = new Scanner(System.in);

        while (true){
            List<Integer> playerNums = playerNum.createPlayerNum();
            int strikeCount = 0;
            int ballCount = 0;

            for (int i=0; i<playerNums.size(); i++){
                int pNum= playerNums.get(i);
                if (pNum == computerNums.get(i)){
                    strikeCount++;
                    continue;
                }

                if (computerNums.contains(pNum)){
                    ballCount++;
                }
            }

            String result = ballCount > 0 ? ballCount + "볼 " : "";
            result += strikeCount > 0 ? strikeCount +"스트라이크" : "";

            if (strikeCount == 0 && ballCount == 0){
                result = "낫싱";
            }

            System.out.println(result);

            if(strikeCount == 3){
                System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
                int command = scanner.nextInt();

                if (command == 2){
                    break;
                } else if (command == 1) {
                    computerNums = randomNum.create();
                }else {
                    throw new IllegalArgumentException("잘못된 커맨드입니다.");
                }

            }
        }


    }
}
