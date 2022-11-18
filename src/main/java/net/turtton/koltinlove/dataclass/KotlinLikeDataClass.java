package net.turtton.koltinlove.dataclass;

import java.util.Objects;

public class KotlinLikeDataClass {
    private final int num;
    private final String str;
    private final boolean bool;

    public KotlinLikeDataClass(int num, String str, boolean bool) {
        this.num = num;
        this.str = str;
        this.bool = bool;
    }

    public int getNum() {
        return num;
    }

    public String getStr() {
        return str;
    }

    public boolean getBool() {
        return bool;
    }

    public KotlinLikeDataClass copy(Integer num, String str, Boolean bool) {
        var finalNum = num == null ? this.num : num;
        var finalString = str == null ? this.str : str;
        var finalBool = bool == null ? this.bool : bool;
        return new KotlinLikeDataClass(finalNum, finalString, finalBool);
    }

    @Override
    public String toString() {
        return "KotlinLikeDataClass(num=" + num + ", str=" + str + ", bool=" + bool + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KotlinLikeDataClass that = (KotlinLikeDataClass) o;
        return num == that.num && bool == that.bool && Objects.equals(str, that.str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, str, bool);
    }
}
