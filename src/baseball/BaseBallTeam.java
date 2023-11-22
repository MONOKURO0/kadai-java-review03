package baseball;

public class BaseBallTeam {
    /* フィールド */
    private String name; // チーム名
    private int win;  // 勝ち数
    private int lose; // 負け数
    private int draw; // 引き分け数

    /* コンストラクタ */
    // 引数無しのコンストラクタ（念のため記述）
    public BaseBallTeam() {
    }

    // 引数ありのコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win  = win;
        this.lose = lose;
        this.draw = draw;
    }

    /* メソッド */
    // 「勝ち数」と「負け数」から勝率を計算するメソッド
    public double getRate() {
        // 勝率を計算する
        double result = (double) this.win / (this.win + this.lose);

        return result;
    }

    // 勝敗情報の表示を行うメソッド
    public void report() {
        // 勝率を計算する
        double winper = getRate();

        // 勝敗情報の表示
        System.out.println(
                this.name + " の2022年の成績は" + this.win + "勝 " + this.lose + "敗 " + this.draw + "分、勝率は " + winper + "です。");
    }

}
