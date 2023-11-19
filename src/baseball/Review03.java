package baseball;

public class Review03 {

    public static void main(String[] args) {
        /*
         2022年のプロ野球セントラル・リーグの勝敗表データを元に、
         各球団のBaseBallTeamインスタンスを生成
        */
        BaseBallTeam team_swallows = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);
        BaseBallTeam team_baystars = new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2);
        BaseBallTeam team_tigers   = new BaseBallTeam("阪神タイガース", 68, 71, 4);
        BaseBallTeam team_giants   = new BaseBallTeam("読売ジャイアンツ", 68, 72, 3);
        BaseBallTeam team_carp     = new BaseBallTeam("広島東洋カープ", 66, 74, 3);
        BaseBallTeam team_dragons  = new BaseBallTeam("中日ドラゴンズ", 66, 75, 2);

        // 各球団の成績表示
        team_swallows.report();
        team_baystars.report();
        team_tigers.report();
        team_giants.report();
        team_carp.report();
        team_dragons.report();
    }

}
