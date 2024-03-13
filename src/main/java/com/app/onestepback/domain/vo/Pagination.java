package com.app.onestepback.domain.vo;

import lombok.Data;

@Data
public class Pagination {
    private Integer page;
    private int startRow;
    private int endRow;
    private int rowCount;
    private int pageCount;
    private int startPage;
    private int endPage;
    private int realEnd;
    private boolean prev, next;
    private int total;

    public Pagination(Integer page, int rowCount, int total) {
        this.page = page;
        this.rowCount = rowCount;
        this.total = total;
        this.progress();
    }

    public void progress() {
        this.page = page == null ? 1 : page;
        this.pageCount = 5;
        this.endRow = page * rowCount;
        this.startRow = endRow - rowCount + 1;
        this.endPage = (int)(Math.ceil(page / (double)pageCount) * pageCount);
        this.startPage = endPage - pageCount + 1;
        this.realEnd = (int)Math.ceil(total / (double)rowCount);
        if(realEnd < endPage) {
            endPage = realEnd == 0 ? 1 : realEnd;
        }
        this.prev = startPage > 1;
        this.next = endPage < realEnd;
    }
}
