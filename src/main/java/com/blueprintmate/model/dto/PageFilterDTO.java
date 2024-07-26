package com.blueprintmate.model.dto;

public class PageFilterDTO {
    private int pageNumber;
    private int pageSize;
    private String sortBy;

    public PageFilterDTO() {
    }

    public PageFilterDTO(int pageNumber, int pageSize, String sortBy) {
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.sortBy = sortBy;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }
}
