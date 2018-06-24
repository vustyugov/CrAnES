package com.ustyugov.core.impls.cell;

/**
 * Created by VAUst on 25.06.2018.
 */
public class DisableCell extends Cell {
    public DisableCell () {
        lettersReg = "";
        linkReg = "";
        setLetters("");
        setFirstLink("");
        setSecondLink("");
    }

    @Override
    public boolean setLink(String link) {
        return false;
    }

    @Override
    public int countFreeLinks() {
        return 0;
    }

}
