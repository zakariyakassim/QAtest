package com.company;

public class Die implements DieFace {

    private int value;

    public String getGraphicalValue() {

        if (value == 1) {
            return ("\n   *\n");
        }
        if (value == 2) {
            return ("\n  *  \n    *\n");
        }
        if (value == 3) {
            return (" *    \n   *  \n     *");
        }
        if (value == 4) {
            return ("\n *   *\n *   *\n");
        }
        if (value == 5) {
            return (" *   *\n   *  \n *   *");
        }
        if (value == 6) {
            return (" *   *\n *   *\n *   *");
        }

        return "";

    }


    @Override
    public void setValue(int ref) {
        value = ref;
    }


    @Override
    public int getValue() {

        return value;
    }


}

