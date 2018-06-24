package com.ustyugov.core.impls.scanword;

import com.ustyugov.core.impls.cell.*;
import com.ustyugov.core.interfaces.*;

import java.util.*;

/**
 * Created by VAUst on 26.06.2018.
 */
public class SquaredScanword implements Scanword {
    private String name;
    private String creationTime;
    private List<String> changingTime;
    private Cell[][] array;
    private int rows;
    private int columns;
    private ScanwordBehavior behavior;

    public SquaredScanword (String name, int rows, int columns) {
        this.name = name;
        this.rows = rows;
        this.columns = columns;
        creationTime = (new Date()).toString();
        changingTime = new LinkedList<String>();
        array = new SimpleCell[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = new SimpleCell();
            }
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getRows() {
        return rows;
    }

    @Override
    public int getColumns() {
        return columns;
    }

    @Override
    public Cell[][] getArray() {
        return array;
    }

    @Override
    public boolean setArray(Cell[][] array) {
        if (array.length == rows && array[0].length == columns) {
            this.array = array;
            return true;
        }
        return false;
    }

    @Override
    public boolean setArrayElement(Cell cell, int row, int column) {
        if (row >= 0 && row < rows ) {
            if (column >= 0 && column < columns) {
                array[row][column] = cell;
                return true;
            }
        }
        return false;
    }

    @Override
    public Cell getArrayElement(int row, int column) {
        if ((row >= 0 && row < rows) &&
                (column >= 0 && column < columns)) {
            return array[row][column];
        }
        return null;
    }

    @Override
    public String getCreationTime() {
        return creationTime;
    }

    @Override
    public List<String> getChangingTime() {
        return changingTime;
    }

    @Override
    public void setChangingTime(String lastTimeChange) {
        this.changingTime.add(lastTimeChange);
    }

    @Override
    public void setBehavior(ScanwordBehavior behavior) {
        this.behavior = behavior;
    }

    @Override
    public ScanwordBehavior getBehavior() {
        return this.behavior;
    }
}
