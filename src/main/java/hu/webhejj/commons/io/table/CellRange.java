package hu.webhejj.commons.io.table;

import java.lang.Override;
import java.lang.String;

public class CellRange {
    private CellAddress start;
    private CellAddress end;

    public CellRange() {
    }

    public CellRange(CellAddress start, CellAddress end) {
        this.start = start;
        this.end = end;
    }

    public CellAddress getStart() {
        return start;
    }

    public void setStart(CellAddress start) {
        this.start = start;
    }

    public CellAddress getEnd() {
        return end;
    }

    public void setEnd(CellAddress end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return (start == null ? "" : start.toString()
                + ":"
                + (end == null ? "" : end.toString()));
    }
}
