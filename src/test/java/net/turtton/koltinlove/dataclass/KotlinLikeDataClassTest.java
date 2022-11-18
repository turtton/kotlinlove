package net.turtton.koltinlove.dataclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KotlinLikeDataClassTest {

    KotlinLikeDataClass dataClass = new KotlinLikeDataClass(1, "str", false);

    @Test
    void getNum() {
        assert dataClass.getNum() == 1;
    }

    @Test
    void getStr() {
        assert dataClass.getStr().equals("str");
    }

    @Test
    void getBool() {
        assert !dataClass.getBool();
    }
}