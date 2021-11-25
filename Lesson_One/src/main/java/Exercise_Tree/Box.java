package Exercise_Tree;

import java.util.ArrayList;

public class Box <ObjApple extends Fruit, ObjOrange extends Fruit> implements Fruit {

    public ArrayList<ObjApple> BoxForApple (ObjApple [] arrayApple) {
        ArrayList<ObjApple> arrayListForApple = new ArrayList<>();
        for (int i = 0; i <= arrayApple.length; i++) {
            arrayListForApple.add(arrayApple[i]);
        }
        return arrayListForApple;
    }

    public ArrayList<ObjOrange> BoxForOrange (ObjOrange [] arrayOrange) {
        ArrayList<ObjOrange> arrayListForOrange = new ArrayList<>();
        for (int i = 0; i <= arrayOrange.length; i++) {
            arrayListForOrange.add(arrayOrange[i]);
        }
        return arrayListForOrange;
    }

    public float getWeightApple (ArrayList<ObjApple> arrayListForApple) {
        float sizeBoxApple = weightApple * arrayListForApple.size();
        return sizeBoxApple;
    }

    public float getWeightOrange (ArrayList<ObjOrange> arrayListForOrange) {
        float sizeBoxOrange = weightOrange * arrayListForOrange.size();
        return sizeBoxOrange;
    }

    public boolean compare (float sizeBoxApple, float sizeBoxOrange, float getCompareBoxRandom) {
        if (sizeBoxApple > getCompareBoxRandom || sizeBoxApple < getCompareBoxRandom || sizeBoxOrange > getCompareBoxRandom || sizeBoxOrange < getCompareBoxRandom) {
           return false;
        } else {
            return true;
        }
    }

    public ArrayList<ObjApple> addingApple (ArrayList<ObjApple> arrApple, ObjApple [] arrayListForApple) {
            for (int i = 0; i < arrayListForApple.length; i++) {
                arrApple.add(arrayListForApple[i]);
            }
            return arrApple;
    }

    public ArrayList<ObjOrange> addingOrange (ArrayList<ObjOrange> arrOrange, ObjOrange [] arrayListForOrange) {
            for (int i = 0; i < arrayListForOrange.length; i++) {
                arrOrange.add(arrayListForOrange[i]);
            }
            return arrOrange;
    }

    public ArrayList<ObjApple> addingOneApple (ArrayList<ObjApple> arrApple, ObjApple arrayListForApple) {
        arrApple.add(1, arrayListForApple);
        return arrApple;
    }

    public ArrayList<ObjOrange> addingOneOrange (ArrayList<ObjOrange> arrOrange, ObjOrange arrayListForOrange) {
        arrOrange.add(1, arrayListForOrange);
        return arrOrange;
    }
}
