package com.athena.common;

/**
 * Created by yangsheng on 2017/7/1.
 */
public class PageResult extends BaseResult {

    private static final long serialVersionUID = -2468091910818943962L;
    private int currentPage;

    private long pageSize;

    private long total;


    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public long getPageSize() {
        return pageSize;
    }

    public void setPageSize(long pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }
}
