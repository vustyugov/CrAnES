package com.ustyugov.core.interfaces;

import com.ustyugov.core.impls.cell.Cell;

import java.util.List;

/**
 * Created by VAUst on 25.06.2018.
 */
public interface Scanword {
    String getName();
    int getRows();
    int getColumns();
    Cell[][] getArray();
    boolean setArray(Cell[][] array);
    boolean setArrayElement(Cell cell, int row, int column);
    Cell getArrayElement(int row, int column);
    String getCreationTime();
    List<String> getChangingTime();
    void setChangingTime(String changingTime);
    void setBehavior(ScanwordBehavior behavior);
    ScanwordBehavior getBehavior();
}
