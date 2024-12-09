package chap2_5.fileio.objstream;

import chap2_5.fileio.FileExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;

public class SaveSnack {

    public static void main(String[] args) {

        // 과자들을 그냥 텍스트로 분할해서 세이브하는게 아니라
        // 과자 객체를 통채로 세이브파일에 저장하고 싶다.
        List<Snack> snackList = List.of(
                new Snack("콘칲", 1970, 1500, Snack.Taste.GOOD)
                , new Snack("오징어집", 1985, 1800, Snack.Taste.GOOD)
                , new Snack("사브레", 1980, 3000, Snack.Taste.BAD)
        );

        try (FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH + "/snack.sav")) {
            // 객체를 바이트로 변환해주는 보조 스트림
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            // 객체가 스트림을 통과하려면 직렬화라는 개념이 필요함
            oos.writeObject(snackList);
            System.out.println("객체 저장 성공!");

        } catch (Exception e) {
           e.printStackTrace();
        }

    }
}
