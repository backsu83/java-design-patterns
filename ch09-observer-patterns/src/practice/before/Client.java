package practice.before;

public class Client {
    public static void main(String[] args) {

        ScoreRecord scoreRecord = new ScoreRecord();    // 점수 저장 객체 생성
        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);    // 3개까지 점수만 출력

        scoreRecord.setDataSheetView(dataSheetView);    // 점수 시트 설정

        for (int i = 1; i <= 5; i++) {
            int score = i * 10;
            System.out.println("adding " + score);  // 점수추가
            scoreRecord.addScore(score);    // 저장된 점수목록 출력
        }

    }
}
