package com.ustyugov.core.interfaces;

import java.util.List;

/**
 * Created by VAUst on 25.06.2018.
 */
public interface ScanwordBehavior {
    List<String> getPossibleArrowsForCommentCell(int row, int column);
    List<String> getPossibleCellVariantChanging(int row, int column);
    void automaticDefinitionArrows();
}
